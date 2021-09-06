package mensagem;

public class Mensagem {
	private String texto;
	
	public Mensagem(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensagem: " + texto;
	}
}
