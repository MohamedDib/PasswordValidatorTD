import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {

    protected List<String> errors = new ArrayList<String>();

    public PasswordValidator(){
    }

    public boolean verifyPassword(String password){
        if(hasMoreThan6Car(password) && hasAtLeastOneChar(password) && hasAtLeastOneNum(password)){
            System.out.println("Passwor is valid !");
            return true;
        }else {
            System.out.println("Passwor is not valid ! please add :");
            this.errors.add("Add more than 6 caracters ");

            System.out.println("Size : "+errors.size());

            for (int i = 0; i < errors.size(); i++) {
                System.out.println(errors.get(i));
            }

            return false;
        }
    }

    public boolean hasMoreThan6Car(String password){
        if (password.length()>=6)
        {
            return true;
        }else {
            this.errors.add("Add more than 6 caracters ");
            return false;
        }
    }

    public boolean hasAtLeastOneChar(String password){

        if (hasAtLeastOneLowerChar(password) || hasAtLeastOneUpperChar(password))
        {
            return true;
        }else{
            this.errors.add("Add at least one char");
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
            this.errors.add("Add at least one number");
            return true;
        }
    }



}
