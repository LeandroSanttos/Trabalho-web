@import com.trabalho.domain.dto.FederacaoNacionalDTO
@import com.trabalho.domain.dto.FederacaoContinentalDTO
@import com.trabalho.exception.ValidationErrorDTO

@param FederacaoNacionalDTO federacao = new FederacaoNacionalDTO()
@param ValidationErrorDTO errors = new ValidationErrorDTO()
@param boolean cadastro = false
@param boolean edicao = false
@param boolean visualizacao = false

@template.layout.main(logado = true, content = @`

    <button class="btn-cadastrar" onclick="history.back()">Voltar</button>

    <div class="form-container">
        <h2 class="title-page">
            @if(cadastro) Cadastro de Federação Nacional @else if(edicao) Edição de Federação Nacional @else Visualização de Federação Nacional @endif
        </h2>

        <form method="post" action="/federacao-nacional/cadastrar">
            <input type="hidden" name="id" value="${federacao.getId()}"/>

            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" value="${federacao.getNome()}" 
                   @if(visualizacao) readonly @endif>
            @for(var error : errors.getErrorsByField("nome"))
                <div class="error-message">${error.message()}</div>
            @endfor

            <label for="paisSede">País Sede:</label>
            <input type="text" id="paisSede" name="paisSede" value="${federacao.getPaisSede()}" 
                   @if(visualizacao) readonly @endif>
            @for(var error : errors.getErrorsByField("paisSede"))
                <div class="error-message">${error.message()}</div>
            @endfor

            <label for="email">E-mail:</label>
            <input type="email" id="email" name="email" value="${federacao.getEmail()}" 
                   @if(visualizacao) readonly @endif>
            @for(var error : errors.getErrorsByField("email"))
                <div class="error-message">${error.message()}</div>
            @endfor

            <label for="federacaoContinental">Federação Continental:</label>
            <input type="text" id="federacaoContinental" name="federacaoContinental.nome" 
                   value="${federacao.getFederacaoContinental() != null ? federacao.getFederacaoContinental().getNome() : ""}" 
                   @if(visualizacao) readonly @endif>
            @for(var error : errors.getErrorsByField("federacaoContinental"))
                <div class="error-message">${error.message()}</div>
            @endfor

            @if(!visualizacao)
                <button type="submit">
                    @if(cadastro) Cadastrar @else Salvar Alterações @endif
                </button>
            @endif

            @if(cadastro)
                <div class="success-message" style="margin-top:10px;" hidden="${!cadastro}">
                    Federação cadastrada com sucesso!
                </div>
            @endif

            @if(edicao)
                <div class="success-message" style="margin-top:10px;" hidden="${!edicao}">
                    Edição salva com sucesso!
                </div>
            @endif
        </form>
    </div>
`)
