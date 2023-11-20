<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="LIRE nb" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" nbDecimales="8" epaisseurLigne="2" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir un nombre&quot;" code="4#saisir un nombre#0"/>
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="TANT_QUE (nb&lt;1 OU nb>3) FAIRE" code="15#nb&lt;1 OU nb>3">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;saisir un autre nombre&quot;" code="4#saisir un autre nombre#0"/>
            <item algoitem="LIRE nb" code="2#nb#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
