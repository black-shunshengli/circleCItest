package com.example.demo;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.JVM)
public class DemoApplicationTests {
	private String mockStr = "mock privateMethod";
	private String notMockStr = "privateMethod";


	@Test
	public void testNoReturnValue3() {
		System.out.println("end.............");

	}
}
