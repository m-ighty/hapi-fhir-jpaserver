package ca.uhn.fhir.jpa.starter.interceptors;

import java.util.List;

import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.server.interceptor.auth.AuthorizationInterceptor;
import ca.uhn.fhir.rest.server.interceptor.auth.IAuthRule;
import ca.uhn.fhir.rest.server.interceptor.auth.RuleBuilder;

public class AuthInterceptor extends AuthorizationInterceptor {

    @Override
    public List<IAuthRule> buildRuleList(RequestDetails requestDetails) {
        System.out.println(requestDetails.getCompleteUrl());

        return new RuleBuilder()
         .allowAll()
         .build();
    }

}