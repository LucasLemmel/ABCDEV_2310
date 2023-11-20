<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="LIRE nb"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" nbDecimales="8" epaisseurPoint="2" maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nb" algoitem="nb EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir un nombre#0" algoitem="AFFICHER &quot;saisir un nombre&quot;"/>
        <item code="2#nb#pasliste" algoitem="LIRE nb"/>
        <item code="15#nb &lt; 10 OU nb >20" algoitem="TANT_QUE (nb &lt; 10 OU nb >20) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="6#nb &lt; 10" algoitem="SI (nb &lt; 10) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#saisir un nombre plus grand#0" algoitem="AFFICHER &quot;saisir un nombre plus grand&quot;"/>
                <item code="2#nb#pasliste" algoitem="LIRE nb"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#nb > 20" algoitem="SI (nb > 20) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="4#saisir un nombre plus petit#0" algoitem="AFFICHER &quot;saisir un nombre plus petit&quot;"/>
                        <item code="2#nb#pasliste" algoitem="LIRE nb"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
