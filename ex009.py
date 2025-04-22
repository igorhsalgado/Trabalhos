nome = input('Digite o nome do aluno: ')
notaTrabalho = float(input('Digite a nota do trabalho: '))
notaProva = float(input('Digite a nota da prova: '))

media = (notaProva + notaProva) / 2

if media >= 7:
    print(f'O aluno {nome} está aprovado.')
else:
    print(f'O aluno {nome} está reprovado.')