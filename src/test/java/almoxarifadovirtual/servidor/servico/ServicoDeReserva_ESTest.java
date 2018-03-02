/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 02 19:46:20 GMT 2018
 */

package almoxarifadovirtual.servidor.servico;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import almoxarifadovirtual.servidor.modelo.operacao.TipoDeOperacao;
import almoxarifadovirtual.servidor.modelo.produto.Produto;
import almoxarifadovirtual.servidor.modelo.reserva.Reserva;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeOperacao;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeProduto;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeReserva;
import almoxarifadovirtual.servidor.servico.ServicoDeOperacao;
import almoxarifadovirtual.servidor.servico.ServicoDeProduto;
import almoxarifadovirtual.servidor.servico.ServicoDeReserva;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServicoDeReserva_ESTest extends ServicoDeReserva_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServicoDeReserva servicoDeReserva0 = new ServicoDeReserva();
      Reserva reserva0 = mock(Reserva.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(reserva0).getCarrinho();
      RepositorioDeReserva repositorioDeReserva0 = mock(RepositorioDeReserva.class, new ViolatedAssumptionAnswer());
      doReturn(reserva0).when(repositorioDeReserva0).getById(anyLong());
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "repositorioDeReserva", (Object) repositorioDeReserva0);
      ServicoDeOperacao servicoDeOperacao0 = new ServicoDeOperacao();
      RepositorioDeOperacao repositorioDeOperacao0 = mock(RepositorioDeOperacao.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class, "repositorioDeOperacao", (Object) repositorioDeOperacao0);
      Injector.validateBean(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeOperacao", (Object) servicoDeOperacao0);
      ServicoDeProduto servicoDeProduto0 = new ServicoDeProduto();
      RepositorioDeProduto repositorioDeProduto0 = mock(RepositorioDeProduto.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeProduto0, (Class<?>) ServicoDeProduto.class, "repositorioDeProduto", (Object) repositorioDeProduto0);
      Injector.validateBean(servicoDeProduto0, (Class<?>) ServicoDeProduto.class);
      Long long0 = new Long(1L);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeProduto", (Object) servicoDeProduto0);
      Injector.validateBean(servicoDeReserva0, (Class<?>) ServicoDeReserva.class);
      // Undeclared exception!
      try { 
        servicoDeReserva0.concluirReserva(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoDeProduto", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServicoDeReserva servicoDeReserva0 = new ServicoDeReserva();
      RepositorioDeReserva repositorioDeReserva0 = mock(RepositorioDeReserva.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(repositorioDeReserva0).findAll();
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "repositorioDeReserva", (Object) repositorioDeReserva0);
      ServicoDeOperacao servicoDeOperacao0 = new ServicoDeOperacao();
      RepositorioDeOperacao repositorioDeOperacao0 = mock(RepositorioDeOperacao.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class, "repositorioDeOperacao", (Object) repositorioDeOperacao0);
      Injector.validateBean(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeOperacao", (Object) servicoDeOperacao0);
      ServicoDeProduto servicoDeProduto0 = new ServicoDeProduto();
      RepositorioDeProduto repositorioDeProduto0 = mock(RepositorioDeProduto.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeProduto0, (Class<?>) ServicoDeProduto.class, "repositorioDeProduto", (Object) repositorioDeProduto0);
      Injector.validateBean(servicoDeProduto0, (Class<?>) ServicoDeProduto.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeProduto", (Object) servicoDeProduto0);
      Injector.validateBean(servicoDeReserva0, (Class<?>) ServicoDeReserva.class);
      List<Reserva> list0 = servicoDeReserva0.getReservas();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServicoDeReserva servicoDeReserva0 = new ServicoDeReserva();
      ArrayList<Reserva> arrayList0 = new ArrayList<Reserva>();
      Reserva reserva0 = new Reserva();
      arrayList0.add(reserva0);
      RepositorioDeReserva repositorioDeReserva0 = mock(RepositorioDeReserva.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(repositorioDeReserva0).findAll();
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "repositorioDeReserva", (Object) repositorioDeReserva0);
      ServicoDeOperacao servicoDeOperacao0 = new ServicoDeOperacao();
      RepositorioDeOperacao repositorioDeOperacao0 = mock(RepositorioDeOperacao.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class, "repositorioDeOperacao", (Object) repositorioDeOperacao0);
      Injector.validateBean(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeOperacao", (Object) servicoDeOperacao0);
      ServicoDeProduto servicoDeProduto0 = new ServicoDeProduto();
      RepositorioDeProduto repositorioDeProduto0 = mock(RepositorioDeProduto.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeProduto0, (Class<?>) ServicoDeProduto.class, "repositorioDeProduto", (Object) repositorioDeProduto0);
      Injector.validateBean(servicoDeProduto0, (Class<?>) ServicoDeProduto.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeProduto", (Object) servicoDeProduto0);
      Injector.validateBean(servicoDeReserva0, (Class<?>) ServicoDeReserva.class);
      List<Reserva> list0 = servicoDeReserva0.getReservas();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServicoDeReserva servicoDeReserva0 = new ServicoDeReserva();
      ServicoDeProduto servicoDeProduto0 = new ServicoDeProduto();
      RepositorioDeProduto repositorioDeProduto0 = mock(RepositorioDeProduto.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(repositorioDeProduto0).findProdutosByDescricaoIsContaining(anyString());
      Injector.inject(servicoDeProduto0, (Class<?>) ServicoDeProduto.class, "repositorioDeProduto", (Object) repositorioDeProduto0);
      Injector.validateBean(servicoDeProduto0, (Class<?>) ServicoDeProduto.class);
      RepositorioDeProduto repositorioDeProduto1 = servicoDeProduto0.repositorioDeProduto;
      List<Produto> list0 = repositorioDeProduto1.findProdutosByDescricaoIsContaining("");
      Long long0 = new Long((-1997L));
      Reserva reserva0 = mock(Reserva.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(reserva0).getCarrinho();
      TipoDeOperacao tipoDeOperacao0 = TipoDeOperacao.DEPOSITO;
      RepositorioDeReserva repositorioDeReserva0 = mock(RepositorioDeReserva.class, new ViolatedAssumptionAnswer());
      doReturn(reserva0).when(repositorioDeReserva0).getById(anyLong());
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "repositorioDeReserva", (Object) repositorioDeReserva0);
      ServicoDeOperacao servicoDeOperacao0 = new ServicoDeOperacao();
      RepositorioDeOperacao repositorioDeOperacao0 = mock(RepositorioDeOperacao.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class, "repositorioDeOperacao", (Object) repositorioDeOperacao0);
      Injector.validateBean(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeOperacao", (Object) servicoDeOperacao0);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeProduto", (Object) servicoDeProduto0);
      Injector.validateBean(servicoDeReserva0, (Class<?>) ServicoDeReserva.class);
      // Undeclared exception!
      try { 
        servicoDeReserva0.concluirReserva(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoDeProduto", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServicoDeReserva servicoDeReserva0 = new ServicoDeReserva();
      ArrayList<Reserva> arrayList0 = new ArrayList<Reserva>();
      RepositorioDeReserva repositorioDeReserva0 = mock(RepositorioDeReserva.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(repositorioDeReserva0).findAll();
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "repositorioDeReserva", (Object) repositorioDeReserva0);
      ServicoDeOperacao servicoDeOperacao0 = new ServicoDeOperacao();
      RepositorioDeOperacao repositorioDeOperacao0 = mock(RepositorioDeOperacao.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class, "repositorioDeOperacao", (Object) repositorioDeOperacao0);
      Injector.validateBean(servicoDeOperacao0, (Class<?>) ServicoDeOperacao.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeOperacao", (Object) servicoDeOperacao0);
      ServicoDeProduto servicoDeProduto0 = new ServicoDeProduto();
      RepositorioDeProduto repositorioDeProduto0 = mock(RepositorioDeProduto.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoDeProduto0, (Class<?>) ServicoDeProduto.class, "repositorioDeProduto", (Object) repositorioDeProduto0);
      Injector.validateBean(servicoDeProduto0, (Class<?>) ServicoDeProduto.class);
      Injector.inject(servicoDeReserva0, (Class<?>) ServicoDeReserva.class, "servicoDeProduto", (Object) servicoDeProduto0);
      Injector.validateBean(servicoDeReserva0, (Class<?>) ServicoDeReserva.class);
      List<Reserva> list0 = servicoDeReserva0.getReservas();
      assertTrue(list0.isEmpty());
  }
}