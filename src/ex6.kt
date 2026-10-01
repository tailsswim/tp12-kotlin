def convertToInteger(liste_chaines):
nouvelle_liste = []
for chaine in liste_chaines:
try:
nombre = int(chaine)
nouvelle_liste.append(nombre)
except ValueError:
print(f"Erreur : Impossible de convertir '{chaine}' en entier. Passage à la suite.")
return nouvelle_liste

liste_test = ["10", "abc", "25", "4.5", "90"]
liste_resultat = convertToInteger(liste_test)
print("Exercice 6 - Liste finale des entiers convertis :", liste_resultat)
