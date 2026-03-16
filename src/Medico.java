public class Medico {

	private int idMedico;
	private String nombre;
	private String numColegiado;
	private String especialidad;
	private String contrasena;

	public int getIdMedico() {
		return this.idMedico;
	}

	/**
	 * 
	 * @param idMedico
	 */
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
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

	public String getNumColegiado() {
		return this.numColegiado;
	}

	/**
	 * 
	 * @param numColegiado
	 */
	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	/**
	 * 
	 * @param especialidad
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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

	/**
	 * 
	 * @param fecha
	 */
	public List<Cita> consultarAgenda(Date fecha) {
		// TODO - implement Medico.consultarAgenda
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paciente
	 */
	public List<Informe> visualizarHistorial(Paciente paciente) {
		// TODO - implement Medico.visualizarHistorial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cita
	 */
	public void atenderPaciente(Cita cita) {
		// TODO - implement Medico.atenderPaciente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cita
	 */
	public Informe generarInforme(Cita cita) {
		// TODO - implement Medico.generarInforme
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dia
	 * @param estado
	 */
	public void gestionarHorario(Date dia, String estado) {
		// TODO - implement Medico.gestionarHorario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cita
	 * @param nuevaFecha
	 */
	public void modificarAgenda(Cita cita, Date nuevaFecha) {
		// TODO - implement Medico.modificarAgenda
		throw new UnsupportedOperationException();
	}

}