soma_resto = 0

for x in range(1,201):
    num = int(input(f'Digite o {x}º número: '))
    resto = num % 3
    print(f'O resto desse número é igual a: {resto}.')
    soma_resto += resto

print(f'A soma dos restos da divisão é igual a: {soma_resto}.')