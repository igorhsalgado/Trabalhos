sal = float(input('Qual o valor do salário do funcionário: '))

if sal < 500:
    sal = sal + (sal * 0.15)
elif sal >= 500 and sal <= 1000:
    sal = sal + (sal * 0.1)
elif sal < 1000:
    sal = sal + (sal * 0.05)

print(f'O salário após reajuste é de {sal} reais.')