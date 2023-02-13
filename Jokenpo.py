import random
vencedor = ""
#Funcao
def faz_jogada(jog1, jog2):
    if jog2 == 1:
        print("Computador: Pedra")

        if jog1 == 1:
            vencedor = "empate"
        elif jog1 == 2:
            vencedor = "Jogador venceu"
        elif jog1 == 3:
            vencedor = "Computador venceu"

    elif jog2 == 2:
        print("Computador: Papel")

        if jog1 == 2:
            vencedor = "empate"
        elif jog1 == 3:
            vencedor = "Jogador venceu"
        elif jog1 == 1:
            vencedor = "Computador venceu"

    elif jog2 == 3:
        print("Computador: Tesoura")

        if jog1 == 3:
            vencedor = "empate"
        elif jog1 == 1:
            vencedor = "Jogador venceu"
        elif jog1 == 2:
            vencedor = "Computador venceu"

    else:
        print("errado")
    return vencedor

#Cabecalho
print("******************")
print("     JO KEN PO    ")
print("******************")

#Pedir Jogada
print("Escolha pedra, papel ou tesoura")
print("1- Pedra")
print("2- Papel")
print("3- Tesoura")

jogada = int(input())

jogada_Computador = random.randint(1,3)

vencedor = faz_jogada(jogada, jogada_Computador)
print("O vencedor foi " + vencedor)

