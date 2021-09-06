package usuario;
import java.util.ArrayList;
import java.util.List;

import contato.Contato;
import mensagem.Mensagem;

public class Usuario {
	private String nome;
	private List<Contato> listaDeContatos;
	private Mensagem mensagem;

	public Usuario(String nome) {
		this.nome = nome;
		listaDeContatos = new ArrayList<>(); //inicia a instancia contatos
	}
	
	public void inserirContato(Contato contato) {
		listaDeContatos.add(contato);
	}
	
	public void enviarMensagem(String nomeDoContato, String mensagem) {
		this.mensagem = new Mensagem(mensagem);
		
		//verificando se o nomeDoContato é o mesmo contato que há na lista, se for, insere a nova mensagem
		for (Contato contato : listaDeContatos) {
			if (contato.getNome() == nomeDoContato) {
				contato.getMensagens().add(this.mensagem);
			}
		}
	}
	
	public ArrayList<Mensagem> imprimirMensagens(String nomeDoContato) {
		for (Contato contato : listaDeContatos) {
			if (nomeDoContato == contato.getNome()) {
				return contato.getMensagens();
			}
		}
		return null;
	}
	
	public Contato encontraContato(String nomeDoContato) {
		for (Contato contato : listaDeContatos) { 					//percorre a lista					
			if (contato.getNome() == nomeDoContato) {				//se o elemento x da lista for igual ao nomeDoContato passado
				return contato;										//retorna o nome encontrado
			}
		}
		return null;												//senão troca
	}

	
	public ArrayList<Mensagem> conversar(int opcaoEscolhida, Contato contato, String mensagem) {
		if (opcaoEscolhida == 1) {
			inserirContato(contato);
		}
		if (opcaoEscolhida == 2) {
			enviarMensagem(contato.getNome(), mensagem);
		}
		if (opcaoEscolhida == 3) {
			for (Contato contatoX : listaDeContatos) {
				if (contatoX == contato) {
					System.out.println("=========================================");
					return contatoX.getMensagens();
				}
			}
		}
		if (opcaoEscolhida == 4) {
			System.out.println("=========================================");
			return imprimirMensagens(contato.getNome());
		}
		if (opcaoEscolhida == 5) {
		
		}
		return null;
	}
}
