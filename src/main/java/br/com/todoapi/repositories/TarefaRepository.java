package main.java.br.com.todoapi.repositories;

import main.java.br.com.todoapi.models.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int idCounter = 1;

    public List<Tarefa> findAll() {
        return tarefas;
    }

    public Tarefa findById(int id) {
        return tarefas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public Tarefa save(Tarefa tarefa) {
        tarefa.setId(idCounter++);
        tarefas.add(tarefa);
        return tarefa;
    }

    public boolean delete(int id) {
        return tarefas.removeIf(t -> t.getId() == id);
    }
}
