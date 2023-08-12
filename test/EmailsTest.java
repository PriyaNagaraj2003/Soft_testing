
package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailsTest {
    
	@Test
	public void test() {
		Junittesting test=new Junittesting();
		String output=test.email("dharshini@");
		assertEquals("success",output);
	}

    
}
