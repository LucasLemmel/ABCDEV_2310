<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="nbr PREND_LA_VALEUR nbr + 1"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" nbDecimales="8" arrondiAuto="vrai" epaisseurPoint="2" maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
        <item algoitem="nbr EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbr"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir un nombre&quot;" code="4#saisir un nombre#0"/>
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="nbr PREND_LA_VALEUR 0" code="5#nbr#0#pasliste"/>
        <item algoitem="TANT_QUE (nbr &lt; 10) FAIRE" code="15#nbr &lt; 10">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="nb PREND_LA_VALEUR nb + 1" code="5#nb#nb + 1#pasliste"/>
            <item algoitem="AFFICHER nb" code="3#nb#1#pasliste"/>
            <item algoitem="nbr PREND_LA_VALEUR nbr + 1" code="5#nbr#nbr + 1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
