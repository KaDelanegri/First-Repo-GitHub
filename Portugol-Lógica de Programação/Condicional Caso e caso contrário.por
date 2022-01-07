//função do algorítimo: cálculo de média de aluno com condicional se e senão
//Dev: Ka Delanegri
programa {
	funcao inicio() {
	    escreva ("Escolha um número: 1-Netflix, 2-HBO ou 3-Sair"+"\n")
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
		        escreva ("Digite um número válido")
		}
	}
}
