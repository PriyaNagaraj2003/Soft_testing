package st.project;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@Runwith(Suite.class)

@Suite.SuiteClasses({ AadhaarTest.class, DOBTest.class, EmailsTest.class, GenderTest.class, MobileTest.class, NamesTest.class,
		SecurityTest.class })
public class AllTest {
}
