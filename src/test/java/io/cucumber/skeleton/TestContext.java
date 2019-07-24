package io.cucumber.skeleton;

public class TestContext {
    Login login = new Login();
    Exception thrown = null;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Exception getThrown() {
        return thrown;
    }

    public void setThrown(Exception thrown) {
        this.thrown = thrown;
    }
}
