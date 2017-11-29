package almoxarifadovirtual.servidor.servico;

import almoxarifadovirtual.servidor.modelo.autenticacao.Credenciais;
import almoxarifadovirtual.servidor.util.UsuarioException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class ServicoLdap {

  private List<String[]> usuariosLdap;

  public ServicoLdap() {
    this.usuariosLdap = new ArrayList<String[]>();
    this.usuariosLdap.add(new String[] {"Matteus", "passwd-admin"});
    this.usuariosLdap.add(new String[] {"Alessandro", "passwd-almoxarife"});
    this.usuariosLdap.add(new String[] {"Lucas", "passwd-almoxarife"});
    this.usuariosLdap.add(new String[] {"Bernard", "passwd-prestador"});
    this.usuariosLdap.add(new String[] {"Rafael", "passwd-prestador"});
  }

  public boolean ehUsuarioLdap(Credenciais credenciais) {
    for (String[] usuario : usuariosLdap) {
      if (usuario[0].equals(credenciais.getLogin()) && usuario[1].equals(credenciais.getSenha())) {
        return true;
      }
    }
    throw new UsuarioException();

  }

  /**
   * Método que verifica se o nome do usuário está cadastrado no LDAP.
   * @param nome - Nome a ser verificado.
   * @return True se o nome do usuário está cadastrado no sistema.
   * @throws UsuarioException caso o usuário não exista no sistema.
   */
  public boolean existeUsuario(String nome) {
    for (String[] usuario : usuariosLdap) {
      if (usuario[0].equals(nome)) {
        return true;
      }
    }
    throw new UsuarioException();
  }
}