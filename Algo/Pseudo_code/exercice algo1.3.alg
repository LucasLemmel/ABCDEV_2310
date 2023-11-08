<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER aire_du_secteur_circulaire"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#rayon" algoitem="rayon EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#angle" algoitem="angle EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#aire_du_secteur_circulaire" algoitem="aire_du_secteur_circulaire EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#ecrire rayon#0" algoitem="AFFICHER &quot;ecrire rayon&quot;"/>
        <item code="2#rayon#pasliste" algoitem="LIRE rayon"/>
        <item code="4#ecrire angle#0" algoitem="AFFICHER &quot;ecrire angle&quot;"/>
        <item code="2#angle#pasliste" algoitem="LIRE angle"/>
        <item code="5#aire_du_secteur_circulaire#(Math.PI*pow(rayon,2)*angle)/360#pasliste" algoitem="aire_du_secteur_circulaire PREND_LA_VALEUR (Math.PI*pow(rayon,2)*angle)/360"/>
        <item code="4#l'aire du secteur circulaire est:#0" algoitem="AFFICHER &quot;l'aire du secteur circulaire est:&quot;"/>
        <item code="3#aire_du_secteur_circulaire#0#pasliste" algoitem="AFFICHER aire_du_secteur_circulaire"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
