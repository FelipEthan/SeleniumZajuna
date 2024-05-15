package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
        protected static WebDriver driver; // Declaración del objeto WebDriver como estático para que sea accesible desde todos los métodos de la clase y sus subclases.
        private static WebDriverWait wait; // Declaración del objeto WebDriverWait como estático para que sea accesible desde todos los métodos de la clase y sus subclases.
        private static Actions actions; // Declaración del objeto Actions como estático para que sea accesible desde todos los métodos de la clase y sus subclases.

        static {
                // Especifica la ubicación del ChromeDriver aquí
                String chromeDriverPath = "C:\\Users\\andre\\Documentos\\Selenium\\SeleniumZajuna\\software\\chromedriver.exe";

                // Establece la ubicación del ChromeDriver
                System.setProperty("webdriver.chrome.driver", chromeDriverPath); // Configura la propiedad del sistema para la ubicación del ChromeDriver.

                ChromeOptions chromeOptions = new ChromeOptions(); // Crea un objeto ChromeOptions para configurar las opciones del navegador.
                driver = new ChromeDriver(chromeOptions); // Inicializa el WebDriver utilizando el ChromeDriver y las opciones especificadas.
                wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Inicializa el objeto WebDriverWait con el WebDriver y una espera máxima de 50 segundos.
                actions = new Actions(driver); // Inicializa el objeto Actions con el WebDriver para realizar acciones de interacción con elementos de la página.
        }

        public BasePage(WebDriver driver) {
                BasePage.driver = driver; // Asigna el WebDriver recibido como parámetro al WebDriver estático de la clase.
                PageFactory.initElements(driver, this); // Inicializa los elementos de la página utilizando PageFactory para la inyección de elementos de la página web.
                wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Inicializa el objeto WebDriverWait con el WebDriver y una espera máxima de 50 segundos.
                driver.manage().window().maximize(); // Maximiza la ventana del navegador.
        }

        public static void navegar(String url) {
                driver.get(url); // Navega a la URL especificada utilizando el WebDriver estático.
        }

        public static void cerrar() {
                driver.quit(); // Cierra el navegador y finaliza todas las sesiones del WebDriver estático.
        }
}

