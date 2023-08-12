package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class MobileTest {

    @Test
    public void test() {
        Junittesting test = new Junittesting();
        String output = test.mobile("78787878");
        assertEquals("invalid mobile number", output);
    }

}
