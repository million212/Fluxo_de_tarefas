package main.java.br.com.todoapi.main;

import main.java.br.com.todoapi.services.TarefaService;
import main.java.br.com.todoapi.repositories.TarefaRepository;
import main.java.br.com.todoapi.controllers.TarefaController;

import java.util.Scanner;

public class TodoApiApplication {

    public static void main(String[] args) {
        TarefaRepository repository = new TarefaRepository();
        TarefaService service = new TarefaService(repository);
        TarefaController controller = new TarefaController(service);

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas!");

        // Loop de interação com o usuário
        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar uma tarefa");
            System.out.println("2. Listar todas as tarefas");
            System.out.println("3. Atualizar o status de uma tarefa");
            System.out.println("4. Remover uma tarefa");
            System.out.println("5. Sair");

            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            switch (escolha) {
                case 1: // Adicionar tarefa
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    controller.criarTarefa(titulo, descricao);
                    break;

                case 2: // Listar tarefas
                    controller.listarTarefas();
                    break;

                case 3: // Atualizar status
                    System.out.print("Digite o ID da tarefa para atualizar o status: ");
                    int idStatus = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a entrada do número
                    System.out.print("Digite o novo status (PENDENTE ou CONCLUIDA): ");
                    String status = scanner.nextLine();
                    controller.atualizarStatus(idStatus, status);
                    break;

                case 4: // Remover tarefa
                    System.out.print("Digite o ID da tarefa para remover: ");
                    int idExcluir = scanner.nextInt();
                    controller.excluirTarefa(idExcluir);
                    break;

                case 5: // Sair
                    executando = false;
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();


    }
}
