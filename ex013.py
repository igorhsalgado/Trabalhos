
salario_minimo = 1518
valor_hora = float(input('Digite o valor da hora-aula: '))
num_aulas = int(input('Digite o número de aulas no mês: '))
desconto_inss = float(input('Digite o percentual de desconto do INSS: '))

salario_bruto = valor_hora * num_aulas
valor_desconto = salario_bruto * (desconto_inss / 100)
salario_liquido = salario_bruto - valor_desconto

print(f'Salário líquido: R$ {salario_liquido:.2f}')

salarios_recebidos = salario_liquido / salario_minimo

if salarios_recebidos > 10:
    print('Parabéns pelo seu esforço!')
elif 6 <= salarios_recebidos <= 9:
    print('Um dia você chega lá!')
else:
    print('Ah! Precisa se esforçar!')