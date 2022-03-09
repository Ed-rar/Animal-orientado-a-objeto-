package animal;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		//instancia um objeto com construtor vazio
		Esquilo esquilo1 = new Esquilo();
		
		//ajusta os atributos do objetos
		esquilo1.setNome("George");
		esquilo1.setTamanho(0.5f);
		esquilo1.setPeso(0.8f);
		esquilo1.isDormindo();
		
		//instancia um objeto com atributos pré-ajustados
		Esquilo esquilo2 = new Esquilo("Alfred", 0.3f, 0.5f, false);
		
		//imprime os objetos na tela
		//precisa concatenar com '\n' ou um separador,
		//só a virgula ,não separa os objetos
		System.out.println(esquilo1.getNome()+"\n"+esquilo2.getNome());
		
		//abre uma janela mostrando os dados solicitados do objeto instanciado
		JOptionPane.showMessageDialog(null,esquilo2.getNome()
				+"\n"+esquilo2.getTamanho()+" M\n"
				+esquilo2.getPeso()+" KG\n");
	}

}
