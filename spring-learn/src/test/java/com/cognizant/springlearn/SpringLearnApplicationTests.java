package com.cognizant.springlearn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringLearnApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String getBaseUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void testSayHello() {
        ResponseEntity<String> response = restTemplate.getForEntity(getBaseUrl() + "/hello", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello World!!", response.getBody());
    }

    @Test
    public void testGetCountryIndia() {
        ResponseEntity<Country> response = restTemplate.getForEntity(getBaseUrl() + "/country", Country.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("IN", response.getBody().getCode());
        assertEquals("India", response.getBody().getName());
    }

    @Test
    public void testGetCountryByCode() {
        ResponseEntity<Country> responseIn = restTemplate.getForEntity(getBaseUrl() + "/countries/in", Country.class);
        assertEquals(HttpStatus.OK, responseIn.getStatusCode());
        assertNotNull(responseIn.getBody());
        assertEquals("India", responseIn.getBody().getName());

        ResponseEntity<Country> responseUs = restTemplate.getForEntity(getBaseUrl() + "/countries/US", Country.class);
        assertEquals(HttpStatus.OK, responseUs.getStatusCode());
        assertNotNull(responseUs.getBody());
        assertEquals("United States", responseUs.getBody().getName());
    }

    @Test
    public void testGetAllEmployees() {
        ResponseEntity<Employee[]> response = restTemplate.getForEntity(getBaseUrl() + "/employees", Employee[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(4, response.getBody().length);
    }

    @Test
    public void testGetAllDepartments() {
        ResponseEntity<Department[]> response = restTemplate.getForEntity(getBaseUrl() + "/departments", Department[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(3, response.getBody().length);
    }

    @Test
    public void testAuthenticate() {
        ResponseEntity<Map> responseUnauthorized = restTemplate.getForEntity(getBaseUrl() + "/authenticate", Map.class);
        assertEquals(HttpStatus.UNAUTHORIZED, responseUnauthorized.getStatusCode());

        TestRestTemplate authenticatedRestTemplate = restTemplate.withBasicAuth("user", "pwd");
        ResponseEntity<Map> response = authenticatedRestTemplate.getForEntity(getBaseUrl() + "/authenticate", Map.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().containsKey("token"));
        assertNotNull(response.getBody().get("token"));
    }
}
