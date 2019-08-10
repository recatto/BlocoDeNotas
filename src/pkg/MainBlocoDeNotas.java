package pkg;

import javax.swing.JOptionPane;

public class MainBlocoDeNotas {

	public static void main(String[] args) {
		int op;

		do {
			op = menu();
			switch (op) {
			case 1:
				String mensagem = JOptionPane.showInputDialog(null, "Escreva aqui sua nota");
				BlocoDeNotas.adicionar(mensagem);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, BlocoDeNotas.listar());
				break;
			case 3:
				boolean verificador;
				if (BlocoDeNotas.getNotas().isEmpty()) {
					JOptionPane.showMessageDialog(null, BlocoDeNotas.listar());
				} else {
					do {
						try {
							verificador = true;
							int excluir = Integer
									.valueOf(JOptionPane.showInputDialog(null, "Qual nota deseja excluir?"));
							BlocoDeNotas.remove(excluir);
							JOptionPane.showMessageDialog(null, BlocoDeNotas.listar(), "Nota Excluida! Restam",
									JOptionPane.WARNING_MESSAGE);
						} catch (IndexOutOfBoundsException e) {
							verificador = false;
							JOptionPane.showMessageDialog(null, "Posição inválida, favor refazer a operação!", null,
									JOptionPane.ERROR_MESSAGE);
						}
					} while (verificador != true);
				}
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		} while (op != 9);

	}

	public static int menu() {
		String menu = "MENU\n";
		menu = menu + "\n1 - Adicionar Nota";
		menu = menu + "\n2 - Listar notas";
		menu = menu + "\n3 - Excluir notas";
		menu = menu + "\n9 - Sair";
		int op = 0;
		String pane = JOptionPane.showInputDialog(menu);
		op = Integer.valueOf(pane);
		return op;
	}
}