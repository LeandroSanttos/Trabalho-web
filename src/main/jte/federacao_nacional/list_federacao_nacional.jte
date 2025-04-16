@import com.trabalho.domain.dto.FederacaoNacionalDTO
@import java.util.List

@param List<FederacaoNacionalDTO> federacoes
@param boolean logado = true

@template.layout.main(logado = logado, content = @`

    <h2 class="title-page">Federações Nacionais Cadastradas</h2>

    <a href="/federacao-nacional/cadastrar" class="btn-adicionar">Cadastrar Nova Federação</a>

    <table class="tabela">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>País Sede</th>
                <th>Email</th>
                <th>Federação Continental</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            @for(var federacao : federacoes)
                <tr>
                    <td>${federacao.getId()}</td>
                    <td>${federacao.getNome()}</td>
                    <td>${federacao.getPaisSede()}</td>
                    <td>${federacao.getEmail()}</td>
                    <td>${federacao.getFederacaoContinental() != null ? federacao.getFederacaoContinental().getNome() : "Não definida"}</td>
                    <td>
                        <a href="/federacao-nacional/ver/${federacao.getId()}" class="btn-ver">Ver</a>
                        <a href="/federacao-nacional/editar/${federacao.getId()}?edicao=true" class="btn-editar">Editar</a>
                    </td>
                </tr>
            @endfor
        </tbody>
    </table>

`)
