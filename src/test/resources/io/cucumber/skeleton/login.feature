Feature: En tant qu'utilisateur je souhaite acceder au compte que j'ai cree afin d'effectuer des modifications

  Scenario: Connexion avec un mot de passe incorrect
    Given l'utilisateur suivant
        | nom   | prenom | email                |  motDePasse |
        |Durand | Michel | michel.durandest.com | azerty123   |
    When je tente de me connecter avec les coordonnees
        | email                  | motDePasse |
        | michel.durand@test.com | qwerty123  |
    And un champ "Mot de passe oublie" me permet de reinitialiser mon mot de passe.

  Scenario: Connexion avec un mot de passe correct
    Given l'utilisateur suivant
        | nom    | prenom | email                  | motDePasse |
        | Durand | Michel | michel.durand@test.com | azerty123  |
    When je tente de me connecter avec les coordonnees
        | email                  | motDePasse |
        | michel.durand@test.com | azerty123  |
    Then j'accede a la page d'accueil de mon espace client
