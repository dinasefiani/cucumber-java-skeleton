Feature: En tant qu'utilisateur je souhaite accéder au compte que j'ai créé afin d'effectuer des modifications

  Scenario: Connexion avec un mot de passe incorrect
    Given l'utilisateur suivant
        | nom   | prenom | email                |  motDePasse |
        |Durand | Michel | michel.durandest.com | azerty123   |
    When je tente de me connecter avec les coordonnées
        | email                  | motDePasse |
        | michel.durand@test.com | qwerty123  |
    And un champ "Mot de passe oublié" me permet de réinitialiser mon mot de passe.

  Scenario: Connexion avec un mot de passe correct
    Given l'utilisateur suivant
        | nom    | prenom | email                  | motDePasse |
        | Durand | Michel | michel.durand@test.com | azerty123  |
    When je tente de me connecter avec les coordonnées
        | email                  | motDePasse |
        | michel.durand@test.com | azerty123  |
    Then j'accéde a la page d'accueil de mon espace client
