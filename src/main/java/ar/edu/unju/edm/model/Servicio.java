package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
/*import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;*/
import javax.validation.constraints.Size;


@Component
@Entity
public class Servicio {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idServicio;
	
	@NotNull(message = "Debe ingresar el costo del servicio")
	private Integer costoDelServicio;
	
	@NotBlank(message = "Debe ingresar el nombre del servicio")
	@Size(min = 3, max = 20, message = "El nombre del servicio debe tener entre 3  20 caracteres")
	private String nombreServicio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="matricula")
	Medico medico;
	
	public Servicio() {
		this.medico = new Medico(); 
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Integer getCostoDelServicio() {
		return costoDelServicio;
	}

	public void setCostoDelServicio(Integer costoDelServicio) {
		this.costoDelServicio = costoDelServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
