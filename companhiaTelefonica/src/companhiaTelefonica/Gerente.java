package companhiaTelefonica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Gerente {
	
	private static ArrayList<Cliente> clientes=new ArrayList<Cliente>();
	private static ArrayList<Chamada_Originada> chamadas=new ArrayList<Chamada_Originada>();
	private static ArrayList<NumerodeTelefone> telefones=new ArrayList<NumerodeTelefone>();
	private static ArrayList<Plano> planos=new ArrayList<Plano>();
	
	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public static void setClientes(ArrayList<Cliente> clientes) {
		Gerente.clientes = clientes;
	}
	public static ArrayList<Chamada_Originada> getChamadas() {
		return chamadas;
	}
	public static void setChamadas(ArrayList<Chamada_Originada> chamadas) {
		Gerente.chamadas = chamadas;
	}
	public static ArrayList<NumerodeTelefone> getTelefones() {
		return telefones;
	}
	public static void setTelefones(ArrayList<NumerodeTelefone> telefones) {
		Gerente.telefones = telefones;
	}
	public static ArrayList<Plano> getPlanos() {
		return planos;
	}
	public static void setPlanos(ArrayList<Plano> planos) {
		Gerente.planos = planos;
	}
	public static boolean adicionaPlano(Plano p) {
		if(Gerente.isValidaPlano(p)) {
			planos.add(p);
			System.out.println("Operacao bem sucedida!");
			return true;
		}else {
			System.out.println("Operacao falhou!!");
			return false;
		}
	}
	public static boolean adicionaCliente(Cliente c) {
		if(isValidaCliente(c)) {
			clientes.add(c);
			System.out.println("Operacao bem sucedida!!");
			return true;
		}else {
			System.out.println("Operacao falhou!!");
			return false;
		}
	}
	public static boolean adicionaTelefone(NumerodeTelefone t) {
		if(isValidaNumeroTelefone(t)) {
			telefones.add(t);
			System.out.println("Operacao bem sucedida!!");
			return true;
		}else {
			System.out.println("Operacao falhou!!");
			return false;
		}
	}
	public static boolean adicionaChamada(Chamada_Originada c) {
		if(isValidaChamada(c)) {
			chamadas.add(c);
			System.out.println("Operacao bem sucedida!!");
			return true;
		}else {
			System.out.println("Operacao falhou!!");
			return false;
		}
	}
	public static boolean isValidaCliente(Cliente cliente) {
		if(pesquisaCliente(cliente.getCPF())==null) {
			return cliente.isDadoValido();
		}
		System.out.println("Ja existe um cliente com esse CPF!");
		return false;
		
	}
	public static boolean isValidaPlano(Plano plano) {
		if(pesquisaPlano(plano.getCodigo())!=null) {
			System.out.println("Ja existe um plano com esse codigo!!");
			return false;
		}
		return plano.isDadoValido();
	}
	public static boolean isValidaNumeroTelefone(NumerodeTelefone telefone) {
		if(pesquisaNumerodeTelefone(telefone.getNumero())!=null){
			System.out.println("Ja existe um telefone com esse codigo!!");
			return false;
		}
		if(telefone.getCliente()==null||!telefone.getCliente().isDadoValido()||pesquisaCliente(telefone.getCliente().getCPF())==null) {
			System.out.println("Nao foi possivel localizar o cliente informado no sistema!!");
			return false;
		}
		if(telefone.getPlano()==null||!telefone.getPlano().isDadoValido()||pesquisaPlano(telefone.getPlano().getCodigo())==null) {
			System.out.println("Nao foi possivel localizar o plano informado no sistema!!");
			return false;
		}
		return telefone.isDadoValido();
	}
	public static boolean isValidaChamada(Chamada_Originada chamada) {
		if(chamada.getNumeroOrigem()==null||!chamada.getNumeroOrigem().isDadoValido()) {
			System.out.println("Nao foi possivel localizar o numero de origem no sistema!!");
			return false;
		}return chamada.isDadoValido();
	}
	
	public static Cliente pesquisaCliente(long CPF) {
		for(Cliente c:clientes) {
			if(c.getCPF()==CPF) {
				return c;
			}
		}return null;
	}
	public static Plano pesquisaPlano(int codigo) {
		for(Plano p:planos) {
			if(p.getCodigo()==codigo) {
				return p;
			}
		}return null;
	}
	public static NumerodeTelefone pesquisaNumerodeTelefone(long numero) {
		for(NumerodeTelefone t:telefones) {
			if(t.getNumero()==numero) {
				return t;
			}
		}
		return null;
	}
	public static Chamada_Originada pesquisaChamada(NumerodeTelefone numeroOrigem, Date dataInicio) {
		for(Chamada_Originada c:chamadas) {
			if(c.getNumeroOrigem()==numeroOrigem&&c.getDataInicioChamada()==dataInicio) {
				return c;
			}
		}return null;
	}
	public static void listar(ArrayList dados) {
		for(Object d:dados) {
			System.out.println(d);
		}
	}
	public static boolean removeCliente(Cliente cliente) {
		for(NumerodeTelefone t:telefones) {
			if(t.getCliente()==cliente) {
				System.out.println("O cliente esta associado a um numero de telefone!!");
				return false;
			}
		}
		return clientes.remove(cliente);
	}
	public static boolean removeTelefone(NumerodeTelefone telefone) {
		return telefones.remove(telefone);
	}
	public static boolean removePlano(Plano plano) {
		for(NumerodeTelefone t:telefones) {
			if(t.getPlano()==plano) {
				System.out.println("O cliente esta associado a um numero de telefone!!");
				return false;
			}
		}return planos.remove(plano);
	}
	public static boolean removeChamada(Chamada_Originada chamada) {
		return chamadas.remove(chamada);
	}
}
