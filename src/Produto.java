

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
import java.util.Calendar;

public class Produto implements Serializable {
    Random gerador = new Random();
    private int id;
    private String nome;
    private double preco;
    private int qtdEstoque;
    private String descricao;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, int qtdEstoque, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.descricao = descricao;
    }

    public Produto(String nome, double preco, int qtdEstoque, String descricao) {
        this.id = gerador.nextInt(100) + (int) Calendar.getInstance().getTimeInMillis(); //para gerar um id �nico
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Código: " + id + " - Nome: " + nome + ", preço: " + String.format("%.2f", preco) + ", Descrição: " + descricao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}


