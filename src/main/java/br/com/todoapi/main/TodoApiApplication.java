package main.java.br.com.todoapi.main;

import main.java.br.com.todoapi.services.TarefaService;
import main.java.br.com.todoapi.repositories.TarefaRepository;
import main.java.br.com.todoapi.controllers.TarefaController;

public class TodoApiApplication {

    public static void main(String[] args) {
        TarefaRepository repository = new TarefaRepository();
        TarefaService service = new TarefaService(repository);
        TarefaController controller = new TarefaController(service);

        // Exemplo de uso

        controller.criarTarefa("Estudar java", "Focar em coneceitos básicos");
        controller.listarTarefas();
        controller.atualizarStatus(1, "CONCLUIDA");
        controller.listarTarefas();
        controller.excluirTarefa(1);
        controller.listarTarefas();
    }
}
