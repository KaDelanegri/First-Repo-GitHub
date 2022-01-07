//tabuada com repetição faça e enquanto número desejado
programa {
	funcao inicio() {
	    inteiro contador, limite, resultado, numero
	    escreva ("Qual número você deseja a tabuada? ")
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
