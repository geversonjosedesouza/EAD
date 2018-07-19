package aula03;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author geverson
 */
public class Atendimento {

    public static void main(String[] args) {
        Animal novoAnimal = cadastrarAnimal();
        Cliente novoCliente = cadastrarCliente(novoAnimal);
        Funcionario novoFuncionario = cadastrarFuncionario();
        MedicoVeterinario novoVeterinario = cadastrarVeterinario();
        cadastrarConsulta(novoCliente, novoFuncionario, novoVeterinario);
    }

    private static Animal cadastrarAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Raça: ");
        String raca = scanner.next();
        System.out.println("Tipo: ");
        String tipo = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Cor: ");
        String cor = scanner.next();
        System.out.println("Sexo: ");
        String sexo = scanner.next();
        System.out.println("Peso: ");
        Double peso = scanner.nextDouble();
        return new Animal(codigo, nome, raca, tipo, idade, cor, sexo, peso);
    }

    private static Animal atualizarAnimal(int codigo) {
        Animal atualizar = new Animal();
        Scanner scanner = new Scanner(System.in);
        atualizar.setCodigo(codigo);
        System.out.println("Nome: ");
        atualizar.setNome(scanner.next());
        System.out.println("Raça: ");
        atualizar.setRaca(scanner.next());
        System.out.println("Tipo: ");
        atualizar.setTipo(scanner.next());
        System.out.println("Idade: ");
        atualizar.setIdade(scanner.nextInt());
        System.out.println("Cor: ");
        atualizar.setCor(scanner.next());
        System.out.println("Sexo: ");
        atualizar.setSexo(scanner.next());
        System.out.println("Peso: ");
        atualizar.setPeso(scanner.nextDouble());
        return atualizar;
    }

    private static Cliente cadastrarCliente(Animal animal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("CPF: ");
        String cpf = scanner.next();
        System.out.println("Data Nascimento: ");
        String dataNascimento = scanner.next();
        return new Cliente(codigo, nome, cpf, Date.valueOf(dataNascimento), animal);
    }

    private static Cliente AtualizarCliente(int codigo) {
        Cliente atualizar = new Cliente();
        Scanner scanner = new Scanner(System.in);
        atualizar.setCodigo(codigo);
        System.out.println("Nome: ");
        atualizar.setNome(scanner.next());
        System.out.println("CPF: ");
        atualizar.setCpf(scanner.next());
        System.out.println("Data Nascimento: ");
        atualizar.setDataNascimento(Date.valueOf(scanner.next()));
        return atualizar;
    }

    private static Funcionario cadastrarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Data Admissão: ");
        String dataAdmissao = scanner.next();
        System.out.println("Data Nascimento: ");
        String dataNascimento = scanner.next();
        System.out.println("Cargo: ");
        String cargo = scanner.next();
        return new Funcionario(codigo, nome, Date.valueOf(dataAdmissao), Date.valueOf(dataNascimento), cargo);
    }

    private static MedicoVeterinario cadastrarVeterinario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Código de Registro: ");
        int registro = scanner.nextInt();
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Especialidade: ");
        String especialidade = scanner.next();
        System.out.println("Data Nascimento: ");
        String dataNascimento = scanner.next();
        return new MedicoVeterinario(registro, nome, especialidade, Date.valueOf(dataNascimento));
    }

    private static Consulta cadastrarConsulta(Cliente cliente, Funcionario funcionario, MedicoVeterinario veterinario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        System.out.println("Sintomas: ");
        String sintomas = scanner.next();
        System.out.println("Data Última Consulta: ");
        String dataUltimaConsulta = scanner.next();
        System.out.println("Pecisa de Exames: S ou N");
        String exame = scanner.next();
        boolean exames;
        if (exame.equals("S")) {
            exames = true;
        } else {
            exames = false;
        }
        return new Consulta(codigo, funcionario, cliente, cliente.getAnimal(), veterinario,
                sintomas, Date.valueOf(dataUltimaConsulta), exames);
    }
}
