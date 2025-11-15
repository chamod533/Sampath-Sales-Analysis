
package db;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class dbTest {
    
    public dbTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting Database Connection Test ");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(" Database Connection Test Finished ");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testGetConnection() {
        System.out.println("Testing getConnection()...");

        // Try to get a connection
        Connection connection = db.getConnection();

        // Check that we successfully got a non-null connection
        assertNotNull("Database connection should not be null", connection);

        // Optionally check that the connection is still open
        try {
            assertFalse("Connection should not be closed", connection.isClosed());
            System.out.println("Database connected successfully!");
            connection.close(); // clean up
        } catch (Exception e) {
            fail("Database connection test failed: " + e.getMessage());
        }
    }
}
