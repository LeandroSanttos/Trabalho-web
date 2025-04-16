package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JteheaderGenerated {
	public static final String JTE_NAME = "layout/header.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,13,13,13,16,16,19,19,24,24,24,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, boolean logado) {
		jteOutput.writeContent("\r\n<header class=\"header\">\r\n    <div class=\"container\">\r\n        <div class=\"header-logo\">\r\n            <img src=\"/img/logo.png\" alt=\"Pet shop IFBA SAJ\">\r\n            <h2 class=\"header-title\">FIFA</h2>\r\n        </div>\r\n        <button class=\"menu-toggle\" id=\"menu-toggle\">&#9776;</button>\r\n        <nav class=\"header-nav\">\r\n            <ul id=\"header-nav\">\r\n                <li><a href=\"/\">Home</a></li>\r\n                <li><a href=\"/federacao_nacional\">Federação Nacional</a></li>\r\n                ");
		if (logado) {
			jteOutput.writeContent("\r\n                    <li><a href=\"/dono\">Donos</a></li>\r\n                    <li><a href=\"/logout\">Logout</a></li>\r\n                ");
		} else {
			jteOutput.writeContent("\r\n                    <li><a href=\"/login\">Login</a></li>\r\n                    <li><a href=\"/cadastro\">Cadastro</a></li>\r\n                ");
		}
		jteOutput.writeContent("\r\n            </ul>\r\n        </nav>\r\n    </div>\r\n</header>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		boolean logado = (boolean)params.get("logado");
		render(jteOutput, jteHtmlInterceptor, logado);
	}
}
