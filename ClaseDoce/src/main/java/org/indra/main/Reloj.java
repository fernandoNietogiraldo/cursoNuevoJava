package org.indra.main;

import java.io.*;

import lombok.*;

@Builder
@ToString

public class Reloj {
	
	private @NonNull String marca;
	private @NonNull String modelo;
	
	@SneakyThrows
	public void salvar() {
		
		@Cleanup FileWriter writer = new FileWriter("reloj.txt");
		writer.write(this.toString());
	}
	

}
