package com.trabalho.controller;

import static com.trabalho.consts.RequestPathConstants.JOGADOR;

import com.trabalho.domain.dto.JogadorDTO;
import com.trabalho.service.JogadorService;
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
@RequestMapping(JOGADOR)
@RequiredArgsConstructor
@Slf4j
public class JogadorController {

    private static final String VIEWS_FOLDER = "jogador/";

    private final JogadorService jogadorService;

    @GetMapping
    public ModelAndView listAll() {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "lista_jogadores");

        List<JogadorDTO> jogadores = jogadorService.getAll();
        model.addObject("jogadores", jogadores);

        return model;
    }

    @GetMapping("/ver/{id}")
    public ModelAndView visualizar(@PathVariable Long id) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_jogador");

        JogadorDTO jogador = jogadorService.getById(id);
        model.addObject("jogador", jogador);
        model.addObject("visualizacao", true);

        return model;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Long id, @RequestParam(required = false) boolean edicao) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_jogador");

        JogadorDTO jogador = jogadorService.getById(id);
        model.addObject("jogador", jogador);
        model.addObject("edicao", edicao);

        return model;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrarForm(@RequestParam(required = false) boolean cadastro) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_jogador");

        model.addObject("jogador", new JogadorDTO());
        model.addObject("cadastro", cadastro);

        return model;
    }

    @PostMapping("/cadastrar")
    public ModelAndView save(@Valid JogadorDTO jogador, BindingResult bindingResult) {
        var model = new ModelAndView();
        var errors = ControllerUtils.createValidationErrorResponse(bindingResult);

        if (!errors.hasErrors()) {
            jogadorService.save(jogador);

            if (jogador.getId() == null) {
                model.setViewName("redirect:" + JOGADOR + "/cadastrar?cadastro=true");
            } else {
                model.setViewName("redirect:" + JOGADOR + "/editar/" + jogador.getId() + "?edicao=true");
            }

            return model;
        }

        model.addObject("errors", errors);
        model.addObject("jogador", jogador);
        model.setViewName(VIEWS_FOLDER + "form_jogador");

        return model;
    }
}
