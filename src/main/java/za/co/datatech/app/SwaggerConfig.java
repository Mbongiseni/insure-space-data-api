package za.co.datatech.app;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public static final Contact DEFAULT_CONTACT = new Contact("Mbongiseni Ngubane",
			"http://www.datatech.co.za",
			"mbongiseni.ngubane@datatech.co.za");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Awesome API Title", 
			"Awesome API Description", 
			"1.0", 
			"urn:tos", 
			DEFAULT_CONTACT, 
			"Apache 2.0", 
			"http://wwww.apache.org/licenses/LICENSE-2.0");
	
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2);
	}
}
