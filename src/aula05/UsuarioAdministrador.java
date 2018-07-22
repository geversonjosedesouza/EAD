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
public class UsuarioAdministrador extends UsuarioPadrao {

    public UsuarioAdministrador(int codigo, String nome, String senha, Date dataCadastro) {
        super(codigo, nome, senha, dataCadastro);
    }

    public void acesso() {
    }
}
