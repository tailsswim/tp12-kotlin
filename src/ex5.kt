def lireEntier():
while True:
try:
saisie = input("Veuillez entrer un nombre entier : ")
nombre = int(saisie)
print("Vous avez entré le nombre valide :", nombre)
return nombre
except ValueError:
print("Erreur : Ce n'est pas un nombre entier valide. Réessayez.")

lireEntier()
