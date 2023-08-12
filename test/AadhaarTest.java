package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class AadhaarTest {
    @Test
	public void test() {
		Junittesting test=new Junittesting();
		String output=test.aadhar("12345678");
		assertEquals("success",output);
	}

    
}
