import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
			 Hospede hospedes = new Hospede();
			
			Scanner sc = new Scanner(System.in);
			int i,v, op;
			int quartos[];
			quartos = new int[20];
			
			do
			{
				
                System.out.println("--------------------");
				System.out.println("1- CADASTRAR-HOSPEDE");
				System.out.println("2- REMOVER");
				System.out.println("3- REMOVER TODOS");
				System.out.println("4- IMPRIMIR QUARTOS");
				System.out.println("---------------------"); 
				System.out.println("5- Sair");
				System.out.println("---------------------");
				System.out.println("Escolha a operacao desejada:");
				op = sc.nextInt();
				
				
				switch(op)
				{
					
				case 1: // opcao de cadastro de usuario

				
				System.out.println("Escolha o quarto");
					i= sc.nextInt();
					
					if (i<20)
					{
						
					
						if (quartos[i]== 0) // caso o quarto esteja desocupado ... 
						{
						
							System.out.println("Digite seu Nome:");
							hospedes.setNome(sc.next());
							System.out.println("Digite o Sobrenome");
							hospedes.setSobrenome(sc.next());
							
							
							System.out.printf("Hospede registrado com sucesso no quarto %d\n", i); // cadastro efetuado com sucesso
							quartos[i] = 1; // quarto esta agora ocupado
							
						}else
						{
							System.out.println("Quarto Ocupado!"); // caso quarto ja esteja ocupado informe o usuario disso
						}
					}else
					{
						System.out.println("Quarto inexistente");
					}
					break;
				case 2:
					System.out.println("Escolha o quarto"); // removendo usuario de um quarto
					i= sc.nextInt();
					if (quartos[i]== 0)// se o quarto estiver vazio
					{
						System.out.printf("Quarto %d encontra-se vazio no momento!\n", i); // informe que o quarto ja esta vazio e nao tem ninguem para ser removido
												
					}else // senao
					{
						System.out.println("Hóspede removido do quarto com sucesso!"); // remova o hospedo do quarto
						quartos[i]= 0; // quarto agora esta vazio
					}
					break;
				case 3:
					System.out.println("Todos hóspedes removidos com sucesso"); // removendo toodos os hospedes de uma soh vez
					for(v=0;v<20;v++)
					{
						quartos[v]= 0; // todos os quartos agora estao vazios
					}
					break;
				case 4:
					System.out.println("Listagem de quartos!"); // exibindo uma lista de todos os quartos.. c
					for (i=0;i<quartos.length;i++)
					{
						if (quartos[i]==0) // verifica se esta vazio(o quarto)
						{ 
							System.out.printf("Quarto: %d: ----Livre\n",i);// exibie quarto vazio 
						}else
						{
							System.out.printf("Quarto: %d: ----Ocupado\n \n",i); // quarto ocupado 
							System.out.println("Nome do Hospede: " + hospedes.getNome() + " " + hospedes.getSobrenome() + "\n");
						}
					}
					break;
				
				default:
					System.out.println("Opcao invalida"); // tratando uma excessao 
				}
				
				
				
			}while(op!=5); // ate o usuario escolher a opcao 5 - sair
    }
}

