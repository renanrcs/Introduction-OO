package cursojava.thread;

import javax.swing.JOptionPane;

public class ExThread {
	public static void main(String[] args) throws InterruptedException {
		
/*=================================1� THREAD==================================================*/
		new Thread() {
			public void run() {/*Executa o que queremos*/
				/*C�d que quero executar em paralelo*/
				for (int i = 0; i < 10; i++) {
					
					/*Executar com tempo de parada*/
					System.out.println("Enviar email");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}/*Da um tempo na execu��o*/
					
				}
			}
		}.start();/*Start liga a thread que fica processando paralelamente por tras*/
		
		
/*=================================2� THREAD==================================================*/
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(800);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("Enviando Nota Fiscal");
				}
			}
		}.start();
		
		
		/*c�d do sistema de usuario continua o fluxo de execu��o*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
		System.out.println("PROGRAMA CHEGOU AO FIM");
	}
}
