import java.util.Vector;

public class AppVE {

    private Vector<Aluno> lista = new Vector<>();

    public void adicionarNoInicio(Aluno a) {
        lista.add(0, a);
    }

    public void adicionarNoFinal(Aluno a) {
        lista.add(a);
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
