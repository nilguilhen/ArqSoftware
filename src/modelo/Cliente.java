package modelo;
import DAO.ClienteDAO;
import DAO.PaisDAO;
import infra.Banco;
import gui.Janela;

/**
 *
 * @author paulo e nilton
 */
public class Cliente {
    private String nome;
    private int idade;
    private String telefone;
    private double limiteCredito;
    private Pais pais = new Pais("Yuden", "TR", 10);
    
    public Cliente(String nome, int idade, String telefone, Pais pais) throws Exception {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPais(pais);
        this.setLimiteCredito(idade);
        this.setTelefone(telefone);
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() < 5){
            throw new Exception("Nome menor que 5 caracteres");
        }
        else 
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

    public void setTelefone(String telefone) throws Exception{
        if(pais.getTamanhoTelefone()== telefone.length())
            this.telefone = telefone;
        else
            throw new Exception("Formato telefone invalido");
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int idade) {
        if(this.idade <= 18) {
            this.limiteCredito = 100.00;
        } else if(this.idade <= 35 ) {
            this.limiteCredito = 300.00;
        } else {
            this.limiteCredito = 500.00;
        }
        this.inserirCreditoAdicional(100.00);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) throws Exception {
        if (pais == null){
            throw new Exception("Pais nulo");
        }else
            this.pais = pais;
    }

    public void inserirCreditoAdicional(double valor){
        if(this.pais.getNome().equalsIgnoreCase("Brasil")){
            this.limiteCredito += valor;
        }
    }
}
