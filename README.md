# FluxoDeTarefas - Gerenciamento de Tarefas

## Descrição
O **FluxoDeTarefas** é um sistema simples de gerenciamento de tarefas, desenvolvido em Java. Ele permite que o usuário adicione, liste, atualize o status e remova tarefas. A interação é feita por meio de um menu no console, tornando-o uma solução simples e eficiente para gerenciar atividades diárias.

O objetivo principal desse projeto é oferecer uma implementação de back-end puro, utilizando boas práticas de organização de código e estruturas fundamentais da linguagem Java, como classes, pacotes e objetos.

## Funcionalidades

- **Adicionar Tarefa**: Permite a criação de uma nova tarefa, com título e descrição.
- **Listar Tarefas**: Exibe todas as tarefas cadastradas.
- **Atualizar Status**: Modifica o status de uma tarefa para "PENDENTE" ou "CONCLUÍDA".
- **Excluir Tarefa**: Remove uma tarefa pelo seu ID.
- **Interação via Console**: Sistema interativo onde o usuário escolhe as ações a serem executadas.

## Como Rodar o Projeto

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/FluxoDeTarefas.git
    ```

2. **Abra o projeto no IntelliJ IDEA** (ou outra IDE que suporte Java).
    - Se você estiver usando o IntelliJ, basta abrir o projeto normalmente.
    - Certifique-se de ter o **Java 11 ou superior** instalado.

3. **Compile e execute o arquivo `TodoApiApplication.java`**:
    - O método `main` do arquivo `TodoApiApplication` inicia a aplicação e apresenta o menu interativo no console.

4. **Interaja com o sistema**:
    - Siga as instruções no console para adicionar, listar, atualizar e excluir tarefas.
    - A entrada é feita via terminal (console).

## Dependências

- **Java** 11 ou superior
- **IDE**: IntelliJ IDEA (recomendado) ou qualquer outra IDE compatível com Java.

## Como Funciona

Ao executar a aplicação, o sistema exibirá um menu com as opções de interagir com as tarefas. Você poderá:

1. **Adicionar Tarefas**: Inserindo título e descrição.
2. **Listar Tarefas**: Visualizando as tarefas cadastradas.
3. **Atualizar Status**: Alterando o status das tarefas para "PENDENTE" ou "CONCLUÍDA".
4. **Excluir Tarefas**: Removendo tarefas por ID.

O projeto utiliza listas em memória para armazenar as tarefas, o que significa que, ao reiniciar o programa, as tarefas serão perdidas.

## Exemplo de Uso

Após rodar a aplicação, o console exibe as opções disponíveis. Veja um exemplo:

Bem-vindo ao sistema de gerenciamento de tarefas!

Escolha uma opção:

Adicionar uma tarefa
Listar todas as tarefas
Atualizar o status de uma tarefa
Remover uma tarefa
Sair Digite sua escolha: 1 Digite o título da tarefa: Estudar Java Digite a descrição da tarefa: Focar em conceitos básicos
Escolha uma opção:

Adicionar uma tarefa
Listar todas as tarefas
Atualizar o status de uma tarefa
Remover uma tarefa
Sair Digite sua escolha: 2
Tarefas cadastradas: Tarefa{id=1, titulo='Estudar Java', descricao='Focar em conceitos básicos', status=PENDENTE}

css
Copiar código

## Licença

Este projeto está licenciado sob a **MIT License** - veja o arquivo [LICENSE](LICENSE) para mais detalhes.