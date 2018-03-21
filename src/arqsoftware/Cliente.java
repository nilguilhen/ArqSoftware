/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqsoftware;

/**
 *
 * @author paulo
 */
public class Cliente {
    private String nome;
    private int idade;
    private String telefone;
    private double limiteCredito;
    private Pais pais;
    
    public Cliente(String nome, int idade, String telefone, Pais pais) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        
        this.pais = pais;
    }
    
    public Cliente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito() {
        if(this.idade < 18) {
            this.limiteCredito = 100.00;
        } else if(this.idade >= 18 && this.idade <= 35 ) {
            this.limiteCredito = 300.00;
        } else if(this.idade > 35){
            this.limiteCredito = 500.00;
        }
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    
    
    
}