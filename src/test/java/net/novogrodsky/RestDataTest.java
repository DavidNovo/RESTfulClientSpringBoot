package net.novogrodsky;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestDataTest {

    @Test
    public void testGetName() throws Exception {
        RestData testRestData = new RestData();
        assert testRestData.getName() == null;

        RestData testRestDataTwo = new RestData("David", "about me", "2103320555", "www.guess.net");
        assert testRestDataTwo.getName() == "David";
    }

    @Test
    public void testSetName() throws Exception {
        RestData testRestData = new RestData();
        testRestData.setName("Samantha");

        assertNotNull(testRestData);
        assertNotNull(testRestData.getName());

    }

    @Test
    public void testGetAbout() throws Exception {
        RestData testRestData = new RestData();
        assert testRestData.getAbout() == null;

        RestData testRestDataTwo = new RestData("David", "about me", "2103320555", "www.guess.net");
        assert testRestDataTwo.getAbout() == "about me";
    }

    @Test
    public void testSetAbout() throws Exception {
        RestData testRestData = new RestData();
        testRestData.setAbout("the new year");

        assertNotNull(testRestData);
        assertNotNull(testRestData.getAbout());
    }

    @Test
    public void testGetPhone() throws Exception {
        RestData testRestData = new RestData();
        assert testRestData.getPhone() == null;

        RestData testRestDataTwo = new RestData("David", "about me", "2103320555", "www.guess.net");
        assert testRestDataTwo.getPhone() == "2103320555";
    }

    @Test
    public void testSetPhone() throws Exception {
        RestData testRestData = new RestData();
        testRestData.setPhone("2103320432");

        assertNotNull(testRestData);
        assertNotNull(testRestData.getPhone());
    }

    @Test
    public void testGetWebsite() throws Exception {
        RestData testRestData = new RestData();
        assert testRestData.getWebsite() == null;

        RestData testRestDataTwo = new RestData("David", "about me", "2103320555", "www.guess.net");
        assert testRestDataTwo.getWebsite() == "www.guess.net";
    }

    @Test
    public void testSetWebsite() throws Exception {
        RestData testRestData = new RestData();
        testRestData.setWebsite("www.newday.com");

        assertNotNull(testRestData);
        assertNotNull(testRestData.getWebsite());
    }
}