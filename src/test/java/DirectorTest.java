import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", 011343, 1000000.00, "Senior Management", 9999.00);
    }
    @Test
    public void hasName() {
        assertEquals("Melinda", director.getName());
    }
    @Test
    public void hasBudget(){
        assertEquals(9999.00, director.getBudget(),0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(20000, director.payBonus(),0.01);
    }
}
