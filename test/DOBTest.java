
package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class DOBTest {
  @Test
	public void test() {
		Junittesting test=new Junittesting();
		String output=test.dob("23","","");
		assertEquals("select month, year",output);
	}
}
