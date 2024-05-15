package pages;

public class ZajunaPage extends BasePage {

    public ZajunaPage() {
        super(driver); // Llama al constructor de la clase base (BasePage) pasando el WebDriver estático como parámetro.
    }

    public void navegarZajuna() {
        navegar("https://zajuna.sena.edu.co/"); // Utiliza el método estático 'navegar' de la clase BasePage para navegar a la URL de Zajuna.
    }

    public void cerrarZajuna() {
        driver.quit(); // Cierra el navegador utilizando el WebDriver estático.
    }
}

