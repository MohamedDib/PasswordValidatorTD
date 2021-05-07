import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminPasswordValidatorTest {

    AdminPasswordValidator AdminPV = new AdminPasswordValidator();
    String testPass = "ThisIsATest88#";

    @Test
    void testVerifyPassword(){

        assertTrue(AdminPV.verifyPassword(testPass));
    }

    @Test
    void testHasMoreThan9Car(){
        assertTrue(AdminPV.hasMoreThan9Car(testPass));
    }

    @Test
    void testhasAtLeastOneSpecialChar(){

        assertTrue(AdminPV.hasAtLeastOneSpecialChar(testPass));
    }
}
