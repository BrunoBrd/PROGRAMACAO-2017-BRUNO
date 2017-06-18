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
public class Exercicio_5 {

    private String name;
    private String email;
    private char genero;

    public Exercicio_5(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.genero = gender;
    } public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    } public String getEmail() {
        return email;
    } public void setEmail(String email) {
        this.email = email;
    } public char getGenero() {
        return genero;
    } public void setGenero(char genero) {
        this.genero = genero;
    } public String toString() {
        return "Nome: " + this.name + "\nEmail: " + this.email + "\nSexo: " + this.genero;
    }
}