package pkg;

import java.util.ArrayList;

public class BlocoDeNotas {
	private static ArrayList<String> notas = new ArrayList<>();

	public static ArrayList<String> getNotas() {
		return notas;
	}

	public static void adicionar(String n) {
		notas.add(n);
	}

	public static void remove(int i) {
		i = i - 1;
		notas.remove(i);
	}

	public static String listar() {
		String saida = "";
		int i = 1;
		if (notas.isEmpty()) {
			saida += "Bloco de Notas Vazio";
		}else {
		for (String n : notas) {
				saida += "===== Nota n° " + (i++) + " =====\n" + n + "\n";

			}
		}
		return saida;
	}
}