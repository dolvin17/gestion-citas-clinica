public class Informe {

	private int idInforme;
	private Date fechaEmision;
	private String diagnostico;
	private String tratamiento;

	public int getIdInforme() {
		return this.idInforme;
	}

	/**
	 * 
	 * @param idInforme
	 */
	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	/**
	 * 
	 * @param fechaEmision
	 */
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getDiagnostico() {
		return this.diagnostico;
	}

	/**
	 * 
	 * @param diagnostico
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return this.tratamiento;
	}

	/**
	 * 
	 * @param tratamiento
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

}