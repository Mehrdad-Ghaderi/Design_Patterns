package observer.mail.model;

import observer.mail.Observer;
import observer.mail.Subject;

public class EmailTopicSubscriber implements Observer {
    private String message;
    private String name;
    private Subject subject;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        message = subject.getUpdate(this);
        if (message != null) System.out.println(name + ": Retrieving message: " + message);
        else System.out.println(name + " has No new message");

    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;

    }
}
