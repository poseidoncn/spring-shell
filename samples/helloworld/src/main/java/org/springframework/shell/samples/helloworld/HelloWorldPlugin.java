package org.springframework.shell.samples.helloworld;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.springframework.shell.commands", 
				"org.springframework.shell.converters",
				"org.springframework.shell.samples.helloworld.commands"})
public class HelloWorldPlugin {
	

	
}
