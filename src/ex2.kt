def countElements(liste, fonction_lambda):
compteur = 0
for element in liste:
if fonction_lambda(element):
compteur += 1
return compteur

nombres = [12, 45, 78, 23, 89, 60, 71]

est_pair = lambda x: x % 2 == 0
pairs_comptes = countElements(nombres, est_pair)
print("Exercice 2 - Nombre d'éléments pairs :", pairs_comptes)

sup_70 = lambda x: x > 70
sup_70_comptes = countElements(nombres, sup_70)
print("Exercice 2 - Nombre d'éléments > 70 :", sup_70_comptes)
