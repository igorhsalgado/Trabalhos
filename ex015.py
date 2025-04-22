condicao = 1
while (condicao != 0):
    condicao = int(input('Digite 1 pra continuar: '))

    lado1 = float(input('Digite o valor do primeiro lado: '))
    lado2 = float(input('Digite o valor do segundo lado: '))
    lado3 = float(input('Digite o valor do terceiro lado: '))

    if lado1 == lado2 == lado3:
        print('O triangulo em questão é um equilátero.')
    elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
        print('O triangulo em questão é um isóceles.')
    else:
        print('O triangulo em questão é um escaleno.')

    condicao = int(input('Digite 0 pra sair: '))