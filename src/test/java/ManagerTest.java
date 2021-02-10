import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import staff.management.Manager;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sandy", 012345, 100000.00, "Senior Management");
    }
    @Test
    public void hasName(){
        assertEquals("Sandy", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(012345,manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, manager.getSalary(),0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Senior Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(100500.00, manager.getSalary(),0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000.00, manager.payBonus(),0.01);
    }
}
