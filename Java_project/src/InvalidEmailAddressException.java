public class InvalidEmailAddressException extends Throwable {

    //Constructor
    public InvalidEmailAddressException(String companyEmail, String message){
        System.out.println("Error: " + companyEmail + message + "\n");
    }
}
