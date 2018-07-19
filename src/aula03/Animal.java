package aula03;

/**
 *
 * @author geverson
 */
public class Animal {

    private int codigo;
    private String nome;
    private String raca;
    private String tipo;
    private int idade;
    private String cor;
    private String sexo;
    private Double peso;

    public Animal() {
    }

    public Animal(int codigo, String nome, String raca, String tipo, int idade, String cor, String sexo, Double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
