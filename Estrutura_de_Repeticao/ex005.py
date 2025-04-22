cont = 0

while (cont == 0):
    senha = str(input('Digite uma senha: '))

    if len(senha) < 8:
        print('Digite uma senha válida.')
    else:
        print('Sua senha foi salva.')
        cont =+ 1