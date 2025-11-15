package ui;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegisterTest {
    
    @Test
    public void testValidateInputs_AllEmpty() {
        Register reg = new Register();
        String result = reg.validateInputs("", "", "", "");
        assertEquals("All fields are required!", result);
    }

    @Test
    public void testValidateInputs_InvalidEmail() {
        Register reg = new Register();
        String result = reg.validateInputs("chamod", "chamogmail.com", "1234", "2000-01-01");
        assertEquals("Enter a valid email address!", result);
    }

    @Test
    public void testValidateInputs_ShortPassword() {
        Register reg = new Register();
        String result = reg.validateInputs("chamod", "chamod@gmail.com", "12", "2000-01-01");
        assertEquals("Password must be at least 4 characters!", result);
    }

    @Test
    public void testValidateInputs_ValidData() {
        Register reg = new Register();
        String result = reg.validateInputs("chamod", "chamod@gmail.com", "1234", "2000-01-01");
        assertEquals("OK", result);
    }
}
