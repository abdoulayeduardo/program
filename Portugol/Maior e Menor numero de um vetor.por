programa
{
	
	funcao inicio()
	{
		inteiro maior=0, menor, n[5]

		para(inteiro i=0; i<5; i++){
			escreva((i+1)+"º Número: ")
			leia(n[i])
		}
		menor=n[4]
		para(inteiro i=0; i<5; i++){
			se(n[i]>maior){
				maior=n[i]
			}
			se(menor>n[i]){
				menor=n[i]
			}
		}

		escreva("\n\nO maior número é "+maior)
		escreva("\nO menor número é "+menor+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */