<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (nombre1 > 0 et  nombre2 &lt; 0 OU  nombre1 &lt; 0 et  nombre2 > 0) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" arrondiAuto="vrai" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombre1 EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre1"/>
        <item algoitem="nombre2 EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre2"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le nombre1&quot;" code="4#saisir le nombre1#0"/>
        <item algoitem="LIRE nombre1" code="2#nombre1#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir le nombre2&quot;" code="4#saisir le nombre2#0"/>
        <item algoitem="LIRE nombre2" code="2#nombre2#pasliste"/>
        <item algoitem="SI (nombre1 &lt; 0 ET nombre2 &lt; 0 OU nombre1 > 0 ET nombre2 > 0) ALORS" code="6#nombre1 &lt; 0 ET nombre2 &lt; 0 OU nombre1 > 0 ET nombre2 > 0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;ce nombre est positif&quot;" code="4#ce nombre est positif#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (nombre1 > 0 et  nombre2 &lt; 0 OU  nombre1 &lt; 0 et  nombre2 > 0) ALORS" code="6#nombre1 > 0 et  nombre2 &lt; 0 OU  nombre1 &lt; 0 et  nombre2 > 0">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;ce nombre est négatif&quot;" code="4#ce nombre est négatif#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
