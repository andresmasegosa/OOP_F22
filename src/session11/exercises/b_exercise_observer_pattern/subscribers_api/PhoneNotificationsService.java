package session11.exercises.b_exercise_observer_pattern.subscribers_api;

public class PhoneNotificationsService {

    public void notifyPhone(int phoneId, String message){
        System.out.println("Sending Message to Phone ID: "+phoneId);
        System.out.println("Message: "+message);
    }
}
