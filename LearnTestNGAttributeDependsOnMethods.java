package testcases.week4.day3.testng.attributes;

import org.testng.annotations.Test;

public class LearnTestNGAttributeDependsOnMethods {

	@Test
	public void add() {
		System.out.println("add");
	}

	@Test(dependsOnMethods = "add")
	public void sub() {
		System.out.println("sub");
	}

	@Test
	public void mul() {
		System.out.println("mul");
	}

	@Test
	public void div() {
		System.out.println("div");
	}
}
