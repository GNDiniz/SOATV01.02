package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void dividetTexto(String texto) {
		String[] vetorPalavras = texto.split(";");
		int contPalavras = 0;
		for (String palavra : vetorPalavras) {
			System.out.println(palavra);
			contPalavras = contPalavras + 1;
		}
		System.out.println("Quantidade total de palavras: "+contPalavras);
	}
}
