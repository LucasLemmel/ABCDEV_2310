<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="DEBUT_SI" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" totalBoucles="5000000" arrondiAuto="vrai" epaisseurLigne="2" nbDecimales="8" totalAffichages="1000" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
        <item algoitem="b EST_DU_TYPE NOMBRE" code="1#NOMBRE#b"/>
        <item algoitem="c EST_DU_TYPE NOMBRE" code="1#NOMBRE#c"/>
        <item algoitem="inferieurEgale EST_DU_TYPE CHAINE" code="1#CHAINE#inferieurEgale"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir a&quot;" code="4#saisir a#0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir b&quot;" code="4#saisir b#0"/>
        <item algoitem="LIRE b" code="2#b#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir c&quot;" code="4#saisir c#0"/>
        <item algoitem="LIRE c" code="2#c#pasliste"/>
        <item algoitem="inferieurEgale PREND_LA_VALEUR &quot; &lt;= &quot;" code="5#inferieurEgale#&quot; &lt;= &quot;#pasliste"/>
        <item algoitem="SI (a &lt;= b ET a&lt;= c) ALORS" code="6#a &lt;= b ET a&lt;= c">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="SI (b&lt;= c) ALORS" code="6#b&lt;= c">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                    <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                    <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (b &lt;= a ET b &lt;= c) ALORS" code="6#b &lt;= a ET b &lt;= c">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="SI (a &lt;= c) ALORS" code="6#a &lt;= c">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                        <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                        <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                        <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                        <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                            <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                            <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                            <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                            <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (c &lt;= a ET c &lt;= b) ALORS" code="6#c &lt;= a ET c &lt;= b">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="SI (a &lt;= b) ALORS" code="6#a &lt;= b">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                                <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                                <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                                <item algoitem="SINON" code="9#sinon">
                                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                    <item algoitem="AFFICHER c" code="3#c#0#pasliste"/>
                                    <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                                    <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                                    <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                                    <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                                </item>
                            </item>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
