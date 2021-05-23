package moodtesting;

import static org.junit.Assert.*;


import org.junit.Test;

public class MoodAanalyserTest {

	@Test
	public void test() {
		MoodAanalyser test=new MoodAanalyser();
		String output = test.moodcheck("sad");
		assertEquals("sad",output);;
	}

}
