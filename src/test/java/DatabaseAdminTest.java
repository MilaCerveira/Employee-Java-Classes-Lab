import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jon", 012346, 50000.00);
    }
    @Test
    public void hasName() {
        assertEquals("Jon", databaseAdmin.getName());
    }
}
