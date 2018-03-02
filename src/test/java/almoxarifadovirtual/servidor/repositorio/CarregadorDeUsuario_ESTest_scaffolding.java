/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 02 19:47:23 GMT 2018
 */

package almoxarifadovirtual.servidor.repositorio;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CarregadorDeUsuario_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "almoxarifadovirtual.servidor.repositorio.CarregadorDeUsuario"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CarregadorDeUsuario_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.core.env.CommandLinePropertySource",
      "org.springframework.boot.ApplicationArguments",
      "org.springframework.core.env.PropertySource",
      "org.springframework.core.env.PropertySource$ComparisonPropertySource",
      "almoxarifadovirtual.servidor.repositorio.CarregadorDeUsuario",
      "org.springframework.core.env.EnumerablePropertySource",
      "org.springframework.data.repository.CrudRepository",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springframework.core.env.SimpleCommandLinePropertySource",
      "almoxarifadovirtual.servidor.modelo.usuario.Usuario",
      "almoxarifadovirtual.servidor.modelo.usuario.FuncaoUsuario",
      "org.springframework.core.env.PropertySource$StubPropertySource",
      "org.springframework.data.repository.Repository",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Pageable",
      "org.springframework.stereotype.Repository",
      "almoxarifadovirtual.servidor.repositorio.RepositorioDeUsuario",
      "org.springframework.boot.DefaultApplicationArguments$Source",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "org.springframework.boot.ApplicationRunner",
      "org.springframework.boot.DefaultApplicationArguments",
      "org.springframework.data.domain.Example",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Slice",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.core.env.SimpleCommandLineArgsParser",
      "org.springframework.stereotype.Component",
      "org.springframework.core.env.CommandLineArgs",
      "org.springframework.data.jpa.repository.JpaRepository",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CarregadorDeUsuario_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "almoxarifadovirtual.servidor.modelo.usuario.FuncaoUsuario",
      "org.springframework.core.env.CommandLinePropertySource",
      "org.springframework.util.StringUtils"
    );
  }
}
