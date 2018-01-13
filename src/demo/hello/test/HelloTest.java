package demo.hello.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demo.hello.Hello;
import junit.framework.Assert;

class HelloTest {

	private Hello hello;
	
	@BeforeEach
	void setUp() throws Exception {
		hello = new Hello();
	}

	@Test
	void testSayHello() {
		
		String expected = "Hi, Justin";
		String actual = "";
		
		actual = hello.sayHello("Justin");
		assertEquals(expected, actual);
		
		
	}

}
