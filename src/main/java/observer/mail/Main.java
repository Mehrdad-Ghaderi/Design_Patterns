package observer.mail;

import observer.mail.model.EmailTopic;
import observer.mail.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSubscriber("First Observer");
        Observer secondObserver = new EmailTopicSubscriber("Second Observer");
        Observer thirdObserver = new EmailTopicSubscriber("Third Observer");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //check for update but there is no new message yet
        firstObserver.update();
        secondObserver.update();

        //Subject/provider
        topic.postMessage("Hello Subscribers");

        //unregistering one of the observers
        topic.unregister(firstObserver);
        System.out.println("****************");
        topic.postMessage("Hello againSubscribers");

    }
}
