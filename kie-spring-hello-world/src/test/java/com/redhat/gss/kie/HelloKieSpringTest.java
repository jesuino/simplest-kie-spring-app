package com.redhat.gss.kie;

import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloKieSpringTest {

	@Test
	public void hello() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/redhat/gss/kie/kmodule-spring.xml");
		KieSession kieSession = (KieSession) ctx.getBean("kieSession");
		kieSession.fireAllRules();
		kieSession.dispose();
	}
}
