def calculer(num1, num2, operation_anonyme):
return operation_anonyme(num1, num2)

a = 15
b = 5

print("Exercice 3 - Addition :", calculer(a, b, lambda x, y: x + y))
print("Exercice 3 - Soustraction :", calculer(a, b, lambda x, y: x - y))
print("Exercice 3 - Multiplication :", calculer(a, b, lambda x, y: x * y))
print("Exercice 3 - Division :", calculer(a, b, lambda x, y: x / y if y != 0 else "Erreur: Division par zéro"))
