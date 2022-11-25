package session11.solutions.b_exercise_observer_pattern_solution;

import session11.solutions.b_exercise_observer_pattern_solution.subscribers_api.EmailService;

public class EmailSubscriber implements Subscriber{
    String emailAddress;
    EmailService emailService;

    public EmailSubscriber(String emailAddress, EmailService emailService) {
        this.emailAddress = emailAddress;
        this.emailService = emailService;
    }

    @Override
    public void update(String news) {
        this.emailService.sendEmail(this.emailAddress,news);
    }
}
