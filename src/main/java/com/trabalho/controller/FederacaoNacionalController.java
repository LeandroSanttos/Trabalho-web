package com.trabalho.controller;

import static com.trabalho.consts.RequestPathConstants.FEDERACAO_NACIONAL;

import com.trabalho.domain.dto.FederacaoNacionalDTO;
import com.trabalho.service.FederacaoNacionalService;
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
@RequestMapping(FEDERACAO_NACIONAL)
@RequiredArgsConstructor
@Slf4j
public class FederacaoNacionalController {

    private static final String VIEWS_FOLDER = "federacao_nacional/";

    private final FederacaoNacionalService federacaoNacionalService;

    @GetMapping
    public ModelAndView listAll() {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "lista_federacoes_nacionais");

        List<FederacaoNacionalDTO> federacoes = federacaoNacionalService.getAll();
        model.addObject("federacoes", federacoes);

        return model;
    }

    @GetMapping("/ver/{id}")
    public ModelAndView visualizar(@PathVariable Long id) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_federacao_nacional");

        FederacaoNacionalDTO federacao = federacaoNacionalService.getByID(id);
        model.addObject("federacao", federacao);
        model.addObject("visualizacao", true);

        return model;
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Long id, @RequestParam(required = false) boolean edicao) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_federacao_nacional");

        FederacaoNacionalDTO federacao = federacaoNacionalService.getByID(id);
        model.addObject("federacao", federacao);
        model.addObject("edicao", edicao);

        return model;
    }

    @GetMapping("/cadastrar")
    public ModelAndView cadastrarForm(@RequestParam(required = false) boolean cadastro) {
        var model = new ModelAndView();
        model.setViewName(VIEWS_FOLDER + "form_federacao_nacional");

        model.addObject("federacao", new FederacaoNacionalDTO());
        model.addObject("cadastro", cadastro);

        return model;
    }

    @PostMapping("/cadastrar")
    public ModelAndView save(@Valid FederacaoNacionalDTO federacao, BindingResult bindingResult) {
        var model = new ModelAndView();
        var errors = ControllerUtils.createValidationErrorResponse(bindingResult);

        if (!errors.hasErrors()) {
            federacaoNacionalService.save(federacao);

            if (federacao.getId() == null) {
                model.setViewName("redirect:" + FEDERACAO_NACIONAL + "/cadastrar?cadastro=true");
            } else {
                model.setViewName("redirect:" + FEDERACAO_NACIONAL + "/editar/" + federacao.getId() + "?edicao=true");
            }

            return model;
        }

        model.addObject("errors", errors);
        model.addObject("federacao", federacao);
        model.setViewName(VIEWS_FOLDER + "form_federacao_nacional");

        return model;
    }
}
