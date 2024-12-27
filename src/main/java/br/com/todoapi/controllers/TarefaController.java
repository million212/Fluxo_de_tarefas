package main.java.br.com.todoapi.controllers;

import main.java.br.com.todoapi.models.Tarefa;
import main.java.br.com.todoapi.services.TarefaService;

import java.util.List;

public class TarefaController {
    private TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    public void listarTarefas() {
        List<Tarefa> tarefas  = service.listarTarefas();

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
            return;
        }

        System.out.println("Lista de Tarefas:");

        tarefas.forEach(t ->
                System.out.println(
                        String.format("ID: %d | Título: %s | Status: %s",
                                t.getId(), t.getTitulo(), t.getStatus())));
    }

    public void criarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = service.criarTarefa(titulo, descricao);
        System.out.println("Tarefa criada: " + novaTarefa.getTitulo());
    }

    public void atualizarStatus(int id, String novoStatus) {
        Tarefa atualizada = service.atualizarStatus(id, novoStatus);
        if (atualizada != null) {
            System.out.println("Status atualizado: " + atualizada.getTitulo() + " [" + atualizada.getStatus() + "]");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void excluirTarefa(int id) {
        if (service.excluirTarefa(id)) {
            System.out.println("Tarefa excluída com sucesso.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
