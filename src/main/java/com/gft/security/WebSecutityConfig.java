package com.gft.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gft.services.AutenticacaoService;
=======
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecutityConfig  extends WebSecurityConfigurerAdapter{

	
	@Autowired
<<<<<<< HEAD
	private  AutenticacaoService autenticacaoService;
	
=======
	UserDetailsService userDetailsService;
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	
	 private static final String[] AUTH_WHITELIST = {
	            // -- Swagger UI v2
	            "/v2/api-docs",
	            "/swagger-resources",
	            "/swagger-resources/**",
	            "/configuration/ui",
	            "/configuration/security",
	            "/swagger-ui.html",
	            "/webjars/**",
	            // -- Swagger UI v3 (OpenAPI)
	            "/v3/api-docs/**",
	            "/swagger-ui/**",
<<<<<<< HEAD
	            "/v1/popular-banco"
	            
	    };

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService).passwordEncoder(AutenticacaoService.passwordEncoder());
			
	}
	

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
        .antMatchers(AUTH_WHITELIST).permitAll()
		.anyRequest().authenticated()
		.and().httpBasic()	
		.and().csrf().disable();
		
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("1111"));
=======
	            "/v1/veterinarios"
	    };
	 
	 
	 private static final String[] LISTAAUTENTICACAO = {
			 
	 };
	 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
        .authorizeHttpRequests()
        .antMatchers(AUTH_WHITELIST).permitAll()
        .and().httpBasic();
		
		
//		 http
//         // ... here goes your custom security configuration
//	
//		 .csrf().disable()
//         .authorizeHttpRequests()
//         .antMatchers(AUTH_WHITELIST).permitAll()
//         .anyRequest().authenticated();
//		http
//			.httpBasic()
//			.and().authorizeRequests()
//			.antMatchers("/v2/api-docs", "/configuration/**", "/swagger*/**", "/webjars/**")
//			.permitAll()//.antMatchers(HttpMethod.GET,"v1/clientes/").hasAuthority("")
//			.anyRequest().authenticated()
//			.and();
	}

	


	  @Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	  }
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
>>>>>>> d37a829e21d06fcee20d22c143bb7772108837de
	}
 
}
