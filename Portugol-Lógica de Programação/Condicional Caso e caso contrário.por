//fun��o do algor�timo: c�lculo de m�dia de aluno com condicional se e sen�o
//Dev: Ka Delanegri
programa {
	funcao inicio() {
	    escreva ("Escolha um n�mero: 1-Netflix, 2-HBO ou 3-Sair"+"\n")
		inteiro menu = 0
		leia (menu)
		escolha (menu) {
		    caso 1:
		        escreva ("Abrir Netflix" + "\n")
		        pare
		        caso 2: 
		        escreva ("Abrir HBO"+"\n")
		        pare
		        caso 3:
		        escreva ("Saindo")
		        pare
		        caso contrario:
		        escreva ("Digite um n�mero v�lido")
		}
	}
}
