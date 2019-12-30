import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // voir résultat
        // http://localhost:8080/v2/api-docs
        // http://localhost:8080/swagger-ui.html
    }
}
