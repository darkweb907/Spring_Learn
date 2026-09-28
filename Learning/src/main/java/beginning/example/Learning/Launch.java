package beginning.example.Learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Launch {
    @Value("${spring.application.name}")
    String name;

   @GetMapping("/")
    public String index(){
       return "index.html";

   }
}
