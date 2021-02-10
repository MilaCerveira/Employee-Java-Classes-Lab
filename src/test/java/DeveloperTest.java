import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Hannah", 012356, 80000.00);
    }
    @Test
    public void hasName() {
        assertEquals("Hannah", developer.getName());
    }
}
