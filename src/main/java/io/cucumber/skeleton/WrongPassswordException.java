package io.cucumber.skeleton;

public class WrongPassswordException extends RuntimeException{

    public WrongPassswordException() {
        super("Le nom utilisateur ou le mot de passe est incorrect");
    }
}
