condicao = 1
while (condicao != 0):
    condicao = int(input('Digite 1 pra continuar: '))

    idade = int(input('Digite a idade do nadador: '))

    if idade < 5:
        print('O nadador em questão não pode ser classificado, devido a pouca idade.')
    elif idade > 5 and idade < 8:
        print('O nadador em questão está classificado como Infantil A!')
    elif idade > 8 and idade < 12:
        print('O nadador em questão está classificado como Infantil B!')
    elif idade > 12 and idade < 14:
        print('O nadador em questão está classificado como Juvenil A!')
    elif idade > 14 and idade < 18:
        print('O nadador em questão está classificado como Juvenil B!')
    else:
        print('O nadador em questão está classificado como Adulto!')
    
    condicao = int(input('Digite 0 para sair: '))