package org.indra.claseQuince.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseError {
	private String mensaje = "Operacion Fallida";
	@NonNull private String detalle;

}
