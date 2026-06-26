// STEP 1: Creating a checked exception
// Must extend Exception...because it is checked.
class invalidAgeException extends Exception{

    // Pass the error message to the parent Exception class
    public invalidAgeException(String Message){
        super(Message);
    }
}

// STEP 2: Throwing the exception
//Because this is checked, you must append throws InvalidAgeException to the method signature where it might be thrown
class VoterRegistry {
    public void registerVoter(int age) throws invalidAgeException{
        if(age < 18) {
            throw new invalidAgeException(" Age "+ age + " is below the legal voting age of 18");
        }
        System.out.println("Voter registered Successfully");
    }
}

// STEP : Handling the Exception
public class CustomExceptions {
    public static void main (String[] args){
        VoterRegistry vr = new VoterRegistry();
        try{
            //Triggering the checked Exception
            vr.registerVoter(17);
        } catch( invalidAgeException e ){
            //Handling the checked Exception
            System.err.println("Registration Rejected: "+ e.getMessage());

        }
    }
}
