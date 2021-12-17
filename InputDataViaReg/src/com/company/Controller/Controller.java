package com.company.Controller;

import com.company.GlobalConst;
import com.company.Model.Model;
import com.company.Model.Subscriber;
import com.company.View.View;
import com.company.View.ViewText;

import java.util.Scanner;

public class Controller {
    private final View view;
    private final Model model;
    private String surname;
    private String nickname;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(ViewText.SURNAME_ENTER);
        checkSurname(scanner);
        view.printMessage(ViewText.NICKNAME_ENTER);
        checkNickname(scanner);
        model.setSubscriber(surname, nickname);
        Subscriber subscriber = model.getSubscriber();
        view.printResultRegistration(subscriber.getSurname(), subscriber.getNickname());
    }

    private void checkSurname(Scanner scanner) {
        while (!scanner.hasNext() || !((surname = scanner.nextLine()).matches(GlobalConst.SURNAME_REGEX)) ||
                !checkSurnameLength(surname)) {
            view.printMessage(ViewText.SURNAME_CONTAIN_ERROR);
            view.printMessage(ViewText.SURNAME_ENTER);
        }
    }

    private boolean checkSurnameLength(String surname) {
        if (surname.length() <= GlobalConst.SURNAME_MAX_LENGTH) {
            return true;
        } else {
            view.printMessage(ViewText.SURNAME_LENGTH_ERROR);
            return false;
        }
    }

    private void checkNickname(Scanner scanner) {
        while (!scanner.hasNext() || !((nickname = scanner.nextLine()).matches(GlobalConst.NICKNAME_REGEX)) ||
                !checkNicknameLength(nickname)) {
            view.printMessage(ViewText.NICKNAME_CONTAIN_ERROR);
            view.printMessage(ViewText.NICKNAME_ENTER);
        }
    }

    private boolean checkNicknameLength(String nickname) {
        if (nickname.length() <= GlobalConst.NICKNAME_MAX_LENGTH && nickname.length() >= GlobalConst.NICKNAME_MIN_LENGTH) {
            return true;
        } else {
            view.printMessage(ViewText.NICKNAME_LENGTH_ERROR);
            return false;
        }
    }
}
