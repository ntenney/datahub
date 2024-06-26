package com.linkedin.gms.servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(
    basePackages = {
      "io.datahubproject.openapi.config",
      "io.datahubproject.openapi.health",
      "io.datahubproject.openapi.openlineage",
      "io.datahubproject.openapi.operations",
      "io.datahubproject.openapi.platform",
      "io.datahubproject.openapi.relationships",
      "io.datahubproject.openapi.timeline",
      "io.datahubproject.openapi.entities",
      "io.datahubproject.openapi.v2",
      "com.linkedin.gms.factory.timeline"
    })
@Configuration
public class OpenAPIServletConfig {}
