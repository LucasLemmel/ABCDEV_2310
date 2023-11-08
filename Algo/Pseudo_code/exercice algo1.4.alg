<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="interet_composer PREND_LA_VALEUR somme*pow((1+interet/100),annees)"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" maxBoucle="500000" totalBoucles="5000000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="somme EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme"/>
        <item algoitem="interet EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet"/>
        <item algoitem="annees EST_DU_TYPE NOMBRE" code="1#NOMBRE#annees"/>
        <item algoitem="interet_simple EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet_simple"/>
        <item algoitem="interet_composer EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet_composer"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;ecrire somme&quot;" code="4#ecrire somme#0"/>
        <item algoitem="LIRE somme" code="2#somme#pasliste"/>
        <item algoitem="AFFICHER &quot;ecrire interet&quot;" code="4#ecrire interet#0"/>
        <item algoitem="LIRE interet" code="2#interet#pasliste"/>
        <item algoitem="AFFICHER &quot;ecrire annees&quot;" code="4#ecrire annees#0"/>
        <item algoitem="LIRE annees" code="2#annees#pasliste"/>
        <item algoitem="interet_simple PREND_LA_VALEUR somme*(1+annees*interet/100)" code="5#interet_simple#somme*(1+annees*interet/100)#pasliste"/>
        <item algoitem="AFFICHER &quot;l'interet simple est:&quot;" code="4#l'interet simple est:#0"/>
        <item algoitem="AFFICHER interet_simple" code="3#interet_simple#1#pasliste"/>
        <item algoitem="interet_composer PREND_LA_VALEUR somme*pow((1+interet/100),annees)" code="5#interet_composer#somme*pow((1+interet/100),annees)#pasliste"/>
        <item algoitem="AFFICHER &quot;l'interet composer est:&quot;" code="4#l'interet composer est:#0"/>
        <item algoitem="AFFICHER interet_composer" code="3#interet_composer#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
