package BarbeiroDorminhocoDefaut;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int limiteSalão = 3;
        List<Cliente> clientesNoSalão = new ArrayList<>();
        Barbeiro barbeiro = new Barbeiro(clientesNoSalão);

        Cliente[] clientes = {
            new Cliente("Filipe", barbeiro),
            new Cliente("Lucas", barbeiro),
            new Cliente("João", barbeiro),
            new Cliente("Carlos", barbeiro),
            new Cliente("Pedro", barbeiro)
        };
        
        for (int i = 0; i < clientes.length; i++) {
            if (clientesNoSalão.size() < limiteSalão) {
                clientesNoSalão.add(clientes[i]);
                clientes[i].start();
            } else {
                System.out.println("Barbearia cheia! " + clientes[i].getNome() + " foi embora.");
            }
        }
    }
}