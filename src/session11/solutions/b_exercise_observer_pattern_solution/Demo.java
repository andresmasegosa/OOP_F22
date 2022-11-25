package session11.solutions.b_exercise_observer_pattern_solution;

import session11.solutions.b_exercise_observer_pattern_solution.subscribers_api.EmailService;
import session11.solutions.b_exercise_observer_pattern_solution.subscribers_api.PhoneNotificationsService;

public class Demo {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        PhoneNotificationsService phoneNotificationsService = new PhoneNotificationsService();

        NewsFeed feed = new NewsFeed();
        Subscriber emailSubscriber = new EmailSubscriber("arma@cs.aau.dk", emailService);
        feed.addSubscriber(emailSubscriber);

        Subscriber appSubscriber = new AppSubscriber(123456, phoneNotificationsService);
        feed.addSubscriber(appSubscriber);

        feed.notifySubscribers("The observer pattern is great!");

    }
}
