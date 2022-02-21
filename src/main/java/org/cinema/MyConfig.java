package org.cinema;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.cinema")
@EnableAspectJAutoProxy
public class MyConfig {
}
