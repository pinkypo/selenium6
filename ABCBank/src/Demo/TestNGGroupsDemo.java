package Demo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	@Test(groups="Sanity")
	public void test1() {
		System.out.println("This is test 1");
	}
	@Test(groups="Sanity")
	public void test2() {
		System.out.println("This is test 2");

    }
	@Test(groups="Regression")
	public void test3() {
		System.out.println("This is test 3");
	}
	@Test(groups="Regression")
	public void test4() {
		System.out.println("This is test 4");
	}
}