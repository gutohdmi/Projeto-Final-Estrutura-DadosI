import java.util.LinkedList;

public class AppLL {

    private LinkedList<Aluno> lista = new LinkedList<>();

    public void adicionarNoInicio(Aluno a) {
        lista.addFirst(a);
    }

    public void adicionarNoFinal(Aluno a) {
        lista.addLast(a);
    }

    public void imprimirTodaLista() {
        if (lista.isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        for (Aluno a : lista) {
            System.out.println(a);
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno a : lista) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    public boolean removerAlunoPorMatricula(String matricula) {
        Aluno encontrado = buscarAlunoPorMatricula(matricula);
        if (encontrado != null) {
            lista.remove(encontrado);
            return true;
        }
        return false;
    }

    public void removerTodosAlunos() {
        lista.clear();
    }
}
