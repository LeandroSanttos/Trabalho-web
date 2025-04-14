package com.trabalho.controller;

import static com.trabalho.consts.RequestPathConstants.CLUBE;

import com.trabalho.domain.dto.ClubeDTO;
import com.trabalho.service.ClubeService;
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
@RequestMapping(CLUBE)
@RequiredArgsConstructor
@Slf4j
public class ClubeController {

    private static final String VIEWS_FOLDER = "clube/";

    private final ClubeService clubeService;

    @GetMapping
    public ModelAndView listAll() {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "lista_clubes");

        List<ClubeDTO> clubes = clubeService.getAll();
        model.addObject("clubes", clubes);

        return model;
    }

    @GetMapping("/ver/{id}")
    public ModelAndView visualizar(@PathVariable Long id) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_clube");

        ClubeDTO clube = clubeService.getByID(id);
        model.addObject("clube", clube);
        model.addObject("visualizacao", true);

        return model;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Long id, @RequestParam(required = false) boolean edicao) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_clube");

        ClubeDTO clube = clubeService.getByID(id);
        model.addObject("clube", clube);
        model.addObject("edicao", edicao);

        return model;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrarForm(@RequestParam(required = false) boolean cadastro) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_clube");

        model.addObject("clube", new ClubeDTO());
        model.addObject("cadastro", cadastro);

        return model;
    }

    @PostMapping("/cadastrar")
    public ModelAndView save(@Valid ClubeDTO clube, BindingResult bindingResult) {
        var model = new ModelAndView();
        var errors = ControllerUtils.createValidationErrorResponse(bindingResult);

        if (!errors.hasErrors()) {
            clubeService.save(clube);

            if (clube.getId() == null) {
                model.setViewName("redirect:" + CLUBE + "/cadastrar?cadastro=true");
            } else {
                model.setViewName("redirect:" + CLUBE + "/editar/" + clube.getId() + "?edicao=true");
            }

            return model;
        }

        model.addObject("errors", errors);
        model.addObject("clube", clube);
        model.setViewName(VIEWS_FOLDER + "form_clube");

        return model;
    }
}
