package SpringBootRestfilClient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static SpringBootRestfilClient.ClientController.*;


//source
//https://o7planning.org/en/11647/spring-boot-restful-client-with-resttemplate-example
//https://o7planning.org/en/11645/crud-restful-web-service-with-spring-boot-example

public class App

{

    static final String URL_EMPLOYEES = "http://localhost:8080/employees";

    public static void main( String[] args ){
        getAllEmployees();
        deleteEmployee();
        getAllEmployees();
        putEmployee();
        getAllEmployees();
        postEmployee();
        getAllEmployees();
}
}
