package org.mule.modules.valomnia.automation.system;

import java.util.Properties;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mule.api.ConnectionException;
import org.mule.modules.valomnia.core.ConnectorConfig;
import org.mule.tools.devkit.ctf.configuration.util.ConfigurationUtils;
import org.mule.tools.devkit.ctf.exceptions.ConfigurationLoadingFailedException;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;


public class ConfigTestCases {

    
/*
    @Rule
    
    private ConnectorConfig client;
    private Properties credentials;
    private String username;
    private String password;
    private String baseUrl;

    @Before
    public void setUp() throws ConnectionException, ConfigurationLoadingFailedException {

      

        credentials = ConfigurationUtils.getAutomationCredentialsProperties();
        username = credentials.getProperty("config.username");
        password = credentials.getProperty("config.password");
       baseUrl = credentials.getProperty("config.baseUrl");
        client = new ConnectorConfig();
       /* client.setUser(username);
        client.setPassword(password);
        client.setBaseUrl(baseUrl);
       *

    }

    @Test
    public void shouldLoggedCorrectly() throws ConnectionException {
        String response = client.authentication(client.getUser(), client.getPassword());
        
        Assert.assertNotNull(response);
       

    }

    @Test
    public void shouldFailLogin() {
String response = client.authentication("", "");
        
        Assert.assertNull(response);
    }
*/
    

}