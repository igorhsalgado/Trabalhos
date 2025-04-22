salario_bruto = float(input('Digite o salário bruto: '))
valor_prestacao = float(input('Digite o valor da prestação: '))

limite = salario_bruto * 0.30

if valor_prestacao <= limite:
    print('Empréstimo pode ser concedido.')
else:
    print('Empréstimo NÃO pode ser concedido.')