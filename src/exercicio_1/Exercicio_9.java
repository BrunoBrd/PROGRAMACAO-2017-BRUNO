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
public class Exercicio_9 {
   	private int primeiroNumero;
	private int segundoNumero;

	public MaiorNumero(int primeiroNumero, int segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getMaiorNumero() {
		if ( segundoNumero < primeiroNumero ) {
			return primeiroNumero;
		}
		return segundoNumero;
	}
}