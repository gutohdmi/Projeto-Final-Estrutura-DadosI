import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AppAL arrayListApp = new AppAL();
        AppVE vectorApp = new AppVE();
        AppLL linkedListApp = new AppLL();

        int opc, estrutura;

        do {
            System.out.println("\n===== SELECIONE A ESTRUTURA =====");
            System.out.println("1 - ArrayList");
            System.out.println("2 - Vector");
            System.out.println("3 - LinkedList");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            estrutura = sc.nextInt();

            if (estrutura == 0) break;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Adicionar no início");
                System.out.println("2 - Adicionar no final");
                System.out.println("3 - Buscar por matrícula");
                System.out.println("4 - Remover por matrícula");
                System.out.println("5 - Imprimir lista");
                System.out.println("6 - Remover todos");
                System.out.println("0 - Voltar");
                System.out.print("Escolha: ");
                opc = sc.nextInt();
                sc.nextLine(); // limpar buffer

                String matricula, nome;
                Aluno a;

                switch (opc) {

                    case 1: // Adicionar no início
                        System.out.print("Matrícula: ");
                        matricula = sc.nextLine();
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        a = new Aluno(matricula, nome);

                        if (estrutura == 1) arrayListApp.adicionarNoInicio(a);
                        else if (estrutura == 2) vectorApp.adicionarNoInicio(a);
                        else linkedListApp.adicionarNoInicio(a);

                        System.out.println("Adicionado no início!");
                        break;

                    case 2: // Adicionar no final
                        System.out.print("Matrícula: ");
                        matricula = sc.nextLine();
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        a = new Aluno(matricula, nome);

                        if (estrutura == 1) arrayListApp.adicionarNoFinal(a);
                        else if (estrutura == 2) vectorApp.adicionarNoFinal(a);
                        else linkedListApp.adicionarNoFinal(a);

                        System.out.println("Adicionado no final!");
                        break;

                    case 3: // Buscar
                        System.out.print("Digite a matrícula: ");
                        matricula = sc.nextLine();

                        Aluno encontrado = null;
                        if (estrutura == 1) encontrado = arrayListApp.buscarAlunoPorMatricula(matricula);
                        else if (estrutura == 2) encontrado = vectorApp.buscarAlunoPorMatricula(matricula);
                        else encontrado = linkedListApp.buscarAlunoPorMatricula(matricula);

                        if (encontrado != null)
                            System.out.println("Encontrado: " + encontrado);
                        else
                            System.out.println("Aluno não encontrado.");
                        break;

                    case 4: // Remover
                        System.out.print("Digite a matrícula: ");
                        matricula = sc.nextLine();

                        boolean removido;
                        if (estrutura == 1) removido = arrayListApp.removerAlunoPorMatricula(matricula);
                        else if (estrutura == 2) removido = vectorApp.removerAlunoPorMatricula(matricula);
                        else removido = linkedListApp.removerAlunoPorMatricula(matricula);

                        if (removido)
                            System.out.println("Aluno removido!");
                        else
                            System.out.println("Aluno não encontrado.");
                        break;

                    case 5: // Imprimir
                        System.out.println("\n--- LISTA ---");
                        if (estrutura == 1) arrayListApp.imprimirTodaLista();
                        else if (estrutura == 2) vectorApp.imprimirTodaLista();
                        else linkedListApp.imprimirTodaLista();
                        break;

                    case 6: // Remover todos
                        if (estrutura == 1) arrayListApp.removerTodosAlunos();
                        else if (estrutura == 2) vectorApp.removerTodosAlunos();
                        else linkedListApp.removerTodosAlunos();

                        System.out.println("Todos os alunos foram removidos.");
                        break;

                }

            } while (opc != 0);

        } while (estrutura != 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
