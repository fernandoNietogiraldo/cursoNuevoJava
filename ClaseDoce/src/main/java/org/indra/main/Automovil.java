package org.indra.main;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Automovil {
	
	private int id;
	private @NonNull String marca;
	private @NonNull String modelo;
	private int kilometros;

}
