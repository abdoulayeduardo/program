programa
{
	
	funcao inicio()
	{
		/*
		3- Faça um programa que receba o salário base de um funcionário, calcule 
		e mostre o salário a receber, sabendo-se que o funcionário tem gratificação 
		de 5% sobre o salário base e paga imposto de 7% também sobre o salário base.
		*/
		
		real salario_base, salario_receber
		cadeia nome

		escreva("Informe por favor o seu nome: ")
		leia(nome)
		escreva("Informe por favor o seu salário base: ")
		leia(salario_base)
		
		salario_receber=salario_base-(salario_base*0.02)
		
		escreva("\n\nOlá senhor(a) ",nome,", informar que o salário a receber é de ",salario_receber,"0 Kz\n\n\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */