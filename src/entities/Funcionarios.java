package entities;

import java.util.Objects;

public class Funcionarios {
    private int id;
    private String nome;
    private String telefone;
    private int idade;

    public Funcionarios(int id, String nome, String telefone, int idade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionarios that = (Funcionarios) o;
        return id == that.id && idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, idade);
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
