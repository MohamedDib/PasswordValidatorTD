public class AdminPasswordValidator extends PasswordValidator {

    @Override
    public boolean verifyPassword(String password){
        if(hasMoreThan9Car(password) && hasAtLeastOneChar(password) && hasAtLeastOneNum(password) && hasAtLeastOneSpecialChar(password) ){
            System.out.println("Passwor is valid !");
            return true;
        }else {
            System.out.println("Passwor is not valid !");
            return false;
        }
    }

    public boolean hasMoreThan9Car(String password){
        if (password.length()>=9)
        {
            return true;
        }else {
            return false;
        }
    }

    public boolean hasAtLeastOneSpecialChar(String password){

        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars ))
        {
            return false;
        }else {
            return true;
        }


    }
}
