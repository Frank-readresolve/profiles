-- On supprime les tables si elles existent pour pouvoir rejouer le script
-- Elles sont supprimees dans un ordre logique en fonction des besoins, les tables qui referencent
-- d'autres tables sont supprimees avant les tables qui sont referencees
DROP TABLE IF EXISTS profiles;
DROP TABLE IF EXISTS languages;

-- La table languages est referencee par la table profiles, elle doit donc etre creee avant
CREATE TABLE languages (
	-- La clef primaire (PK) garantit que chaque enregistrement est unique
	-- Elle est numerique pour des raisons de performance dans les jointures
	-- SERIAL est un pseudo type PostgreSQL, indique que la clef est de type INTEGER et est "auto incrementee"
	id SERIAL PRIMARY KEY,
	-- VARCHAR est un type et (100) une précision sur le type, ici max 100 caracteres
	-- UNIQUE et NOT NULL sont des contraintes sur la colonne (les donnees stockees)
	name VARCHAR(100) UNIQUE NOT NULL -- Clef secondaire (unique), identifiant naturel/fonctionnel de l'entite
);

CREATE TABLE profiles (
	-- Pas necessaire de specifier une contrainte NOT NULL sur une PK
	-- Une PK ne peut pas etre null
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(150) NOT NULL,
	last_name VARCHAR(150) NOT NULL,
	email VARCHAR(255) UNIQUE NOT NULL, -- Clef secondaire
	trainer BOOLEAN NOT NULL,
	created_at TIMESTAMP NOT NULL,
	last_updated_at TIMESTAMP,
	preferred_language_id INTEGER,
	-- Ajout d'une contrainte de clef etrangere (FK) sur la colonne preferred_language_id
	-- Permet de garantir que la clef stockee dans la colonne existe bien dans la colonne referencee
	-- La colonne referencee (id) est la PK d'une autre table (languages)
	CONSTRAINT fk_preferred_language_id 
		FOREIGN KEY(preferred_language_id)
		REFERENCES languages(id)
);
