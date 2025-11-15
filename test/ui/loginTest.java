
package ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class loginTest {
    
    private login loginForm;
    
    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting login tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("All login tests completed.");
    }
    
    @Before
    public void setUp() {
        loginForm = new login();
    }
    
    @After
    public void tearDown() {
        loginForm = null;
    }

    
    @Test
    public void testEmptyInputs() {
        String result = loginForm.validateLoginInputs("", "");
        assertEquals("Username is required!", result);
    }

    
    @Test
    public void testMissingPassword() {
        String result = loginForm.validateLoginInputs("chamod", "");
        assertEquals("Password is required!", result);
    }

    @Test
    public void testValidInputs() {
        String result = loginForm.validateLoginInputs("chamod", "1234");
        assertEquals("OK", result);
    }

    @Test
    public void testMainLaunchGUI() {
        assertDoesNotThrow(() -> {
            login.main(new String[]{});
        });
    }

   
    private void assertDoesNotThrow(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable t) {
            fail("Exception thrown: " + t.getMessage());
        }
    }
}
