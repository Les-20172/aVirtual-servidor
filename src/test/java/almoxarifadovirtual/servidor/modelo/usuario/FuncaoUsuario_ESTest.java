/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 02 19:45:16 GMT 2018
 */

package almoxarifadovirtual.servidor.modelo.usuario;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import almoxarifadovirtual.servidor.modelo.usuario.FuncaoUsuario;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FuncaoUsuario_ESTest extends FuncaoUsuario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FuncaoUsuario funcaoUsuario0 = FuncaoUsuario.selecionarFuncao("PRESTADOR");
      assertEquals(FuncaoUsuario.PRESTADOR, funcaoUsuario0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FuncaoUsuario[] funcaoUsuarioArray0 = FuncaoUsuario.values();
      assertNotNull(funcaoUsuarioArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FuncaoUsuario funcaoUsuario0 = FuncaoUsuario.valueOf("ALMOXARIFE");
      assertEquals(FuncaoUsuario.ALMOXARIFE, funcaoUsuario0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncaoUsuario funcaoUsuario0 = FuncaoUsuario.selecionarFuncao("ALMOXARIFE");
      assertEquals(FuncaoUsuario.ALMOXARIFE, funcaoUsuario0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        FuncaoUsuario.selecionarFuncao("PRESTACOR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Funcao nao cadastrada no sistema PRESTACOR, as fun\u00E7\u00F5es v\u00E1lidas s\u00E3o [ADMINISTRADOR, ALMOXARIFE, PRESTADOR]
         //
         verifyException("almoxarifadovirtual.servidor.modelo.usuario.FuncaoUsuario", e);
      }
  }
}