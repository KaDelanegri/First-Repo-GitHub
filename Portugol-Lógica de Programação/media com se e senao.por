programa
{
	
	funcao inicio()
	{
		real venda1, venda2, venda3, venda4, salarioinicial, soma, media, salariofinal
		
		escreva ("Qual foi o valor da venda do mês 1? ")
		leia (venda1)
		escreva ("Qual foi o valor da venda do mês2 ? ")
		leia (venda2)
		escreva ("Qual foi o valor da venda do mês 3? ")
		leia (venda3)
		escreva ("Qual foi o valor da venda do mês 4? ")
		leia (venda4)
		escreva ("Qual o seu salário base? ")
		leia (salarioinicial)
		soma = venda1+venda2+venda3+venda4
		escreva ("O total de suas vendas foram: "+soma+"\n")
		media = (venda1 + venda2 + venda3 + venda4)/4
		escreva ("A média de vendas foi: "+media+"\n")
		
		se (media >= 3000) {
			salariofinal = (salarioinicial * 0.40) + salarioinicial
			escreva("\n"+ "Seu salário com comissão é de: R$" + salariofinal)
		}
		senao {
		salariofinal = (salarioinicial * 0.15) + salarioinicial
		escreva ("\n" + "Seu salário com comissão é de: R$" + salariofinal)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */