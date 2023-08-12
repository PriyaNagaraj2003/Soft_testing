package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenderTest 
{
    @Test
	public void test() {
		Junittesting test=new Junittesting();
		String output=test.gender("");
		assertEquals("success",output);
	}
    
}
