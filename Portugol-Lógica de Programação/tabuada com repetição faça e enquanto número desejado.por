//tabuada com repeti��o fa�a e enquanto n�mero desejado
programa {
	funcao inicio() {
	    inteiro contador, limite, resultado, numero
	    escreva ("Qual n�mero voc� deseja a tabuada? ")
	    leia (numero)
	    contador = 0
	    limite = 10
	    
	    faca {
	        resultado = numero * contador
	        escreva (numero + " x " + contador + " = " + resultado + "\n")
	        contador ++
	    } 
	    enquanto (contador <= limite)
	}
}
