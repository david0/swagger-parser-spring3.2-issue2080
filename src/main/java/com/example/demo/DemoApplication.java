package com.example.demo;

import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// RUN VIA JAR: ./gradlew bootJar && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
	public static void main(String[] args) {
		var options = new ParseOptions();
		options.setResolve(true);

		var parser = new OpenAPIV3Parser().read("/specs/petstore.openapi.yaml", null, options);
	}


}
