package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,15,15,15,18,18,18,21,21,26,26,26,0,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content, boolean logado) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-br\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>FIFA Administrativo</title>\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/style.css\">\r\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css\" />\r\n</head>\r\n<body>\r\n\r\n    <div class=\"wrapper\">\r\n        ");
		gg.jte.generated.ondemand.layout.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor, logado);
		jteOutput.writeContent("\r\n\r\n        <main class=\"main container\">\r\n            ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        </main>\r\n\r\n        ");
		gg.jte.generated.ondemand.layout.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    </div>\r\n\r\n    <script src=\"/js/script.js\"></script>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		boolean logado = (boolean)params.getOrDefault("logado", false);
		render(jteOutput, jteHtmlInterceptor, content, logado);
	}
}
