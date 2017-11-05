package be.gestatech.hr.rest.service;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import static org.glassfish.jersey.CommonProperties.FEATURE_AUTO_DISCOVERY_DISABLE;

@ApplicationPath("api")
public class JaxrsActiviator extends ResourceConfig {

    public JaxrsActiviator() {
        // forcing declarative mode to avoid misbehaviours due to auto discovery of features
        property(FEATURE_AUTO_DISCOVERY_DISABLE, false);
        // Enable Bean Validation error messages.
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        // Packages Scan
        packages(true, JaxrsActiviator.class.getPackage().getName());
        // Jackson mapper
        //register(ObjectMapperFeature.class);
        // Jackson Provider, Bean Validation & response wrapper
        //register(ValidationFeature.class);
        // Authorization
        //register(CredentialsFeature.class);
        // Corrigendum
        //register(CorrigendumFilter.class);
        // Multi-part upload feature
        register(MultiPartFeature.class);
    }
}

