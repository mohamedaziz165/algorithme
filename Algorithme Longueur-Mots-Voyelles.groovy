Algorithme Longueur-Mots-Voyelles
Fonction compterLongueur(texte: Chaine de caractères): Entier
    Variables
        i, compteurLongueur, nombreMots, nombreVoyelles: Entier
        voyelles: Chaine de caractères
        dernier_espace: Booléen
    Début
        compteurLongueur ← 0
        nombreMots ← 0
        nombreVoyelles ← 0
        voyelles ← "aeiouAEIOU"
        dernier_espace ← Vrai

        Pour i ← 0 à longueur(texte)-1
            compteurLongueur ← compteurLongueur + 1  // On compte chaque caractère

            Si texte[i] = ' ' Alors
                dernier_espace ← Vrai
            Sinon
                Si dernier_espace = Vrai et texte[i] ≠ '.' Alors
                    nombreMots ← nombreMots + 1
                FinSi
                dernier_espace ← Faux
            FinSi

            Si texte[i] dans voyelles Alors
                nombreVoyelles ← nombreVoyelles + 1
            FinSi

            Si texte[i] = '.' Alors
                Sortir de la boucle
            FinSi
        FinPour

        Retourner compteurLongueur, nombreMots, nombreVoyelles
Fin


