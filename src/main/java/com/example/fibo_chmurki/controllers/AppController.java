package com.example.fibo_chmurki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class AppController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @PostMapping("/oblicz")
    public String oblicz(@RequestParam(value = "liczba") Integer liczba, Model m) {
        System.out.println(liczba);
        int elo = fib(liczba);
        System.out.println(liczba+"-ty wyraz ciagu Fibonacciego: "+elo);
        m.addAttribute("wynik", elo);
        return "index";
    }

    public static int fib(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
