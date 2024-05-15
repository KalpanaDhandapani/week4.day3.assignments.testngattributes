package testcases.week4.day3.testng.attributes;

import org.testng.annotations.Test;


public class LearnTestNGAttributePriority {

	@Test(priority = 0)
	public void add() {
		System.out.println("add");
	}

	@Test(priority = -1)
	public void sub() {
		System.out.println("sub");
	}

	@Test(priority = 3)
	public void mul() {
		System.out.println("mul");
	}

	@Test
	public void div() {
		System.out.println("div");
	}

}
