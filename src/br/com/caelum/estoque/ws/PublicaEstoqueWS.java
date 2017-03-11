package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EstoqueWS implementacaoWS = new EstoqueWSImpl();
		String URL = "http://localhost:8080/estoquews";

		System.out.println("EstoqueWS rodando: " + URL);

		//associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWS);

	}

}
