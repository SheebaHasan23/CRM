package com.crm.contacttest;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void sampleTest() {
		String URL=System.getProperty("url");
		System.out.println(URL);
	}

	@Test
	public void editTest() {
		System.out.println("test edited");
	}
}
