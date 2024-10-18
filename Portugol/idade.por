programa
{
	inclua biblioteca Calendario
-->c
	
	funcao inicio()
	{
		 inteiro idade,ano
		 inteiro ano_actual=c.ano_atual()
		 cadeia nome
		 
		 escreva("Informe por favor o seu nome: ")
		 leia(nome)
		 
		 escreva("Informe a sua data de nascimento []\n")
		 leia(ano)
		 
		 limpa()
		 se(ano>ano_actual ou ano<=1910){
		 	escreva("Data inválida\n\n\n")
		 }
		 senao{
			 idade=ano_actual-ano
			 
			 limpa()
			 escreva("Olá ",nome,", informar que estas com ",idade," anos de idade!\n\n\n\n\n\n\n")
		 }
	
	}
}
