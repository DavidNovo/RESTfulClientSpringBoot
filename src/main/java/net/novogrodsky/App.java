package net.novogrodsky;

import org.springframework.web.client.RestTemplate;
/**
 * Running the REST client without making a WAR file.
 *
 */
public class App 
{
    public static void main( String[] args ) {
        RestTemplate restTemplate = new RestTemplate();
        RestData page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", RestData.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());
    }
}
