package com.example.demo;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.JVM)
public class DemoApplicationTests {
	@Test
	public void testNoReturnValue3() {
		System.out.println("end.............");
	}

	@Test
	public void testNoReturnValue2() {
		//Assert.assertTrue(1 == 2);
	}
}
