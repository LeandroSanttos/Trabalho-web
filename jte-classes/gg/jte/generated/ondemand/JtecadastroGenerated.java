package gg.jte.generated.ondemand;
import com.trabalho.exception.ValidationErrorDTO;
import com.trabalho.domain.dto.UsuarioDTO;
@SuppressWarnings("unchecked")
public final class JtecadastroGenerated {
	public static final String JTE_NAME = "cadastro.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,7,7,7,7,14,14,14,14,14,14,14,14,14,15,15,16,16,16,17,17,20,20,20,20,20,20,20,20,20,21,21,22,22,22,23,23,27,27,28,28,28,29,29,35,35,35,36,36,36,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ValidationErrorDTO errors, UsuarioDTO usuario, boolean logado) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <div class=\"form-container\">\r\n        <h2 class=\"title-page\">Cadastro de Usuário</h2>\r\n        <form action=\"/cadastro\" method=\"post\">\r\n\r\n            <label for=\"nome\">Nome:</label>\r\n            <input type=\"text\" name=\"nome\"");
				var __jte_html_attribute_0 = usuario.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n            ");
				for (var error : errors.getErrorsByField("nome")) {
					jteOutput.writeContent("\r\n                <div class=\"error-message\">");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(error.message());
					jteOutput.writeContent("</div>\r\n            ");
				}
				jteOutput.writeContent("\r\n\r\n            <label for=\"email\">Email:</label>\r\n            <input type=\"email\" name=\"email\"");
				var __jte_html_attribute_1 = usuario.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n            ");
				for (var error : errors.getErrorsByField("email")) {
					jteOutput.writeContent("\r\n                <div class=\"error-message\">");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(error.message());
					jteOutput.writeContent("</div>\r\n            ");
				}
				jteOutput.writeContent("\r\n\r\n            <label for=\"senha\">Senha:</label>\r\n            <input type=\"password\" name=\"senha\" required>\r\n            ");
				for (var error : errors.getErrorsByField("senha")) {
					jteOutput.writeContent("\r\n                <div class=\"error-message\">");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(error.message());
					jteOutput.writeContent("</div>\r\n            ");
				}
				jteOutput.writeContent("\r\n\r\n            <button type=\"submit\">Cadastrar</button>\r\n        </form>\r\n    </div>\r\n\r\n");
			}
		}, logado);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ValidationErrorDTO errors = (ValidationErrorDTO)params.getOrDefault("errors", new ValidationErrorDTO());
		UsuarioDTO usuario = (UsuarioDTO)params.get("usuario");
		boolean logado = (boolean)params.get("logado");
		render(jteOutput, jteHtmlInterceptor, errors, usuario, logado);
	}
}
