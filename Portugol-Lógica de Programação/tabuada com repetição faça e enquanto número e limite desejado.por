//tabuada com repetição faça e enquanto número e limite desejado
programa {
	funcao inicio() {
	    inteiro contador, limite, resultado, numero
	    escreva ("Qual número você deseja a tabuada? ")
	    leia (numero)
	    escreva ("Até qual número você deseja a multiplicação? ")
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