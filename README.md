# selenium-Junit4
• Une méthode « Init » permettant l’initialisation du webDriver avant l’appel de la méthode de test
• Une méthode « End » permettant la fermeture du driver
• Une méthode de test « Script » qui accède au site http://www.stb.com.tn/en/site/bourse-change/convertisseurde-devises/ qui est un site de conversion. Le but du script est 
de fixer la devise de départ « eur » et la devise d’arrivée « usd », vider le champ du résultat de départ et ensuite le remplir avec la valeur « 25 » et le clic sur le bouton 
« entrée », récupérer le résultat de la conversion avec la méthode « getAttribute » et par la suite tester ce résultat avec la méthode « Assert.assertEquals »
