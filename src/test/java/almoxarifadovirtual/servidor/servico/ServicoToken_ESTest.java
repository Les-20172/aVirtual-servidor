/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 02 19:41:13 GMT 2018
 */

package almoxarifadovirtual.servidor.servico;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import almoxarifadovirtual.servidor.modelo.autenticacao.Token;
import almoxarifadovirtual.servidor.repositorio.RepositorioDeToken;
import almoxarifadovirtual.servidor.servico.ServicoToken;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServicoToken_ESTest extends ServicoToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(1L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByUsuarioId(anyLong());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token1 = servicoToken0.getTokenByUsuarioId(long0);
      assertEquals(1L, (long)token1.getUsuarioId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token0 = servicoToken0.getTokenByChave("");
      assertNull(token0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Token token0 = new Token((Long) null);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Long long0 = new Long(523L);
      // Undeclared exception!
      try { 
        servicoToken0.validarUsuarioId("4~UPw4dU[o [ufon", long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      servicoToken0.repository = null;
      // Undeclared exception!
      try { 
        servicoToken0.getTokenByChave("org.springframework.data.domain.ExampleMatcher$NullHandler");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      servicoToken0.repository = null;
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        servicoToken0.gerarToken(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.servico.ServicoToken", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token0 = servicoToken0.validarToken("veM^t8 7:dkQ&z");
      assertNull(token0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(1L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      servicoToken0.deletarToken(token0);
      assertEquals(1L, (long)token0.getUsuarioId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(0L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token1 = servicoToken0.getTokenByChave("A)hOU@13f:8$c.(");
      assertNull(token1.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(1L);
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Long long1 = new Long(0L);
      boolean boolean0 = servicoToken0.validarUsuarioId(", defaultStringMatcher=", long1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long((-163L));
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      boolean boolean0 = servicoToken0.validarUsuarioId("4~UPw4dU[o [ufon", long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long((-163L));
      Token token0 = new Token(long0);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token1 = servicoToken0.validarToken("4~UPw4dU[o [ufon");
      assertSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Token token0 = mock(Token.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(token0).validarToken();
      doReturn((String) null).when(token0).toString();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token1 = servicoToken0.validarToken("DEFAULT");
      assertNull(token1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Token token0 = new Token();
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn(token0).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      // Undeclared exception!
      try { 
        servicoToken0.validarToken("veM^t8 7:dkQ&z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("almoxarifadovirtual.servidor.modelo.autenticacao.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(1L);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByUsuarioId(anyLong());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      Token token0 = servicoToken0.getTokenByUsuarioId(long0);
      assertNull(token0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ServicoToken servicoToken0 = new ServicoToken();
      Long long0 = new Long(1L);
      RepositorioDeToken repositorioDeToken0 = mock(RepositorioDeToken.class, new ViolatedAssumptionAnswer());
      doReturn((Token) null).when(repositorioDeToken0).findByChave(anyString());
      Injector.inject(servicoToken0, (Class<?>) ServicoToken.class, "repository", (Object) repositorioDeToken0);
      Injector.validateBean(servicoToken0, (Class<?>) ServicoToken.class);
      boolean boolean0 = servicoToken0.validarUsuarioId("", long0);
      assertFalse(boolean0);
  }
}
