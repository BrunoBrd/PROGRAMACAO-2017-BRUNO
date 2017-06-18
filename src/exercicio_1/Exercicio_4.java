/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;
import java.util.ArrayList;
/**
 *
 * @author Bruno Brandão Acunha
 */
public class Exercicio_4 {

    private Funcionario[] funcionarios;

    public void setQtdFuncionarios(int qtd) {
        funcionarios = new Funcionario[qtd];
    }

    public void adcFuncionario(int posicao, Funcionario funcionario) {
        funcionarios[posicao] = funcionario;
    }

    public void listarFuncionarios() {
        if (funcionarios != null) {
            for (Funcionario fun : this.funcionarios) {
                System.out.println(fun.toString());
            }
        }
    }
}