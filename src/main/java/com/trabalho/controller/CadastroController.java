package com.trabalho.controller;

import com.trabalho.domain.dto.UsuarioDTO;
import com.trabalho.exception.RecursoDuplicadoException;
import com.trabalho.exception.ValidationErrorDTO;
import com.trabalho.service.UsuarioService;
import com.trabalho.util.ControllerUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CadastroController {

    private final UsuarioService service;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/cadastro")
    public ModelAndView cadastroForm() {
        var model = new ModelAndView("cadastro");
        model.addObject("usuario", new UsuarioDTO());
        model.addObject("errors", new ValidationErrorDTO());
        model.addObject("logado", false);
        return model;
    }

    @PostMapping("/cadastro")
    public ModelAndView cadastro(@Valid UsuarioDTO usuario, BindingResult bindingResult) {
        var model = new ModelAndView("cadastro");
        var errors = ControllerUtils.createValidationErrorResponse(bindingResult);

        model.addObject("errors", errors);
        model.addObject("usuario", usuario);
        model.addObject("logado", false);

        if (bindingResult.hasErrors()) {
            return model;
        }

        try {
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            service.save(usuario);
            return new ModelAndView("redirect:/login");
        } catch (RecursoDuplicadoException e) {
            errors.getErrors().add(new ValidationErrorDTO.FieldError("email", e.getMessage()));
        }

        return model;
    }
}
