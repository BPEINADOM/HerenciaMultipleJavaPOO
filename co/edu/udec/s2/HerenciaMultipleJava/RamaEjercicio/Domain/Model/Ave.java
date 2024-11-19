package Domain.Model;

import Domain.Model.Interfaces.Cantante;
import Domain.Model.Interfaces.Volador;

public class Ave implements Cantante, Volador {

    @Override
    public void cantar() {
        System.out.println("El Ave esta cantando.");
    }

    @Override
    public void volar() {
        System.out.println("El Ave esta volando.");
    }

    
}
