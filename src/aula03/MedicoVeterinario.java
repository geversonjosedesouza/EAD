package aula03;

import java.util.Date;

/**
 *
 * @author geverson
 */
public class MedicoVeterinario {

    private int registro;
    private String nome;
    private String especialidade;
    private Date dataNascimento;

    public MedicoVeterinario() {
    }

    public MedicoVeterinario(int registro, String nome, String especialidade, Date dataNascimento) {
        this.registro = registro;
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
