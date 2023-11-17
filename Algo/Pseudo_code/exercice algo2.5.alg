<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER i" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" epaisseurPoint="2" nbDecimales="8" totalAffichages="1000" totalBoucles="5000000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombreN" algoitem="nombreN EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir un nombre#0" algoitem="AFFICHER &quot;saisir un nombre&quot;"/>
        <item code="2#nombreN#pasliste" algoitem="LIRE nombreN"/>
        <item code="12#i#2#nombreN - 1" algoitem="POUR i ALLANT_DE 2 A nombreN - 1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#nombreN % i ==0" algoitem="SI (nombreN % i ==0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="3#nombreN#0#pasliste" algoitem="AFFICHER nombreN"/>
                <item code="4#est divisible par#0" algoitem="AFFICHER &quot;est divisible par&quot;"/>
                <item code="3#i#1#pasliste" algoitem="AFFICHER i"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
