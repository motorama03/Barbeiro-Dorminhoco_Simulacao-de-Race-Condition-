package BarbeiroDorminhocoDefaut;

public class Cliente extends Thread {
    private String nome;
    private Barbeiro barbeiro;
    
    public Cliente(String nome, Barbeiro barbeiro) {
        this.nome = nome;
        this.barbeiro = barbeiro;
    }

    public String getNome() {
        return nome;
    }
    
    public void run() {
        try {
            System.out.println(nome + " chegou na barbearia");
            barbeiro.cortarCabelo(this);
            System.out.println(nome + " saiu da barbearia");
        } catch (InterruptedException e) {
            System.out.println(nome + " foi interrompido enquanto esperava");
        }
    }
}