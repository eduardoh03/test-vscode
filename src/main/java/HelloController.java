import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @GetMapping(value = "/")
    public String getMethodName(){
        return "Iai,tudo bem?alo mundosad";
    }
    
}
