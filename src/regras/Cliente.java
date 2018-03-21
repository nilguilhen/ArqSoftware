/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras;

/**
 *
 * @author paulo
 */
public class Cliente implements CreditoAdicional {
    private String nome;
    private int idade;
    private String telefone;
    private double limiteCredito;
    private Pais pais;
    
    public Cliente(String nome, int idade, String telefone, Pais pais) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.setLimiteCredito(idade);
        this.pais = pais;
    }
    
    public Cliente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.setLimiteCredito(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 5){
            
        }
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

    public void setLimiteCredito(int idade) {
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

    public void inserirCreditoAdicional(double valor){
        if(this.pais == null){
            return;
        }
         else if(this.pais.getNome().compareTo("Brasil") == 0){
            this.limiteCredito += 100.00;
         }
    }
    
    
}
