package entities;

import java.util.Objects;

public class Funcionarios {
    private int id;
    private  String nome;
    private String telefone;
    private int idade;

    public Funcionarios(int id, String nome, String telefone, int idade)
    {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//
//        Funcionarios that = (Funcionarios) o;
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
//        if (telefone != null ? !telefone.equals(that.telefone) : that.telefone != null) return false;
//        if (idade != null ? !idade.equals(that.idade) : that.idade != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (nome != null ? nome.hashCode() : 0);
//        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
//        result = 31 * result + (idade != null ? idade.hashCode() : 0);
//        return result;
//    }

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
