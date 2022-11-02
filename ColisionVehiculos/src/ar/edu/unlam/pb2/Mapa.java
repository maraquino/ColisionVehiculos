package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mapa {
	private String nombre;
	private Set<MedioTransporte>vehiculos;
	
	public Mapa(String nombre) {
		this.nombre=nombre;
		this.vehiculos=new HashSet<>();
	}

	public void agregarVehiculo(MedioTransporte vehiculo) {
		vehiculos.add(vehiculo);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		for (MedioTransporte medioTransporte : vehiculos) {
			for (MedioTransporte medioTransporte2 : vehiculos) {
				if(!medioTransporte.equals(medioTransporte2)) {
					if(medioTransporte.getLatitud().equals(medioTransporte.getLatitud())
							&&medioTransporte.getLongitud().equals(medioTransporte.getLongitud())) {
						throw new ColitionException();
					}
				}
			}
		}return false;
	}
}
