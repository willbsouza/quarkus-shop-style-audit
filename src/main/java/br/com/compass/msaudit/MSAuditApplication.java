package br.com.compass.msaudit;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title="Microservice Audit - Shop Style",
                version = "1.0",
                contact = @Contact(
                        name = "Willams Souza",
                        url = "http://www.github.com/willbsouza",
                        email = "willamsbernardo@hotmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class MSAuditApplication {
}
