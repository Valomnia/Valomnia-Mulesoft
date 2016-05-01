package org.mule.modules.valomnia.automation.system;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.valomnia.core.ConnectorConfig;
import org.mule.tools.devkit.ctf.configuration.util.ConfigurationUtils;
import org.mule.tools.devkit.ctf.exceptions.ConfigurationLoadingFailedException;

public class ConfigTestCases {

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
        client.setUser(username);
        client.setPassword(password);
        client.setBaseUrl(baseUrl);

    }

    @Test
    public void shouldLoggedCorrectly() throws ConnectionException {
        try {
            ConnectorConfig config = new ConnectorConfig();
            config.connect(username, password, baseUrl);
        } catch (Exception e)
        {
            fail(e.getMessage());

        }

    }

    @Test
    public void shouldFailLogin() {
        ConnectorConfig config = new ConnectorConfig();

        try {
            config.connect("wronguser", "wrongpassword", baseUrl);
        } catch (ConnectionException e) {
            assertEquals(ConnectionExceptionCode.INCORRECT_CREDENTIALS, e.getCode());
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    public void nullCredentialsTest() {
        ConnectorConfig config = new ConnectorConfig();

        try {
            config.connect("", "", baseUrl);

        } catch (IllegalStateException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}