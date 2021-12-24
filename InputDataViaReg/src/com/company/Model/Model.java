package com.company.Model;

public class Model {
    Subscriber subscriber = new Subscriber();

    public void setSubscriber(String surname, String nickname) throws NotUniqueNicknameException {
        if (BD.checkNicknameRepeat(nickname)) {
            throw new NotUniqueNicknameException("Not Unique Nickname", nickname);
        }
        subscriber.setSurname(surname);
        subscriber.setNickname(nickname);
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

}
