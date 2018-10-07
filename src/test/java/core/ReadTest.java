package core;
import java.util.List;
import java.util.ArrayList;

import junit.framework.TestCase;

public class ReadTest extends TestCase	 {
	
	public void testRead() {
		ReadTest reading = new ReadTest();
		
		ArrayList<String> deckArray = new ArrayList<String>();
		ArrayList<String> deck2 = new ArrayList<String>();
		assertTrue(deckArray.equals(deck2));
	} 
}
