package com.company.Model;

public class Model {
    Subscriber subscriber = new Subscriber();

    public void setSubscriber(String surname, String nickname) {
        subscriber.setSurname(surname);
        subscriber.setNickname(nickname);
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }
}
