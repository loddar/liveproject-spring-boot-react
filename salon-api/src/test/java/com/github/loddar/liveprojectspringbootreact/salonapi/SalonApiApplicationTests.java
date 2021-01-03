package com.github.loddar.liveprojectspringbootreact.salonapi;

import com.github.loddar.liveprojectspringbootreact.salonapi.entities.SalonDetail;
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
		assertThat("Has the expected values?", salonDetail, is(expectedSalonDetail()));
	}

	private static SalonDetail expectedSalonDetail() {
	    return SalonDetail.builder()
                .name("AR Salon and Day Spa Services")
                .address("1234 Main Street")
                .zipcode("58201")
                .city("Anytown")
                .state("ND")
                .phone("555-123-4567")
                .build();
    }
}
