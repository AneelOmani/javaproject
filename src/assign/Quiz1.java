package assign;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Quiz1 {

	@Test
	public void test() throws IOException {
		Quiz2 test1=new Quiz2();
		//assertTrue(test1.check());
		assertFalse(test1.check());  //check weather strings or null
	}

}
