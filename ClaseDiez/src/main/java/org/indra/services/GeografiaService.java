package org.indra.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeografiaService implements IGeografiaService{
	
	private List<String> comunidadesAutonomas;
	private Map<String,String> provincias;

	public Map<String, String> getProvincias() {
		return provincias;
	}

	public void setProvincias(Map<String, String> provincias) {
		this.provincias = provincias;
	}

	public List<String> getComunidadesAutonomas() {
		return this.comunidadesAutonomas;
	}
	
	public void setComunidadesAutonomas(List<String> comunidadesAutonomas) {
		this.comunidadesAutonomas = comunidadesAutonomas;
	}

	@Override
	public List<String> getProvincias(String comunidad) {
		return Arrays.asList(this.provincias.get(comunidad).split(","));
	}

}
