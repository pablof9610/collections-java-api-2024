package list.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas () {
        this.tarefaList = new ArrayList();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa element : this.tarefaList) {
            if (element.getDescricao() == descricao) {
                this.tarefaList.remove(element);
            }
        }
    }

    public int obterNumeroTotalDeTarefas() {
        return this.tarefaList.size();
    }

    public String obterDescricoesTarefas() {
        String returnString = "";
        for (Tarefa element : this.tarefaList) {
            returnString += element.getDescricao() + " ";
        }

        return returnString;
    }
}
