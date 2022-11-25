package session11.solutions.b_exercise_observer_pattern_solution.subscribers_api;

public class PhoneNotificationsService {

    public void notifyPhone(int phoneId, String message){
        System.out.println("Sending Message to Phone ID: "+phoneId);
        System.out.println("Message: "+message);
    }
}
