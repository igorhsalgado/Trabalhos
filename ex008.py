p1 = int(input('Digite a valor de P1:'))
p2 = int(input('Digite a valor de P2:'))
p3 = int(input('Digite a valor de P3:'))

if p1 > p2 > p3:
    print(f'1º lugar {p1} 2º lugar {p2} 3º lugar {p3}')
elif p1 > p3 > p2:
    print(f'1º lugar {p1} 2º lugar {p3} 3º lugar {p2}')
elif p2 > p1 > p3:
    print(f'1º lugar {p2} 2º lugar {p1} 3º lugar {p3}')
elif p2 > p3 > p1:
    print(f'1º lugar {p2} 2º lugar {p3} 3º lugar {p1}')
elif p3 > p2 > p1:
    print(f'1º lugar {p3} 2º lugar {p2} 3º lugar {p1}')
else:
    print(f'1º lugar {p3} 2º lugar {p1} 3º lugar {p2}')