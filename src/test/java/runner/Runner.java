package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class) // Indica que se utilizará JUnit para ejecutar las pruebas con Cucumber.
@CucumberOptions(
            features = "src/test/resources/features", // Especifica la ubicación de los archivos de características (feature files).
        glue = "steps", // Especifica el paquete donde se encuentran las definiciones de pasos.
        monochrome = true, // Configura la salida de la consola para que sea legible en blanco y negro.
        tags = "@Test" // Ejecuta solo las pruebas etiquetadas como "@Test".
)
public class Runner {
    @AfterClass
    public static void closeDriver() {
        BasePage.cerrar(); // Llama al método estático 'cerrar' de la clase BasePage para cerrar el navegador después de que se hayan ejecutado todas las pruebas.
    }
}


