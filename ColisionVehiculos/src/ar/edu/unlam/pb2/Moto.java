package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte{
	private String patente;
	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;
	
	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.patente=patente;
		this.CAPACIDA_MAXIMA_DE_PASAJEROS=2;
		this.velocidadMaxima=velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

}
