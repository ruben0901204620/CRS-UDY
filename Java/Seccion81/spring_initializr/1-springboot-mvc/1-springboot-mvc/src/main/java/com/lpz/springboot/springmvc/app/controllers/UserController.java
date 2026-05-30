package com.lpz.springboot.springmvc.app.controllers;

import com.lpz.springboot.springmvc.app.models.User;
import com.lpz.springboot.springmvc.app.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller //controlador base
@RequestMapping("/users")
@SessionAttributes({"user"})
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping({"/saludo", "/another"}) // rutas metodo jandler
    public String viewData(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("message", " Este es una aplicacion de ejemplo usando spring boot !!!");
        model.addAttribute("user", new User("Ruben", "Lopez"));
        return "view"; // nombre de la plantilla: resources/templates/view.html

    }

    @GetMapping({"","/"})
    public String list(Model model) {
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", service.finAll());
        return "list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "Crear Usuario");
        return "form";
    }

    @GetMapping("/form/{id}") //parametros de la ruta (pathVariable)
    public String form(@PathVariable Long id, Model model, RedirectAttributes redirect) {
        Optional<User> optionalUser = service.findById(id);

        if(optionalUser.isPresent()) {

            model.addAttribute("user", optionalUser.get());
            model.addAttribute("title", "Editar Usuario");
            return "form";
        } else {
            redirect.addFlashAttribute("error", "El usuario con el id " +
                    id +
                    " no existe en la base de datos.");

            return "redirect:/users";
        }
    }

    @PostMapping
    public String form(@Valid User user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status){

        if(result.hasErrors()) {
            model.addAttribute("title", "Validando formulario");
            return "form";
        }

        String message = ((user.getId() != null) && (user.getId() > 0)) ? "El usuario " +
                user.getName() +
                " se ha actualizado con exito." : "El usuario " +
                user.getName() +
                " se ha creado con exito.";

        service.save(user);
        status.setComplete();

        redirect.addFlashAttribute("success", message);


        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {

        Optional<User> optionalUser = service.findById(id);

        if(optionalUser.isPresent()) {
            redirect.addFlashAttribute("success", "El usuario " +
                    optionalUser.get().getName() +
                    " se ha eliminado con exito.");
            service.remote(id);
            return "redirect:/users";

        }

        redirect.addFlashAttribute("error", "Error el usuario con el id " +
                id + " no existe en el sistema.");


        return "redirect:/users";

    }

}
