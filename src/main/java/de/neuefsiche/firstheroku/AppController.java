package de.neuefsiche.firstheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping("/api/dreimal/")
public class AppController {

    @GetMapping("/{factor}")
    public String multiplyer(@PathVariable String factor) {
        int result = parseInt(factor) * 3;
        return factor + " mal drei ist " + result;
    }
}
