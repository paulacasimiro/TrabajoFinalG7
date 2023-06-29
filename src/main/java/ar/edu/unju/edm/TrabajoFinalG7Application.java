package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Paciente;
import ar.edu.unju.edm.service.PacienteService;


@SpringBootApplication
public class TrabajoFinalG7Application implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(TrabajoFinalG7Application.class, args);
	}
	@Autowired
	Paciente usuario;
	
	@Autowired
	PacienteService ps;
	
	@Override 
	public void run (String... args ) throws Exception{
		
		/*
		usuario.setEstado(true);
		usuario.setCodigo(2);
		usuario.setNombredeusuario("ingrid");
		usuario.setPassword("222");
		usuario.setTipo("USUARIO");
		ps.registrarPaciente(usuario);
		*/
	}
}
