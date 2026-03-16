public class Paciente {

	private int idPaciente;
	private String nombre;
	private String dni;
	private String email;
	private String contrasena;

	public int getIdPaciente() {
		return this.idPaciente;
	}

	/**
	 * 
	 * @param idPaciente
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void registrarse() {
		// TODO - implement Paciente.registrarse
		throw new UnsupportedOperationException();
	}

	public boolean iniciarSesion() {
		// TODO - implement Paciente.iniciarSesion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param especialidad
	 */
	public List<Horario> consultarDisponibilidad(String especialidad) {
		// TODO - implement Paciente.consultarDisponibilidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 * @param hora
	 * @param medico
	 */
	public void agendarCita(Date fecha, String hora, Medico medico) {
		// TODO - implement Paciente.agendarCita
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCita
	 */
	public void cancelarCita(int idCita) {
		// TODO - implement Paciente.cancelarCita
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param informe
	 */
	public void consultarInforme(Informe informe) {
		// TODO - implement Paciente.consultarInforme
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param informe
	 */
	public File descargarInforme(Informe informe) {
		// TODO - implement Paciente.descargarInforme
		throw new UnsupportedOperationException();
	}

}