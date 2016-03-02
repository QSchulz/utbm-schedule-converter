# utbm-schedule-converter
Convertir du nouveau modèle Mon Espace vers l'ancien modèle SME qui est accepté sur le site de l'AE

# Installation
Rien à faire si tu me fais confiance, tu télécharges le .jar (que tu sois sous Windows, Mac ou Linux, il te faut Java installé) et tu le lances:
 - depuis un terminal Linux avec:
>java -jar utbm-schedule-converter_vx.x.jar
 - en double-cliquant dessus;
 
Tu sens le troll à plein nez et je vais sûrement utiliser ton ordinateur pour hacker la NASA, le FBI et HADOPI à la fois et déclencher une enquête sur toi pour téléchargement illégal des plans d'une navette spatiale?

Tu télécharges le dossier "src", tu te fous dedans et tu le compiles. Ah ça fait moins le malin hein? Bon, aller, je te donne un petit coup de main:

> javac Creneau.java Main.java

> java Main
 
# Utilisation
Ouvre ton emploi du temps dans Mon Espace et copie tout le tableau (oui, même avec la ligne commençant par "Site"). Tu le colles dans le logiciel, ça devrait te donner quelque chose comme ça:

>Site	UV		Groupe	Jour	Début	Fin	Fréquence	Salle

>HE08		TD 2	lundi	14:00	16:00	1	P323

>HE08		CM 1	lundi	18:15	19:45	1	T306

>Sevenans	MC51		CM 1	mardi	8:00	10:00	1	P418

>Sevenans	MC51		TD 2	mardi	14:00	16:00	1	P235

>EI03		CM 1	mardi	16:15	17:45	1	P369

>EI03		TD 1	mardi	17:45	19:45	1	P369

>Sevenans	MC58		TD 1	mercredi	10:15	12:15	1	P106

>Sevenans	MC51		TP 2	mercredi	13:00	16:00	2	P103

>Sevenans	MC53		TP 1	mercredi	16:15	19:15	2	P103

>Sevenans	MC53		TD 1	jeudi	8:00	10:00	1	P103

>Sevenans	MC58		CM 1	jeudi	10:15	12:15	1	P106

>LK00		TP 1	jeudi	13:00	14:00	1	P365

>LK00		TD 1	jeudi	14:00	16:00	1	P365

>Sevenans	MC53		CM 1	vendredi	10:15	12:15	1	P106

>Sevenans	MC58		TP 1	vendredi	13:00	16:00	2	P103

Ne change absolument rien :)

Tu cliques sur Menu puis Convertir. Et zblaaaa, t'as ton emploi du temps dans l'ancien format.

Tu te rends sur le site de l'AE : https://ae.utbm.fr/pedagogie/ et tu cliques sur "Importer emploi du temps depuis le mail du SME".

Tu copie-colles ton emploi du temps dans l'ancien format dedans et tu reçois un emploi du temps en image... WAAAAAAAH!

# Ça marche pas !

- Tu vérifies que t'as bien tout collé (ET PAS OUBLIÉ LA PREMIÈRE LIGNE),
- Tu me contactes avec l'adresse mail qu'il y a sur le Matmatronch' ou tu ouvres une Issue ici (montre moi ta geekness!),
- Tu mets en pièce jointe (PAS DE COPIÉ-COLLÉ) ton nouvel emploi du temps ET ce que retourne le logiciel (et éventuellement l'image que te donne le site de l'AE);

# Trop cool !
Paie moi une bière la prochaine fois que tu me vois.
