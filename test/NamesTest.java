package st.project;

import org.junit.Test;
import static org.junit.Assert.*;

public class NamesTest {

    @Test
    public void test() {
        Junittesting test = new Junittesting();
        String output = test.name("Abretha");
        assertEquals("success", output);
    }

}
