package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

class JavaTimeTests {

	@Test
	void testLocalDate() {
		LocalTime fechaArg = LocalTime.now(ZoneId.of("America/Argentina/Salta")).truncatedTo(ChronoUnit.SECONDS);
		LocalTime fechaSpain = LocalTime.now(ZoneId.of("Europe/Madrid")).truncatedTo(ChronoUnit.SECONDS);
		
		assertEquals(fechaArg.plusHours(5), fechaSpain);
	}

}
