fatorial = 1
cont = 1

num = int(input('Digite um número para calcular seu fatorial: '))

while cont <= num:
    fatorial *= cont
    cont += 1

print(f'O fatorial de {num} é igual a : {fatorial}.')