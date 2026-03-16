public class Cita {

	private int idCita;
	private Date fecha;
	private String hora;
	private String estado;

	public int getIdCita() {
		return this.idCita;
	}

	/**
	 * 
	 * @param idCita
	 */
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHora() {
		return this.hora;
	}

	public void enviarNotificacionSMS() {
		// TODO - implement Cita.enviarNotificacionSMS
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paciente
	 * @param medico
	 */
	public Cita crearCita(Paciente paciente, Medico medico) {
		// TODO - implement Cita.crearCita
		throw new UnsupportedOperationException();
	}

}