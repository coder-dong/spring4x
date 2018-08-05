package com.smart.anno;

import java.lang.reflect.Method;

import com.smart.anno.bean.TestBean1;
import com.smart.anno.bean.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;
public class ToolTest {

	@Test
	public void tool() {
		Class clazz = ForumService.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			NeedTest nt = method.getAnnotation(NeedTest.class);
			if (nt != null) {
				if (nt.value()) {
					System.out.println(method.getName() + "()需要测试");
				} else {
					System.out.println(method.getName() + "()不需要测试");
				}
			}
		}
	}

	@Test
	public void testAnno() throws Exception {
		String configLocation = "com/smart/anno/beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		TestBean1 bean1 = applicationContext.getBean(TestBean1.class);
		TestBean2 bean2 = applicationContext.getBean(TestBean2.class);

		InjectId injectId1 = bean1.getClass().getAnnotation(InjectId.class);
		if (injectId1 != null){
			if (injectId1.canInject()){
				Method setId = bean1.getClass().getMethod("setId", String.class);
				setId.invoke(bean1, injectId1.sourceValue());
			}
		}

		InjectId injectId2 = bean2.getClass().getAnnotation(InjectId.class);
		if (injectId2 != null){
			if (injectId2.canInject()){
				Method setId = bean2.getClass().getMethod("setId", String.class);
				setId.invoke(bean2, injectId2.sourceValue());
			}
		}

		System.out.println(bean1.toString());
		System.out.println("<============================>");
		System.out.println(bean2.toString());
	}
}
