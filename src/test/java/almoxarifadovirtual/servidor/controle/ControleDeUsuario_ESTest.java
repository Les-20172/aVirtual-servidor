/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 02 19:50:57 GMT 2018
 */

package almoxarifadovirtual.servidor.controle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import almoxarifadovirtual.servidor.controle.ControleDeAutenticacao;
import almoxarifadovirtual.servidor.controle.ControleDeUsuario;
import almoxarifadovirtual.servidor.modelo.autenticacao.Token;
import almoxarifadovirtual.servidor.modelo.usuario.FuncaoUsuario;
import almoxarifadovirtual.servidor.modelo.usuario.Usuario;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeToken;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeUsuario;
import almoxarifadovirtual.servidor.servico.ServicoLdap;
import almoxarifadovirtual.servidor.servico.ServicoToken;
import almoxarifadovirtual.servidor.servico.ServicoUsuario;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControleDeUsuario_ESTest extends ControleDeUsuario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Long long0 = new Long(1006L);
      // Undeclared exception!
      try { 
        controleDeUsuario0.removerUsuario(long0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token inv\u00E1lido!
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeAutenticacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Long long0 = new Long((-1449L));
      // Undeclared exception!
      try { 
        controleDeUsuario0.getUsuarioPelaId(long0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token inv\u00E1lido!
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeAutenticacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        controleDeUsuario0.getUsuarioPelaId(long0, "B,KL^xwzS$;Z|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeUsuario", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      // Undeclared exception!
      try { 
        controleDeUsuario0.getAll("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token inv\u00E1lido!
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeAutenticacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      Token token0 = new Token();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Usuario usuario0 = new Usuario();
      // Undeclared exception!
      try { 
        controleDeUsuario0.criarUsuario(usuario0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.modelo.autenticacao.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(0L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(repositorioDeUsuario0).findOne(anyLong());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Usuario usuario0 = new Usuario();
      // Undeclared exception!
      try { 
        controleDeUsuario0.atualizarUsuario(usuario0, "W:#}tFW`MfhOw");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoUsuario", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long((-1L));
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      FuncaoUsuario funcaoUsuario0 = FuncaoUsuario.ADMINISTRADOR;
      Usuario usuario0 = new Usuario("", funcaoUsuario0);
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(repositorioDeUsuario0).exists(anyLong());
      doReturn(usuario0).when(repositorioDeUsuario0).findOne(anyLong());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      ResponseEntity<Boolean> responseEntity0 = controleDeUsuario0.atualizarUsuario(usuario0, "b");
      assertTrue(responseEntity0.hasBody());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(0L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0, (Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      Usuario usuario0 = new Usuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      doReturn(usuario0).when(repositorioDeUsuario0).findOne(anyLong());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      // Undeclared exception!
      try { 
        controleDeUsuario0.getUsuarioPelaId(long0, "Y!]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // O usu\u00E1rio n\u00E3o permiss\u00E3o para executar a opera\u00E7\u00E3o desejada!
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeAutenticacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      // Undeclared exception!
      try { 
        controleDeUsuario0.getAll("LfK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeUsuario", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      Token token0 = new Token();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Long long0 = new Long((-455L));
      // Undeclared exception!
      try { 
        controleDeUsuario0.removerUsuario(long0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.modelo.autenticacao.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ControleDeUsuario controleDeUsuario0 = new ControleDeUsuario();
      ControleDeAutenticacao controleDeAutenticacao0 = new ControleDeAutenticacao();
      ServicoLdap servicoLdap0 = new ServicoLdap();
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoLdap", (Object) servicoLdap0);
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoToken", (Object) servicoToken0);
      ServicoUsuario servicoUsuario0 = new ServicoUsuario();
      RepositorioDeUsuario repositorioDeUsuario0 = mock(RepositorioDeUsuario.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoUsuario0, (Class<?>) ServicoUsuario.class, "repositorio", (Object) repositorioDeUsuario0);
      Injector.validateBean(servicoUsuario0, (Class<?>) ServicoUsuario.class);
      Injector.inject(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeAutenticacao0, (Class<?>) ControleDeAutenticacao.class);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "controleDeAutenticacao", (Object) controleDeAutenticacao0);
      Injector.inject(controleDeUsuario0, (Class<?>) ControleDeUsuario.class, "servicoUsuario", (Object) servicoUsuario0);
      Injector.validateBean(controleDeUsuario0, (Class<?>) ControleDeUsuario.class);
      Usuario usuario0 = new Usuario();
      // Undeclared exception!
      try { 
        controleDeUsuario0.criarUsuario(usuario0, "Umsoh@|$FPdu{8~s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token inv\u00E1lido!
         //
         verifyException("almoxarifadovirtual.servidor.controle.ControleDeAutenticacao", e);
      }
  }
}
