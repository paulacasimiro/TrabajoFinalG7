package ar.edu.unju.edm.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Medico {
	@Id 
	private Integer matricula;
	
	@NotBlank(message = "Debe ingresar el nombre y apellido del medico")
	@Size(min=3, max=20, message="El nombre del medico debe tener entre 3 y 20 caracteres")
	private String nombreApellido; 
	
	@NotNull(message = "Debe ingresar DNI")
	private Integer dni;
	
	private String direccion;
	private Integer telefono;
	private Boolean estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo")
	Especialidad especialidad;
	public Medico() {
		this.especialidad = new	Especialidad();
	}

	public Medico(Integer matricula, String nombreApellido, Integer dni, String direccion, Integer telefono,
			Boolean estado) {
		super();
		this.matricula = matricula;
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	
	
	
}
