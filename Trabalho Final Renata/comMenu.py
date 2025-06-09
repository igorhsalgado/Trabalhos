setores = ["Secretaria Administrativa", "Atendimento Geral", "Análise Operacional"]
tarefas = ["Organização Arquivos", "Atendimento ao Cliente", "Análise de Dados", "Suporte Técnico"]

matriz_tarefas = [["" for j in range(4)] for i in range(3)]
matriz_horarios = [["" for j in range(4)] for i in range(3)]

opcao = -1
while opcao != 0:
    print("\nMenu Principal:")
    print("1 - Cadastrar dados")
    print("2 - Listar dados")
    print("3 - Buscar dados")
    print("4 - Atualizar dados")
    print("5 - Relatório filtrado")
    print("0 - Sair")

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        for i in range(3):
            print(f"\nSetor: {setores[i]}")
            for j in range(4):
                tarefa = input(f"Tarefa '{tarefas[j]}' realizada? (sim/não): ").strip().lower()
                horario = input(f"Horário da tarefa '{tarefas[j]}': ").strip()
                if tarefa not in ["sim", "não"]:
                    print("Valor inválido! Use 'sim' ou 'não'.")
                    tarefa = "não"
                matriz_tarefas[i][j] = tarefa
                matriz_horarios[i][j] = horario

    elif opcao == 2:
        print("\n--- MATRIZ DE TAREFAS ---")
        print("      ", end="")
        for t in tarefas:
            print(f"{t:^15}", end="")
        print()
        for i in range(3):
            print(f"{setores[i]:<6}", end="")
            for j in range(4):
                print(f"{matriz_tarefas[i][j]:^15}", end="")
            print()

        print("\n--- MATRIZ DE HORÁRIOS ---")
        print("      ", end="")
        for t in tarefas:
            print(f"{t:^15}", end="")
        print()
        for i in range(3):
            print(f"{setores[i]:<6}", end="")
            for j in range(4):
                print(f"{matriz_horarios[i][j]:^15}", end="")
            print()

    elif opcao == 3:
        linha = input("Digite o nome do setor (RH, TI, Financeiro): ").strip()
        coluna = input("Digite o nome da tarefa (Reunião, Relatório, Atendimento, Organização): ").strip()
        if linha in setores and coluna in tarefas:
            i = setores.index(linha)
            j = tarefas.index(coluna)
            print(f"\nTarefa realizada: {matriz_tarefas[i][j]}")
            print(f"Horário: {matriz_horarios[i][j]}")
        else:
            print("Setor ou tarefa não encontrado.")

    elif opcao == 4:
        i = int(input("Digite o número da linha (0-RH, 1-TI, 2-Financeiro): "))
        j = int(input("Digite o número da coluna (0-Reunião, 1-Relatório, 2-Atendimento, 3-Organização): "))
        if 0 <= i < 3 and 0 <= j < 4:
            nova_tarefa = input("Novo valor (sim/não): ").strip().lower()
            novo_horario = input("Novo horário: ").strip()
            matriz_tarefas[i][j] = nova_tarefa
            matriz_horarios[i][j] = novo_horario
        else:
            print("Índice fora do intervalo.")

    elif opcao == 5:
        filtro = input("Exibir tarefas com qual status? (sim/não): ").strip().lower()
        print(f"\nRelatório de tarefas com status '{filtro}':")
        for i in range(3):
            for j in range(4):
                if matriz_tarefas[i][j] == filtro:
                    print(f"Setor: {setores[i]}, Tarefa: {tarefas[j]}, Horário: {matriz_horarios[i][j]}")
    elif opcao == 0:
        print("Encerrando o programa...")
    else:
        print("Opção inválida.")