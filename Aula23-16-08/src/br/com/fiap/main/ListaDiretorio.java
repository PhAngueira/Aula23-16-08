package br.com.fiap.main;

import java.io.File;

import javax.swing.JOptionPane;

public class ListaDiretorio {

	public static void main(String[] args) {
		String escolha = "sim";
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				String path = JOptionPane.showInputDialog("digite o caminho da pasta" 
				         + "\n(ultilize / entre as pastas)");
				File dir = new File(path);
				if (dir.isDirectory()) {
					System.out.println("Conteudo da pasta:" + path);
					String[] lista = dir.list();
					for (String item : lista) {
						System.out.println(item);
					}
				} else {
					System.out.println("Caminho em formato incorreto");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("deseja continuar?");
		}
	}
}
