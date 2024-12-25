package main.java.br.com.todoapi.models;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String status; // "PENDENTE", "EM PROGRESSO", "CONCLUIDA"

    // Construtor

    public Tarefa(int id, String titulo, String descricao, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
