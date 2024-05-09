package list.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaItem;

    public CarrinhoDeCompras () {
        this.listaItem = new ArrayList();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for (Item element : this.listaItem) {
            if (element.getNome() == nome) {
                this.listaItem.remove(element);
            }
        }
    }

    public double calcularValorTotal() {
        double somatorio = 0;
        for (Item element : this.listaItem) {
            somatorio += element.getPreco() * element.getQuatidade();
        }
        return somatorio;
    }

    public void exibirItens() {
        System.out.println("------------------");
        for (Item element : this.listaItem) {
            System.out.println("Nome: "+element.getNome());
            System.out.println("Preço: "+element.getPreco());
            System.out.println("Quantidade: "+element.getQuatidade());
            System.out.println("------------------");
        }
    }
}
