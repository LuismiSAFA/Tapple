package com.example.proyecto_tapple;

import com.example.proyecto_tapple.Controllers.GameController;
import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;
import java.net.InetSocketAddress;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(DemoApplication.class, args);
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

		//creando el contexto para el endpoint
		//HttpContext contexto = server.createContext("/test", new GameController());


		server.setExecutor(null);
		server.start();

	}

}
