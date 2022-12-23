Ce projet contient les fichiers de mise en place d'une base de donnees relationnelle et d'insertion de donnees initiales, de tests.

Il n'en contient que deux mais on peut avoir de nombreux fichiers dans la vie d'un projet pour le faire evoluer en fonction
des besoins. Aussi on ne doit pas reexecuter (rejouer) certains fichiers plusieurs fois au risque de supprimer les donnees.

On distingue deux types de fichiers en fonction des instructions SQL qu'ils contiennent, on separe les responsabilites.
Techniquement on pourrait avoir un seul fichier, mais en plus de separer les responsabilites, ça permet de pouvoir les livrer separement.

1. schema.ddl.sql

Ce fichier dit "DDL" (Data Definition Language) contient les instructions pour definir le schema de la base de donnees.
Un schema de base de donnees est compose de plusieurs "objets" dont les tables. On parle de tables car on se represente la structure 
des donnees sour la forme de tables (ou tableaux). Les tables contiennent la definition de leurs colonnes.

En phase de developpement ou de test, on peut avoir besoin de rejouer plusieurs fois la definition d'un schema, 
le fichier contient donc des instructions pour supprimer (drop) les tables avant de les recreer par soucis de simplicite dans cette phase.

2. data.dml.sql

Ce fichier dit "DML" (Data Manipulation Language) contient les instructions pour inserer, modifier ou supprier des donnees en fonction 
des besoins.

Comme pour le DDL, on peut avoir besoin de rejouer le fichier en phase de developpement ou de test, le fichier contient donc des 
instructions pour vider (delete) les tables avant de les alimenter a nouveau.