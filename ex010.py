media = float(input('Digite a média do aluno: '))
faltas = int(input('Digite o número de faltas do aluno: '))

if media >= 7 and faltas < 32:
    print('Aluno aprovado.')
elif media < 7 and faltas >= 32:
    print('Aluno reprovado por média e por falta.')
elif media < 7:
    print('Aluno reprovado por média.')
else:  
    print('Aluno reprovado por falta.')