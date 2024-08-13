package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController oc = new OperacoesController();
		String frase = JOptionPane.showInputDialog("Digite a frase aqui: ");
		oc.dividetTexto(frase);
	}
}
