package aula03;

import java.util.Date;

/**
 *
 * @author geverson
 */
public class Consulta {

    private int codigo;
    private Funcionario funcionario;
    private Cliente cliente;
    private Animal animal;
    private MedicoVeterinario veterinario;
    private String sintomas;
    private Date dataUltimaConsulta;
    private boolean exames;

    public Consulta() {
    }

    public Consulta(int codigo, Funcionario funcionario, Cliente cliente, Animal animal, MedicoVeterinario veterinario, String sintomas, Date dataUltimaConsulta, boolean  exames) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.animal = animal;
        this.veterinario = veterinario;
        this.sintomas = sintomas;
        this.dataUltimaConsulta = dataUltimaConsulta;
        this.exames = exames;
    }

    public Date getDataUltimaConsulta() {
        return dataUltimaConsulta;
    }

    public void setDataUltimaConsulta(Date dataUltimaConsulta) {
        this.dataUltimaConsulta = dataUltimaConsulta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicoVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(MedicoVeterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public boolean isExames() {
        return exames;
    }

    public void setExames(boolean exames) {
        this.exames = exames;
    }

}
