package ar.edu.unju.edm.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Component 
@Entity
public class Paciente_Servicio {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idReservadeServicio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codigo_pacientes")
	Paciente paciente;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idServicio") 
	Servicio servicio;
	
	private Date fechadeinicio;
	private Date fechadefinalizacion;
	
	public Paciente_Servicio() {
		this.paciente= new Paciente();
		this.servicio= new Servicio();  
	}

	public Integer getIdReservadeServicio() {
		return idReservadeServicio;
	}

	public void setIdReservadeServicio(Integer idReservadeServicio) {
		this.idReservadeServicio = idReservadeServicio;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Date getFechadeinicio() {
		return fechadeinicio;
	}

	public void setFechadeinicio(Date fechadeinicio) {
		this.fechadeinicio = fechadeinicio;
	}

	public Date getFechadefinalizacion() {
		return fechadefinalizacion;
	}

	public void setFechadefinalizacion(Date fechadefinalizacion) {
		this.fechadefinalizacion = fechadefinalizacion;
	}
	
	
	
}
