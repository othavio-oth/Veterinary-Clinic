package com.gft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	    private static final String CONTACT_GITHUB = "https://git.gft.com/ooda/desafio-api";
	    private static final String CONTACT_EMAIL = "othavio.sousa@gft.com";

	    Contact contact = new Contact();
	    	
    @Bean
    public OpenAPI customOpenAPI() {
    	
    	contact.setEmail(CONTACT_EMAIL);
    	contact.setUrl(CONTACT_GITHUB);
    	contact.setEmail(CONTACT_EMAIL);
        return new OpenAPI()
        		 
        		           .info(new Info().title("Clínica Vet")
        		                           .description("Projeto de API de Clínica veterinária do projeto Starter. "
        		                           		+ "Inicie seu uso dessa API por executar o método POST de 'popular-banco-controller'. Assim o banco será populado e você conseguirá fazer o login."
        		                           		+ " Acesse todos os CRUDs"
        		                           		+ " As demais orientções estão no arquivo README do repositório dessa API:"
        		                           		+ " https://git.gft.com/ooda/desafio-api"
        		                        		   )
        		                            .version("v0.0.1").contact(contact)

        		                            );
        		            
    }

   
}
