package pe.edu.upn.demo.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "YO")
public class SamuelLazo {

	@Id
	@Column(name = "codigo", length = 10)
	private String codigo;
	
	@Column(name = "nombre", length = 25, nullable = false)
	private String nombre;
	
	@Column(name = "apellido",length = 25)
	private String apellido;
	
	@Column(name = "Edad")
	private Integer edad;
	
	
	@Column(name = "fecha}_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "direccion", length = 50, nullable = true)
	private String direccion;
	
	
	
}
