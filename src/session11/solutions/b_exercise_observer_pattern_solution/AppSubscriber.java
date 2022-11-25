package session11.solutions.b_exercise_observer_pattern_solution;

import session11.solutions.b_exercise_observer_pattern_solution.subscribers_api.PhoneNotificationsService;

public class AppSubscriber implements Subscriber{

    int phoneID;
    PhoneNotificationsService phoneNotificationsService;

    public AppSubscriber(int phoneID, PhoneNotificationsService phoneNotificationsService) {
        this.phoneID = phoneID;
        this.phoneNotificationsService = phoneNotificationsService;
    }

    @Override
    public void update(String news) {
        phoneNotificationsService.notifyPhone(this.phoneID, news);
    }
}
