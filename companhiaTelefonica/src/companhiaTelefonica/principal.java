package companhiaTelefonica;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class principal 
{
	public static void main(String[] args) 
	{
		//Variaveis
		int opcao =0,supOpcao=0;
		//Objetos
		Scanner s = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		Scanner stringScan2 = new Scanner (System.in);
		Plano planoComp[]= new Plano[100];//Instancia de produto

		while(opcao!=3)
		{
			opcao = OpcoesMenu();
			switch(opcao)
			{
				case 1:
					
					while(supOpcao!=5)
					{
						supOpcao = subOpcoesMenu();
						switch(supOpcao)
						{
							case 1://Cadastro plano
								Plano p;
								int codigo;
								String descricao;
								float valorMensal;
								int franquia;
								float valorChamada;
								System.out.println("Digite o codigo:");
								codigo=s.nextInt();
								System.out.println("Digite o valor mensal:");
								valorMensal=s.nextFloat();
								System.out.println("Digite a descricao:");
								descricao=stringScan2.nextLine(); 
								System.out.println("Digite a franquia:");
								franquia=s.nextInt();
								System.out.println("Digite o valor da chamada:");
								valorChamada=stringScan.nextFloat();
								p=new Plano(codigo, descricao, valorMensal, franquia, valorChamada);
								Gerente.adicionaPlano(p);
								break;
							case 2://Cadastro cliente
								long CPF;
								String nome;
								Endereco endereco=new Endereco();
								Cliente c;
								System.out.println("Digite o CPF:");
								CPF=s.nextLong();
								System.out.println("Digite o nome:");
								nome=stringScan.nextLine();
								System.out.println("Digite o bairro:");
								endereco.setBairro(stringScan2.nextLine());
								System.out.println("Digite a cidade:");
								endereco.setCidade(stringScan.nextLine());
								System.out.println("Digite o estado:");
								endereco.setEstado(stringScan.nextLine());
								System.out.println("Digite a rua:");
								endereco.setRua(stringScan.nextLine());
								System.out.println("Digite o numero da casa:");
								endereco.setNumero(stringScan.nextInt());
								c=new Cliente(CPF, nome, endereco);
								Gerente.adicionaCliente(c);
								
								break;
							case 3://Cadastro NumeroTelefone
								long numero;
								Cliente cliente;
								Plano plano;
								int[] diaspagamento= {1,5,10,15};
								System.out.println("Digite o numero de telefone:");
								numero=s.nextInt();
								System.out.println("Digite o CPF do cliente:");
								c=Gerente.pesquisaCliente(s.nextInt());
								System.out.println("Digite o codigo do plano:");
								p=Gerente.pesquisaPlano(s.nextInt());
								NumerodeTelefone telefone=new NumerodeTelefone(numero, c, p, null, diaspagamento);
								Gerente.adicionaTelefone(telefone);
								break;
							case 4://Cadastro ChamadaTelefonica
								NumerodeTelefone numeroOrigem;
								long telefoneDestino;
								Date dataInicio=new Date();
								Date dataTermino=new Date();
								System.out.println("Digite o numero de origem:");
								numeroOrigem=Gerente.pesquisaNumerodeTelefone(s.nextLong());
								System.out.println("Digite o numero de destino:");
								telefoneDestino=s.nextLong();
								System.out.println("Digite o dia da data de inicio:");
								dataInicio.setDate(s.nextInt());
								System.out.println("Digite o mes da data de inicio:");
								dataInicio.setMonth(s.nextInt());
								System.out.println("Digite a hora da data de inicio:");
								dataInicio.setHours(s.nextInt());
								System.out.println("Digite o minuto da data de inicio:");
								dataInicio.setMinutes(s.nextInt());
								System.out.println("Digite o dia da data de termino:");
								dataTermino.setDate(s.nextInt());
								System.out.println("Digite o mes da data de termino:");
								dataTermino.setMonth(s.nextInt());
								System.out.println("Digite a hora da data de termino:");
								dataTermino.setHours(s.nextInt());
								System.out.println("Digite o minuto da data de termino:");
								dataTermino.setMinutes(s.nextInt());
								Chamada_Originada chamada=new Chamada_Originada(numeroOrigem, telefoneDestino, dataInicio, dataTermino);
								Gerente.adicionaChamada(chamada);
								
								break;
						
							default:

								break;	
						}
					}
					break;
				case 2://Gera relatorios
					System.out.println("Digite o numero de telefone para ser gerado Relatorio:");

					System.out.println("Digite o mes a ser gerado Relatorio:");
					

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
		Scanner inOp = new Scanner (System.in);
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Fazer um cadastro");
			System.out.println("2.Gerar relatorio");
			System.out.println("3.Sair");
			opcao = inOp.nextInt();
		
		return opcao;
	}
	public static int subOpcoesMenu()
	{
		int opcao = 0;
		Scanner insubOp = new Scanner (System.in);
		System.out.println("Qual cadastro voce fara das opcoes abaixo: ");
		System.out.println("1.Plano");
		System.out.println("2.Cliente");
		System.out.println("3.NumeroTelefone");
		System.out.println("4.ChamadaTelefonica");
		System.out.println("5.Sair");
		opcao = insubOp.nextInt();
		return opcao;
	}
	
	
}
