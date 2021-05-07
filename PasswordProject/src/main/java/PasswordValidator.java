public class PasswordValidator {

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public PasswordValidator(String password){
        this.password = password;
    }

    public void verifyPassword(){
        // more than 6 caracters

        // at least one char

        // at least one number
    }

    private boolean hasMoreThan6Car(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            return false;
        }
    }

    private boolean hasAtLeastOneChar(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            return false;
        }
    }
    private boolean hasAtLeastOneNum(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            return false;
        }
    }


}
