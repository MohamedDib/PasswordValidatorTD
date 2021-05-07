public class PasswordValidator {



    private String password;

    public PasswordValidator(){
    }

    public boolean verifyPassword(String password){
        if(hasMoreThan6Car(password) && hasAtLeastOneChar(password) && hasAtLeastOneNum(password)){
            System.out.println("Passwor is valid !");
            return true;
        }else {
            System.out.println("Passwor is not valid !");
            return false;
        }
    }

    public boolean hasMoreThan6Car(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            return false;
        }
    }

    public boolean hasAtLeastOneChar(String password){

        if (hasAtLeastOneLowerChar(password) || hasAtLeastOneUpperChar(password))
        {
            return true;
        }else{
            return false;
        }


    }

    public boolean hasAtLeastOneLowerChar(String password){
        String lowerCaseChars = "(.*[a-z].*)";

        if (!password.matches(lowerCaseChars ))
        {
            return false;
        }else{
            return true;
        }


    }

    public boolean hasAtLeastOneUpperChar(String password){
        String upperCaseChars = "(.*[A-Z].*)";

        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have atleast one lowercase character");
            return false;
        }else{
            return true;
        }


    }

    public boolean hasAtLeastOneNum(String password){
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            return false;
        }else{
            return true;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
