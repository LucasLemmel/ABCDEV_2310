<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;saisir age&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir age#0" algoitem="AFFICHER &quot;saisir age&quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="6#age >= 6 ET age &lt;= 7" algoitem="SI (age >= 6 ET age &lt;= 7) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#age#1#pasliste" algoitem="AFFICHER age"/>
            <item code="4#cet enfant est un Poussin#0" algoitem="AFFICHER &quot;cet enfant est un Poussin&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#age >= 8 ET age &lt;= 9" algoitem="SI (age >= 8 ET age &lt;= 9) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="3#age#1#pasliste" algoitem="AFFICHER age"/>
                    <item code="4#cet enfant est une pupille#0" algoitem="AFFICHER &quot;cet enfant est une pupille&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#age >= 10 ET age &lt;= 11" algoitem="SI (age >= 10 ET age &lt;= 11) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="3#age#1#pasliste" algoitem="AFFICHER age"/>
                            <item code="4#cet enfant est un minime#0" algoitem="AFFICHER &quot;cet enfant est un minime&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#age >= 12" algoitem="SI (age >= 12) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="3#age#1#pasliste" algoitem="AFFICHER age"/>
                                    <item code="4#cet enfant est un cadet#0" algoitem="AFFICHER &quot;cet enfant est un cadet&quot;"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
