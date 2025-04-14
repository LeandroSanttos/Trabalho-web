package com.trabalho.controller;

import static com.trabalho.consts.RequestPathConstants.TREINADOR;

import com.trabalho.domain.dto.TreinadorDTO;
import com.trabalho.service.TreinadorService;
import com.trabalho.util.ControllerUtils;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(TREINADOR)
@RequiredArgsConstructor
@Slf4j
public class TreinadorController {

    private static final String VIEWS_FOLDER = "treinador/";

    private final TreinadorService treinadorService;

    @GetMapping
    public ModelAndView listAll() {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "lista_treinadores");

        List<TreinadorDTO> treinadores = treinadorService.getAll();
        model.addObject("treinadores", treinadores);

        return model;
    }

    @GetMapping("/ver/{id}")
    public ModelAndView visualizar(@PathVariable Long id) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_treinador");

        TreinadorDTO treinador = treinadorService.getById(id);
        model.addObject("treinador", treinador);
        model.addObject("visualizacao", true);

        return model;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Long id, @RequestParam(required = false) boolean edicao) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_treinador");

        TreinadorDTO treinador = treinadorService.getById(id);
        model.addObject("treinador", treinador);
        model.addObject("edicao", edicao);

        return model;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrarForm(@RequestParam(required = false) boolean cadastro) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_treinador");

        model.addObject("treinador", new TreinadorDTO());
        model.addObject("cadastro", cadastro);

        return model;
    }

    @PostMapping("/cadastrar")
    public ModelAndView save(@Valid TreinadorDTO treinador, BindingResult bindingResult) {
        var model = new ModelAndView();
        var errors = ControllerUtils.createValidationErrorResponse(bindingResult);

        if (!errors.hasErrors()) {
            treinadorService.save(treinador);

            if (treinador.getId() == null) {
                model.setViewName("redirect:" + TREINADOR + "/cadastrar?cadastro=true");
            } else {
                model.setViewName("redirect:" + TREINADOR + "/editar/" + treinador.getId() + "?edicao=true");
            }

            return model;
        }

        model.addObject("errors", errors);
        model.addObject("treinador", treinador);
        model.setViewName(VIEWS_FOLDER + "form_treinador");

        return model;
    }
}
