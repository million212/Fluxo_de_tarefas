package main.java.br.com.todoapi.services;

import main.java.br.com.todoapi.models.Tarefa;
import main.java.br.com.todoapi.repositories.TarefaRepository;

import java.util.List;

public class TarefaService {

    public TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Tarefa buscarPorId(int id) {
        return repository.findById(id);
    }

    public Tarefa criarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = new Tarefa(0, titulo, descricao, "PENDENTE");
        return repository.save(novaTarefa);
    }

    public boolean excluirTarefa(int id) {
        return repository.delete(id);
    }

    public Tarefa atualizarStatus(int id, String novoStatus) {
        Tarefa tarefa = repository.findById(id);
        if (tarefa != null) {
            tarefa.setStatus(novoStatus);
        }
        return tarefa;
    }
}
