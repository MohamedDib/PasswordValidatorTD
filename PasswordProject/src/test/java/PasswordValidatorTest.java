import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator pv = new PasswordValidator();
    String testPass = "ThisIsATest";

    @Test
    void testHasMoreThan6Car(){


        assertTrue(pv.hasMoreThan6Car(testPass));
    }

    @Test
    void testhasAtLeastOneUpperChar(){

        assertTrue(pv.hasAtLeastOneUpperChar(testPass));
    }

    @Test
    void testhasAtLeastOneLowerChar(){

        assertTrue(pv.hasAtLeastOneLowerChar(testPass));
    }

    @Test
    void testhasAtLeastOneChar(){

        assertTrue(pv.hasAtLeastOneChar(testPass));
    }



    @Test
    void testHAsAtLeastOneNum(){

        assertTrue(pv.hasAtLeastOneNum(testPass));
    }

    @Test
    void testVerifyPassword(){

        assertTrue(pv.verifyPassword(testPass));
    }

}
