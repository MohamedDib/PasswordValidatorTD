import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator pv = new PasswordValidator();

    @Test
    void testHasMoreThan6Car(){

        String pass = "TestPassword";

        assertTrue(pv.hasMoreThan6Car(pass));
    }

    @Test
    void testHasAtLeastOneChar(){
        String pass = "TestPassword";

        assertTrue(pv.hasMoreThan6Car(pass));
    }

    @Test
    void testHAsAtLeastOneNum(){

    }

}
