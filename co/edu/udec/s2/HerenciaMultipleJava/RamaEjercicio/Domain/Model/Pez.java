package Domain.Model;

import Domain.Model.Interfaces.Nadador;
import Domain.Model.Interfaces.Respirador;

public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar() {
        System.out.println("El Pez esta nadando.");
    }

    @Override
    public void respirar() {
        System.out.println("El Pez esta respirando.");
    }
    
}
