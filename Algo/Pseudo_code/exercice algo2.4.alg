<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;Cette année est non bissextile&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#anneeA" algoitem="anneeA EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir l'année#0" algoitem="AFFICHER &quot;saisir l'année&quot;"/>
        <item code="2#anneeA#pasliste" algoitem="LIRE anneeA"/>
        <item code="6#anneeA % 4 == 0 ET anneeA % 100 != 0 OU anneeA % 400 == 0" algoitem="SI (anneeA % 4 == 0 ET anneeA % 100 != 0 OU anneeA % 400 == 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#anneeA#1#pasliste" algoitem="AFFICHER anneeA"/>
            <item code="4#Cette année est bissextile#0" algoitem="AFFICHER &quot;Cette année est bissextile&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="3#anneeA#1#pasliste" algoitem="AFFICHER anneeA"/>
                <item code="4#Cette année est non bissextile#0" algoitem="AFFICHER &quot;Cette année est non bissextile&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
