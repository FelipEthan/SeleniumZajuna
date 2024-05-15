package steps;

import io.cucumber.java.en.Given;
import pages.ZajunaPage;

public class ZajunaSteps {
    ZajunaPage zajuna = new ZajunaPage(); // Crea una instancia de la clase ZajunaPage.

    @Given("^Ingreso a la pagina de Zajuna$") // Define un paso de Given en lenguaje natural utilizando una expresión regular.
    public void navegarAZajuna() {
        zajuna.navegarZajuna(); // Llama al método navegarZajuna() de la instancia de ZajunaPage para navegar a la página de Zajuna.
        //zajuna.cerrarZajuna(); // (Comentado) Originalmente se llama al método cerrarZajuna() para cerrar la página de Zajuna.
    }
}

