package testcases.week4.day3.testng.attributes;

import org.testng.annotations.Test;

public class LearnTestNGAttributeEnabled {

	@Test
	public void add() {
		System.out.println("add");
	}

	@Test
	public void sub() {
		System.out.println("sub");
	}

	@Test(enabled = false)
	public void mul() {
		System.out.println("mul");
	}

	@Test
	public void div() {
		System.out.println("div");
	}
}
