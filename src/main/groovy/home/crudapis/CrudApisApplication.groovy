package home.crudapis

import home.crudapis.person.Person
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

@SpringBootApplication
class CrudApisApplication {

	static void main(String[] args) {
		SpringApplication.run CrudApisApplication, args
	}

	@Bean
	RepositoryRestConfigurer repositoryRestConfigurer() {
		new RepositoryRestConfigurerAdapter() {

			@Override
			void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath "/api"
				config.getResourceMappingForDomainType Person
			}
		}
	}
}
