-- On vide les tables dans un ordre logique, en premier les profiles car ils referencent les langages
DELETE FROM profiles;
DELETE FROM languages;

-- On specifie les colonnes dans lesquelles ont souhaite inserer des donnees
-- Les colonnes obligatoires (NOT NULL) doivent necessairement avoir des donnees inserees
INSERT INTO languages 
	(name)
	VALUES -- Insertion par lots (bulk insert), plusieurs series de valeurs separees par des virgules
	('JavaScript'), ('CSS'), ('HTML'), ('Java'), ('SQL');

-- Il est possible d'imbriquer des requetes SQL, ici on recupere "dynamiquement" l'id du langage
-- par une requete select
-- On s'appuie sur l'identifiant naturel/fonctionnel (unique) pour selectionner le langage souhaite
-- On peut utiliser des fonctions comme ici now() pour que la base de donnees insere la date et l'heure du moment de l'execution
-- On specifie null si la colonne est nullable et qu'on ne souhaite pas inserer de donnee dedans
INSERT INTO profiles 
	(first_name, last_name, email, trainer, created_at, preferred_language_id)
	VALUES
	('Frank', 'MARSHALL', 'frank@domain.com', true, now(), (
		SELECT id from languages WHERE name = 'Java'
	)),
	('Robert', 'DUPONT', 'robert@domain.com', false, now(), (
		SELECT id from languages WHERE name = 'CSS'
	)),
	('Massi', 'ZELE', 'massi@domain.com', false, now(), null);
