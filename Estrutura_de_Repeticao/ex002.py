num = int(input('Digite um número: '))
soma = 0
cont = 1

if num < 1:
    print('Digite um número maior que 1, para que o programa possa funcionar.')
else:
    while cont <= num:

        soma += cont 
        cont += 1

print(f'A soma de 1 até {num} é igual a {soma}.')