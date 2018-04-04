/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import DAO.PaisDAO;
import infra.Banco;
import gui.Janela;

/**
 *
 * @author paulo e nilton
 */
public class Pais {
    private String nome;
    private String sigla;
    private int tamanhoTelefone;
    
    public Pais(String nome, String sigla, int tamanhoTelefone) {
        this.nome = nome;
        this.sigla = sigla;
        this.tamanhoTelefone = tamanhoTelefone;
    }

    public int getTamanhoTelefone() {
        return tamanhoTelefone;
    }

    public void setTamanhoTelefone(int tamanhoTelefone) {
        this.tamanhoTelefone = tamanhoTelefone;
    }
    
    public Pais(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
