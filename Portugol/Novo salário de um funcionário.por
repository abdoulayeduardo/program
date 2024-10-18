programa
{
	
	funcao inicio()
	{
	
	/*
	2- Faça um programa que receba o salário de um funcionário e o percentual 
	de aumento, calcule e mostre o valor do aumento e o novo salário.
	*/

	real salario,valor_aumento,novo_salario
	real percentual
	cadeia nome

	escreva("Informe por favor o seu nome: ")
	leia(nome)
	escreva("Informe por favor o seu salário: ")
	leia(salario)
	escreva("Agora, informe por favor o percentual de aumento (%): ")
	leia(percentual)
	
	valor_aumento=(percentual/100)*salario
	novo_salario=(valor_aumento+salario)
	
	escreva("\n\nResultados Obtidos:")
	escreva("\nNome: ",nome)
	escreva("\nValor de Aumento: ",valor_aumento,"0 Kz")
	escreva("\nNovo Salário: ",novo_salario,"0 Kz\n\n\n\n\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 541; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */