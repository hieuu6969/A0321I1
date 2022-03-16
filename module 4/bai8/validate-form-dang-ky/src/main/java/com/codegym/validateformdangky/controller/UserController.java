package com.codegym.validateformdangky.controller;

import com.codegym.validateformdangky.model.User;
import com.codegym.validateformdangky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/")

    public String checkValidation (@Validated @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        new User().validate(user,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "/index";
        } else {
            userService.save(user);
            model.addAttribute("user",user);
            return "/result";
        }
    }

}
