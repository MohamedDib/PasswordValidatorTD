public class PasswordValidator {



    private String password;

    public PasswordValidator(){
    }

    public void verifyPassword(){
        // more than 6 caracters

        // at least one char

        // at least one number
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
        String lowerCaseChars = "(.*[a-z].*)";
        String upperCaseChars = "(.*[A-Z].*)";

        if (!password.matches(lowerCaseChars ) || !password.matches(upperCaseChars ))
        {
            System.out.println("Password must have atleast one lowercase character");
            return false;
        }else{
            return true;
        }


    }
    public boolean hasAtLeastOneNum(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
