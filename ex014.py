condicao = 1
while (condicao != 0):
    condicao = int(input('Digite 1 para continuar: '))

    altura = float(input('Digite sua altura: '))
    peso = float(input('Digite seu peso: '))

    imc = peso / (altura*altura)
    if imc < 20:
        print('Seu IMC está classificado como Abaixo do Peso.')
    elif imc > 20 and imc < 26:
        print('Seu IMC está classificado como Normal.')
    elif imc > 26 and imc < 35:
        print('Seu IMC está classificado como Excesso de Peso.')
    elif imc > 35 and imc < 51:
        print('Seu IMC está classificado como Obeso.')
    else:
        print('Seu IMC está classificado como Obesidade Mórbida.')
    
    condicao = int(input('Digite 0 para sair: '))