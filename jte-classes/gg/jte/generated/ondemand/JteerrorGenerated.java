package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,51,51,51,55,55,59,59,66,66,70,70,70,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, boolean serverError) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-br\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Cadastro de Jogador</title>\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/style.css\">\r\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css\" />\r\n    <style>\r\n        .error-container {\r\n          max-width: 600px;\r\n          padding: 2rem;\r\n        }\r\n        .error-code {\r\n          font-size: 6rem;\r\n          color: #06e2f1;\r\n          margin-bottom: 0.5rem;\r\n        }\r\n        .error-title {\r\n          margin-bottom: 1rem;\r\n        }\r\n        .error-description {\r\n          font-size: 1.2rem;\r\n          margin-bottom: 2rem;\r\n        }\r\n        .error-link {\r\n          text-decoration: none;\r\n          color: white;\r\n          background-color: #06e2f1;\r\n          padding: 0.75rem 1.5rem;\r\n          border-radius: 6px;\r\n          font-weight: bold;\r\n          transition: background-color 0.3s ease;\r\n        }\r\n        .error-link:hover {\r\n          background-color:#0515f1;\r\n        }\r\n        .error-icon {\r\n          width: 200px;\r\n          margin-top: 2rem;\r\n        }\r\n    </style>\r\n</head>\r\n<body>\r\n\r\n    <div class=\"wrapper\">\r\n        <main class=\"main container\">\r\n            <div class=\"error-container\">\r\n\r\n                ");
		if (serverError) {
			jteOutput.writeContent("\r\n                    <h1 class=\"error-code\">500</h1>\r\n                    <h2 class=\"error-title\">Ops! Houve um erro inesperado.</h2>\r\n                    <p class=\"error-description\">Desculpe, mas a aplicação apresentou um erro que não consegue tratar</p>\r\n                ");
		} else {
			jteOutput.writeContent("\r\n                    <h1 class=\"error-code\">404</h1>\r\n                    <h2 class=\"error-title\">Ops! Página não encontrada.</h2>\r\n                    <p class=\"error-description\">Desculpe, mas a página que você está procurando não existe ou foi movida.</p>\r\n                ");
		}
		jteOutput.writeContent("\r\n\r\n                <a href=\"/\" class=\"error-link\">Voltar para a página inicial</a>\r\n                <img src=\"https://cdn-icons-png.flaticon.com/512/616/616408.png\" alt=\"Cachorrinho perdido\" class=\"error-icon\">\r\n            </div>\r\n        </main>\r\n\r\n        ");
		gg.jte.generated.ondemand.layout.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    </div>\r\n\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		boolean serverError = (boolean)params.getOrDefault("serverError", false);
		render(jteOutput, jteHtmlInterceptor, serverError);
	}
}
