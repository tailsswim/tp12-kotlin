tester_signe = lambda x: "positif" if x >= 0 else "négatif"

plusieurs_nombres = [12, -5, 0, -89, 43]

print("Exercice 4 - Résultats :")
for nb in plusieurs_nombres:
print(f"Le nombre {nb} est {tester_signe(nb)}")
