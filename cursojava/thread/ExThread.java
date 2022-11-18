package cursojava.thread;

import javax.swing.JOptionPane;

public class ExThread {
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			public void run() {/*Executa o que queremos*/
				/*Cód que quero executar em paralelo*/
				for (int i = 0; i < 10; i++) {
					
					/*Executar com tempo de parada*/
					System.out.println("Enviar email");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}/*Da um tempo na execução*/
					
				}
			}
		}.start();/*Start liga a thread que fica processando paralelamente por tras*/
		
		
		/*cód do sistema de usuario continua o fluxo de execução*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
		System.out.println("PROGRAMA CHEGOU AO FIM");
	}
}
