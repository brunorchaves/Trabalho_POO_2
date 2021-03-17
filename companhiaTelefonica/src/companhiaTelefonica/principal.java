package companhiaTelefonica;
import java.util.Scanner; //importa classe que possui recursos
import java.util.Arrays;


public class principal 
{
	Scanner in = new Scanner (System.in);
	Scanner stringScan = new Scanner (System.in);

	public static void main(String[] args) 
	{
		int codigo;
		String descricao;
		float valorMensal;
		float franquia;
		float valorChamada;
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		Plano planoComp[]= new Plano[100];//Instancia de produto	
		System.out.println("Adicione um novo Plano: ");
		System.out.println("Digite o Codigo do novo produto:\n ");
		codigo = in.nextInt();
		System.out.println("Digite a descricao do novo produto:\n ");
		descricao = stringScan.nextLine();
		System.out.println("Digite a valorMensal Plano:\n ");
		valorMensal = in.nextFloat();
		System.out.println("Digite a franquia do novo produto:\n ");
		franquia = in.nextFloat();
		System.out.println("Digite o valorChamada do novo produto:\n ");
		valorChamada = in.nextFloat();

		planoComp[codigo]=new Plano(codigo,descricao,valorMensal,franquia,valorChamada);
		int opcao =0;
	
		while(opcao!=3)
		{
			opcao = OpcoesMenu();
			switch(opcao)
			{
				case 1:
					break;
				case 2:
					break;
				default:
					break;
			}
		}
	}
	/*********************************************************************
	* @fn      OpcoesMenu
	*
	* @brief   loop que roda as funcoes do menu
	*
	* @param   Metodo que gera o texto com as opcoes do menu, chamada na 
	*		   funcao do menu
	*
	* @return  opcao
	*/
	public static int OpcoesMenu()
	{
		int opcao = 0;
		Scanner in = new Scanner (System.in);
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Fazer um cadastro");
			System.out.println("2.Encontrar o produto com o maior preco de venda");
			System.out.println("3.Sair");
			opcao = in.nextInt();
		
		return opcao;
	}
	public static int subOpcoesMenu()
	{
		int opcao = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Qual cadsastro voce fara das opcoes abaixo: ");
		System.out.println("1.Plano");
		System.out.println("2.Cliente");
		System.out.println("3.NumeroTelefone");
		System.out.println("4.ChamadaTelefonica");
		opcao = in.nextInt();
		
		return opcao;
	}
	
	
}
