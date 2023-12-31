package ar.edu.unju.edm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Especialidad {
	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer codigo;
	
	@NotBlank(message = "Debe ingresar el nombre de la especialidad")
	@Size(min=3, max=20, message="El nombre de la especialidad debe tener entre 3 y 20 caracteres")
	private String nombre; 
	
	private String descripcion; 
	private Boolean estado;
	
	
	
	//CONSTRUCTOR POR DEFECTO
	public Especialidad() {
		// TODO Auto-generated constructor stub
	}
	//CONSTRUCTOR PARAMETRIZADO
	public Especialidad(Integer codigo, String nombre, String descripcion, Boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	//GETERS AND SETTERS 
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	} 
	
	
	

}
