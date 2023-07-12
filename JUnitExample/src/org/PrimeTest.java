package org;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.PrimeChecke;

class PrimeTest {
	static PrimeChecke pc = null;
	
	@BeforeAll
	public static void init() {
		System.out.println("Object Initialized....");
		pc = new PrimeChecke();
	}
	@AfterAll
	public static void destroy() {
		System.out.println("Object Destroyed...");
		pc=null;
	}

	@ParameterizedTest
	@MethodSource("data")
	void xyz(boolean result, int input) {
		System.out.println("Input="+input+" Result="+result);
		assertEquals(result, pc.validatePrimeNumber(input));
	}

	public static Collection data() {
		return Arrays.asList(new Object[][] {{true,2},{false,8},{true,-17},{true,29},{false,12}});
	}
}
