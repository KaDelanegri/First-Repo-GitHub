//tabuada com repeti��o fa�a e enquanto n�mero e limite desejado
programa {
	funcao inicio() {
	    inteiro contador, limite, resultado, numero
	    escreva ("Qual n�mero voc� deseja a tabuada? ")
	    leia (numero)
	    escreva ("At� qual n�mero voc� deseja a multiplica��o? ")
	    leia (limite)
	    contador = 0
	    faca {
	        resultado = numero * contador
	        escreva (numero + " x " + contador + " = " + resultado + "\n")
	        contador ++
	    } 
	    enquanto (contador <= limite)
	}
}