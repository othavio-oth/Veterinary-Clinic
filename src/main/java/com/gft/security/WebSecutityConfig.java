package com.gft.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.gft.services.AuthenticationService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecutityConfig {

	@Autowired
	private AuthenticationService authenticationService;

	// private static final String[] AUTH_WHITELIST = {
	// // -- Swagger UI v2
	// "/v2/api-docs",
	// "/swagger-resources",
	// "/swagger-resources/**",
	// "/configuration/ui",
	// "/configuration/security",
	// "/swagger-ui.html",
	// "/webjars/**",
	// // -- Swagger UI v3 (OpenAPI)
	// "/v3/api-docs/**",
	// "/swagger-ui/**",
	// "/v1/popular-banco"

	// };

}
