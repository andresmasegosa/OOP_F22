package session11.solutions.b_exercise_observer_pattern_solution.subscribers_api;

public class EmailService {
    public void sendEmail(String emailaddress, String message){
        System.out.println("Sending Email to: "+emailaddress);
        System.out.println("Message: "+message);
    }
}
