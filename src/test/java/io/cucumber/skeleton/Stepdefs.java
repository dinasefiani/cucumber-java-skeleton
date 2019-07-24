package io.cucumber.skeleton;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Stepdefs {

    TestContext testContext = new TestContext();


    @Given("^l'utilisateur suivant$")
    public void set_given_user(DataTable dataTable) throws Throwable {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        String nom = list.get(0).get("nom");
        String prenom = list.get(0).get("prenom");
        String email = list.get(0).get("email");
        String password = list.get(0).get("motDePasse");
        testContext.getLogin().addUser(new User(nom, prenom, email, password));
    }

    @When("^je tente de me connecter avec les coordonnees$")
    public void login_with_user(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        String email = list.get(0).get("email");
        String password = list.get(0).get("motDePasse");
        try {
            testContext.getLogin().login(email, password);
        } catch (WrongPassswordException e) {
            testContext.setThrown(e);
        }
    }

    @Then("un message m'indique \"{string}\"")
    public void assertMessageIsReturned(String message) {
        assert testContext.getThrown() != null;
        assert testContext.getThrown().getMessage().equals(message);
    }

    @And("un champ \"Mot de passe oublie\" me permet de reinitialiser mon mot de passe.")
    public void assertForgtPasswordButtonIsShown() {
        assert testContext.getLogin().getActions().contains("ADD_FORGOT_PASSWORD_BUTTON");
    }

    @Then("j'accede a la page d'accueil de mon espace client")
    public void assertMessageIsReturned() {
        assert testContext.getThrown() == null;
        assert testContext.getLogin().getActions().contains("GO_TO_CLIENT_HOME_PAGE");
    }
}
