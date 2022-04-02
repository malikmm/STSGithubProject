package com.malik.hellotest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.malik.hello.Hello;

class testHello {

	@Test
	void test() {
//		fail("Not yet implemented");
		Hello h = new Hello();
		System.out.println(h.getGreeting());
		assertTrue(h.getGreeting(), true);
	}

}
