package home.crudapis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver

@SpringBootApplication
class CrudApisApplication {

	static void main(String[] args) {
		SpringApplication.run CrudApisApplication, args
	}

	@Bean
	RepositoryRestExceptionHandler exceptionHandler(MessageSource messageSource) {
		new RepositoryRestExceptionHandler(messageSource)
	}

	@Bean
	RepositoryRestConfigurer repositoryRestConfigurer() {
		RepositoryRestConfigurerAdapter configurer = new RepositoryRestConfigurerAdapter() {

			@Override
			void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath "/api"
				super.configureRepositoryRestConfiguration(config)
			}

		}
		ExceptionHandlerExceptionResolver resolver = new ExceptionHandlerExceptionResolver()
		configurer.configureExceptionHandlerExceptionResolver(resolver)
		return configurer
	}
}
