package BarbeiroDorminhocoDefaut;

import java.util.List;

public class Barbeiro {
    private List<Cliente> clientesNoSalão;
    private boolean cortandoCabelo = false;
    
    public List<Cliente> getClientesNoSalão() {
		return clientesNoSalão;
	}

	public void setClientesNoSalão(List<Cliente> clientesNoSalão) {
		this.clientesNoSalão = clientesNoSalão;
	}

	public boolean isCortandoCabelo() {
		return cortandoCabelo;
	}

	public void setCortandoCabelo(boolean cortandoCabelo) {
		this.cortandoCabelo = cortandoCabelo;
	}

	public Barbeiro(List<Cliente> clientesNoSalão) {
        this.clientesNoSalão = clientesNoSalão;
    }

    public synchronized void cortarCabelo(Cliente cliente) throws InterruptedException {
        System.out.println(cliente.getNome()+" Se sentou na cadeira para cortar o cabelo");
        while (cortandoCabelo) {
            wait();
        }

        cortandoCabelo = true;
        System.out.println(cliente.getNome() + " está cortando o cabelo!");
        Thread.sleep(1500);
        System.out.println(cliente.getNome() + " acabou de cortar o cabelo");
        cortandoCabelo = false;
        
        notifyAll();
    }
}