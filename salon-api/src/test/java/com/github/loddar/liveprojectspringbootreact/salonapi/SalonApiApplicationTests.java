package com.github.loddar.liveprojectspringbootreact.salonapi;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SalonApiApplicationTests {

	@Autowired
	private SalonDetail salonDetail;

	@Test
	@DisplayName("Has the spring application context been loaded?")
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Has the SalonDetail Bean been created and injected?")
	void verifySalonDetailHasBeenLoadedWithCorrectContent() {
		assertThat(salonDetail.getName(), is("AR Salon and Day Spa Services"));
		assertThat(salonDetail.getAddress(), is("1234 Main Street"));
		assertThat(salonDetail.getZipcode(), is("58201"));
		assertThat(salonDetail.getCity(), is("Anytown"));
		assertThat(salonDetail.getState(), is("ND"));
		assertThat(salonDetail.getPhone(), is("555-123-4567"));
	}
}
