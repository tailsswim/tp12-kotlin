def findMax(liste, fonction_lambda):
plus_grand = liste[0]
for element in liste:
plus_grand = fonction_lambda(plus_grand, element)
return plus_grand

le_plus_grand = lambda a, b: a if a > b else b

ma_liste = [14, 52, 8, 91, 23]
resultat_ex1 = findMax(ma_liste, le_plus_grand)
print("Exercice 1 - Le plus grand nombre est :", resultat_ex1)
