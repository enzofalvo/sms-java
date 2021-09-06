//NOME DOS INTEGRANTES:
//Mikael da Silva Sirqueira
//Enzo Falvo
//Thomas Rempel


import contato.Contato;
import usuario.Usuario;

public class Main {
	public static void main(String[] args) {
		//criando um novo usuario
		Usuario usuario = new Usuario("Thomas Rempel");
		
		Contato contatoEnzo = new Contato("Enzo Falvo");
		Contato contatoMikael = new Contato("Mikael da Silva");
		Contato contatoProfessor = new Contato("Professor de POO");
		
		
		//inserindo novos contatos
		usuario.inserirContato(contatoEnzo);
		usuario.inserirContato(contatoMikael);

		//buscando contatos de acordo com os nomes
		System.out.println(usuario.encontraContato("Enzo Falvo"));
		System.out.println(usuario.encontraContato("Enzo da Silva"));
		System.out.println(usuario.encontraContato("Mikael da Silva"));
		
		//enviando novas mensagens
		usuario.enviarMensagem("Enzo Falvo", "E aí meu xará");
		usuario.enviarMensagem("Mikael da Silva", "Me devolve os 500 reais que te emprestei, caloteiro!");
		
		//imprimindo as mensagens que foram enviadas
		System.out.println(usuario.imprimirMensagens("Enzo Falvo"));
		System.out.println(usuario.imprimirMensagens("Mikael da Silva"));
		
		usuario.conversar(1, contatoProfessor, null);
		usuario.conversar(2, contatoProfessor, "Opa, java é legal né?");
		System.out.println(usuario.conversar(3, contatoEnzo, null));
		System.out.println(usuario.conversar(4, contatoMikael, null));
		System.out.println(usuario.conversar(4, contatoProfessor, null));
		usuario.conversar(5, null, null);
		
	}
}
