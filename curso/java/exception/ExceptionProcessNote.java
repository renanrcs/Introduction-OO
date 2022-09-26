package curso.java.exception;

public class ExceptionProcessNote extends Exception {
	public ExceptionProcessNote(String error) {
		super("Erro ao processar notas do Aluno");
	}
}
