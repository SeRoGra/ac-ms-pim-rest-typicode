package co.com.accenture.acmspimresttypicode.config;
//package co.com.accenture.acmsblogapp.config;
//
//import io.swagger.annotations.Api;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//   @Bean
//   public Docket api() {
//      return new Docket(DocumentationType.OAS_30)
//            .select()
//            .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//            .paths(PathSelectors.any())
//            .build()
//            .apiInfo(apiEndPointsInfo())
//            .useDefaultResponseMessages(false);
//   }
//
//   private ApiInfo apiEndPointsInfo() {
//      return new ApiInfoBuilder()
//            .title("Rest API")
//            .description("")
//            .contact(new Contact("Sebastian Rodríguez", "", "serogra15121999@gmail.com"))
//            .license("Apache 2.0")
//            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//            .version("2.0")
//            .build();
//   }
//}
