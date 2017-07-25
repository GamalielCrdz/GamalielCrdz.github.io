package test;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.Malabarista;

public class TestConcursoTalentos {
	private static Log Logger = LogFactory.getLog("TestConcursoTalentos");
	private Concursante malabarista1;
	
	@Before
	public void before() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) ctx.getBean("Solei");
	}
	

	
	
	
	@Test
	public void testMalabarista() {
		Logger.info("Inicio de ejecutar Malabarista");
		int noPelotas = 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		Logger.info("Fin de Ejecutar Malabarista");
	}

}
