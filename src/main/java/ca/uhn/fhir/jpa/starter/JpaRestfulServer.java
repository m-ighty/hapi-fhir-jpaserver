package ca.uhn.fhir.jpa.starter;

import javax.servlet.ServletException;

import ca.uhn.fhir.jpa.starter.interceptors.AuthInterceptor;

public class JpaRestfulServer extends BaseJpaRestfulServer {

  private static final long serialVersionUID = 1L;

  @Override
  protected void initialize() throws ServletException {
    super.initialize();

    registerInterceptor(new AuthInterceptor());

    // Add your own customization here
  }

}
