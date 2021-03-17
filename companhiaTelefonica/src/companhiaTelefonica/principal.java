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
					
	}

}
