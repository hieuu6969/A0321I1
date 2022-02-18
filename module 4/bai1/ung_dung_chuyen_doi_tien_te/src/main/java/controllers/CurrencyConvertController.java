package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyConvertController {
    @PostMapping("/convert-currency")
    public ModelAndView convertCurrency(@RequestParam String usd, @RequestParam String exchangeRate ){
        ModelAndView modelAndView = new ModelAndView("convertCurrencyForm");
        float usd1 = Float.parseFloat(usd);
        float exchangeRate1 = Float.parseFloat(exchangeRate);
        float vnd = usd1 * exchangeRate1;
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }

    @GetMapping("/convert-currency-form")
    public String showConvertCurrencyForm() {
        return "convertCurrencyForm";
    }
}
