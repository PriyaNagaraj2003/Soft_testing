package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityTest {
    
	@Test
	public void test() {
		Junittesting test=new Junittesting();
		String output=test.pin("12345");
		assertEquals("success",output);
	}
}
