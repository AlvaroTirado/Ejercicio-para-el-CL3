package entidad;

import java.sql.Date;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;
	private Tipo tipo;
	private String tipoNombre;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getTipoNombre() {
		tipoNombre = tipo.getNombre();
		return tipoNombre;
	}
	public void setTipoNombre(String tipoNombre) {
		this.tipoNombre = tipoNombre;
	}
	
	
}
