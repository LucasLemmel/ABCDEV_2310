<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER valeurB" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="valeurA EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeurA"/>
        <item algoitem="valeurB EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeurB"/>
        <item algoitem="valeurC EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeurC"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;ecrire valeurA&quot;" code="4#ecrire valeurA#0"/>
        <item algoitem="LIRE valeurA" code="2#valeurA#pasliste"/>
        <item algoitem="AFFICHER &quot;ecrire valeurB&quot;" code="4#ecrire valeurB#0"/>
        <item algoitem="LIRE valeurB" code="2#valeurB#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeurA est:&quot;" code="4#la valeurA est:#0"/>
        <item algoitem="AFFICHER valeurA" code="3#valeurA#1#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeurB est:&quot;" code="4#la valeurB est:#0"/>
        <item algoitem="AFFICHER valeurB" code="3#valeurB#1#pasliste"/>
        <item algoitem="valeurC PREND_LA_VALEUR valeurA" code="5#valeurC#valeurA#pasliste"/>
        <item algoitem="valeurA PREND_LA_VALEUR valeurB" code="5#valeurA#valeurB#pasliste"/>
        <item algoitem="valeurB PREND_LA_VALEUR valeurC" code="5#valeurB#valeurC#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeurA est:&quot;" code="4#la valeurA est:#0"/>
        <item algoitem="AFFICHER valeurA" code="3#valeurA#1#pasliste"/>
        <item algoitem="AFFICHER &quot;la valeurB est:&quot;" code="4#la valeurB est:#0"/>
        <item algoitem="AFFICHER valeurB" code="3#valeurB#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
