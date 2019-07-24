package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Login {

    private List<User> users = new ArrayList<>();

    List<String> actions = new ArrayList<>();


    public void login(String email, String inputPassword) {
        User loginUser = new User(email, inputPassword);
        Optional<User> foundUser = users.stream()
            .filter(loginUser::equals)
            .findFirst();
        if(!foundUser.isPresent()) {
            actions.add("ADD_FORGOT_PASSWORD_BUTTON");
            throw new WrongPassswordException();
        } else {
            actions.add("GO_TO_CLIENT_HOME_PAGE");
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<String> getActions() {
        return actions;
    }
}
