package org.indra.model;

import java.util.regex.Pattern;

public class ModerarComentariosPoliticos implements EstrategiaModeracion{

	@Override
	public boolean esApropiado(String texto) {
		return !Pattern.matches("(democrata|liberal|comunista)", texto);
	}

}
