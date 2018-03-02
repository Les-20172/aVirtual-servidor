/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 02 19:46:20 GMT 2018
 */

package almoxarifadovirtual.servidor.servico;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ServicoDeReserva_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "almoxarifadovirtual.servidor.servico.ServicoDeReserva"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ServicoDeReserva_ESTest_scaffolding.class.getClassLoader() ,
      "almoxarifadovirtual.servidor.modelo.operacao.TipoDeOperacao",
      "almoxarifadovirtual.servidor.servico.ServicoDeProduto",
      "org.springframework.beans.factory.annotation.Autowired",
      "org.springframework.data.repository.CrudRepository",
      "almoxarifadovirtual.servidor.repositorio.RepositorioDeProduto",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springframework.data.domain.Sort$Direction",
      "almoxarifadovirtual.servidor.servico.ServicoDeReserva",
      "org.springframework.stereotype.Service",
      "org.springframework.data.repository.Repository",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Pageable",
      "almoxarifadovirtual.servidor.servico.ServicoDeOperacao",
      "almoxarifadovirtual.servidor.repositorio.RepositorioDeReserva",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "almoxarifadovirtual.servidor.modelo.produto.Produto",
      "almoxarifadovirtual.servidor.repositorio.RepositorioDeOperacao",
      "almoxarifadovirtual.servidor.modelo.reserva.Reserva",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Example",
      "org.springframework.data.domain.Slice",
      "almoxarifadovirtual.servidor.modelo.operacao.Operacao",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.stereotype.Component",
      "org.springframework.data.jpa.repository.JpaRepository"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("almoxarifadovirtual.servidor.modelo.reserva.Reserva", false, ServicoDeReserva_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("almoxarifadovirtual.servidor.repositorio.RepositorioDeOperacao", false, ServicoDeReserva_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("almoxarifadovirtual.servidor.repositorio.RepositorioDeProduto", false, ServicoDeReserva_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("almoxarifadovirtual.servidor.repositorio.RepositorioDeReserva", false, ServicoDeReserva_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ServicoDeReserva_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "almoxarifadovirtual.servidor.modelo.operacao.TipoDeOperacao"
    );
  }
}
