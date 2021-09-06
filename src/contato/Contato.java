package contato;

import java.util.ArrayList;

import mensagem.Mensagem;

public class Contato {
	private String nome;
	private ArrayList<Mensagem> listaDeMensagens = new ArrayList<Mensagem>();
	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Mensagem> getMensagens() {
		return listaDeMensagens;
	}

	public void imprimirMensagens() {
		for (Mensagem mensagem : listaDeMensagens) {
			System.out.println("===================================");
			System.out.println(mensagem);
			System.out.println("===================================");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome do contato: " + nome;
	}
}
