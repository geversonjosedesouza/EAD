package aula03;

import java.util.Date;

/**
 *
 * @author geverson
 */
public class Funcionario {

    private int codigo;
    private String nome;
    private Date dataAdmissao;
    private Date dataNascimento;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, Date dataAdmissao, Date dataNascimento, String cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
