/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Date;

/**
 *
 * @author geverson
 */
public class UsuarioPadrao {

    public int codigo;
    public String nome;
    public String senha;
    public Date dataCadastro;

    public UsuarioPadrao(int codigo, String nome, String senha, Date dataCadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }
public void acesso(){}
}
