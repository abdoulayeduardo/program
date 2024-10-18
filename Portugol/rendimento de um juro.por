programa
{
	
	funcao inicio()
	{
	/*
	 4-Faça um programa que receba o valor de um depósito e o valor da taxa 
	 de juros, calcule e mostre o valor do rendimento e o valor total depois do 
	 rendimento.
	 */

	 real deposito, juro, valor_rend, valor_total
	 cadeia nome

	 escreva("Informe por favor o seu nome: ")
	 leia(nome)
	 escreva("Digite o valor do deposito: ")
	 leia(deposito)
	 escreva("Insire o número da taxa de juro: ")
	 leia(juro)

	 valor_rend=(deposito+juro)-deposito
	 valor_total=deposito+juro
	 escreva("\n\nResultados Obtidos:")
	 escreva("\nNome: ",nome)
	 escreva("\nValor Rendido: ",valor_rend,"0 Kz")
	 escreva("\nValor Total  : ",valor_total,"0 Kz\n\n\n\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */