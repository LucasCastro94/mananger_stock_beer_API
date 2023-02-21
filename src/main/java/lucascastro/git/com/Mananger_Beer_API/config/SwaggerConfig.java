package lucascastro.git.com.Mananger_Beer_API.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "lucascastro.git.com.Mananger_Beer_API.controller";
    private static final String API_TITLE = "Beer Stock API";
    private static final String API_DESCRIPTION = "REST API for beer stock management";
    private static final String CONTACT_NAME = "Lucas castro";
    private static final String CONTACT_GITHUB = "https://github.com/LucasCastro94";
    private static final String CONTACT_EMAIL = "lucascastro_94@hotmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version("1.0.0")
                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
                .build();
    }
}
