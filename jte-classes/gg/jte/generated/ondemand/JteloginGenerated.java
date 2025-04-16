package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,4,4,4,4,17,17,19,19,20,20,22,22,24,24,24,25,25,25,0,1,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String error, String logout, boolean logado) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <div class=\"form-container\">\r\n        <h2 class=\"title-page\">Login</h2>\r\n        <form action=\"/login\" method=\"post\">\r\n            <label for=\"username\">Email:</label>\r\n            <input type=\"text\" name=\"username\" required>\r\n\r\n            <label for=\"password\">Senha:</label>\r\n            <input type=\"password\" name=\"password\" required>\r\n\r\n            <button type=\"submit\">Login</button>\r\n        </form>\r\n        ");
				if (error != null) {
					jteOutput.writeContent("\r\n            <div class=\"error-message\">Email ou senha incorretos</div>\r\n        ");
				}
				jteOutput.writeContent("\r\n        ");
				if (logout != null) {
					jteOutput.writeContent("\r\n            <p style=\"margin-top: 10px;\">Você foi deslogado</p>\r\n        ");
				}
				jteOutput.writeContent("\r\n    </div>\r\n");
			}
		}, logado);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String error = (String)params.get("error");
		String logout = (String)params.get("logout");
		boolean logado = (boolean)params.get("logado");
		render(jteOutput, jteHtmlInterceptor, error, logout, logado);
	}
}
