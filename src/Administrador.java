public class Administrador extends Paciente {

	private int idEmpleado;

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	/**
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	/**
	 * 
	 * @param datos
	 */
	public void darDeAltaMedico(Medico datos) {
		// TODO - implement Administrador.darDeAltaMedico
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param medico
	 * @param especialidad
	 */
	public void gestionarEspecialidad(Medico medico, String especialidad) {
		// TODO - implement Administrador.gestionarEspecialidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public List<Informe> archivarInformes(Date fecha) {
		// TODO - implement Administrador.archivarInformes
		throw new UnsupportedOperationException();
	}

}