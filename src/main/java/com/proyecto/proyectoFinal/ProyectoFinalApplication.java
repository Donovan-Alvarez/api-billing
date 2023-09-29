package com.proyecto.proyectoFinal;

import com.proyecto.proyectoFinal.entity.Client;
import com.proyecto.proyectoFinal.repository.ClientRepository;
import com.proyecto.proyectoFinal.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ProyectoFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}
}
