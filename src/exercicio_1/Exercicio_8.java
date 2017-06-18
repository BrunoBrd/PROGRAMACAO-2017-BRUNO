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
public class Exercicio_8 {
    
} */
package Exercicio8;

/**
 *
 * @author Lucas
 */
public class Ex8Endereco {
    private String rua;
    private String cep;
    
    public String getRua(){return rua;
    }
    public String getCep(){return cep;
    }
    public void setRua(String rua){this.rua = rua;
    }
    public void setCep(String cep){this.cep = cep;
    }
    public String formataCep(){
       return cep.substring(0,5)+"|"+cep.substring(5,8);           
    }

    void formataCep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
