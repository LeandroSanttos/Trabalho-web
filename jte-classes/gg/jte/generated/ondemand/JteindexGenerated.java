package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,2,2,2,2,39,39,39,40,40,40,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, boolean logado) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    <div class=\"hero\">\r\n        <h1>Bem-vindo ao Universo do Futebol!</h1>\r\n        <p>Explore clubes, jogadores, federações e muito mais.</p>\r\n    </div>\r\n\r\n    <section class=\"section\">\r\n        <h2>Funcionalidades</h2>\r\n        <div class=\"services\">\r\n            <div class=\"card\">\r\n                <h3>Clubes</h3>\r\n                <p>Veja informações e estatísticas sobre os principais clubes de futebol.</p>\r\n            </div>\r\n            <div class=\"card\">\r\n                <h3>Jogadores</h3>\r\n                <p>Conheça os jogadores em destaque de cada time e suas carreiras.</p>\r\n            </div>\r\n            <div class=\"card\">\r\n                <h3>Treinadores</h3>\r\n                <p>Explore os técnicos que fazem história nos gramados.</p>\r\n            </div>\r\n            <div class=\"card\">\r\n                <h3>Federações Nacionais</h3>\r\n                <p>Informações sobre as federações que representam os países.</p>\r\n            </div>\r\n            <div class=\"card\">\r\n                <h3>Federações Continentais</h3>\r\n                <p>Entenda como os continentes organizam suas competições.</p>\r\n            </div>\r\n            <div class=\"card\">\r\n                <h3>Campeonatos</h3>\r\n                <p>Descubra os principais torneios e suas classificações.</p>\r\n            </div>\r\n        </div>\r\n    </section>\r\n\r\n");
			}
		}, logado);
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		boolean logado = (boolean)params.get("logado");
		render(jteOutput, jteHtmlInterceptor, logado);
	}
}
