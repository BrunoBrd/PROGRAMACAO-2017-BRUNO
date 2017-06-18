/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

/**
 *
 * @author Bruno Brandão Acunha
 */
package Exercicio6;

/**
 *
 * @author Lucas
 */
public class Ex6Cliente extends Ex6Pessoa {
    private Ex6Endereco endereco;
    private int telefone;
    
    public Ex6Endereco getEndereco(){
        return endereco;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setEnderenco(Ex6Endereco endereco){
        this.endereco = endereco;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}