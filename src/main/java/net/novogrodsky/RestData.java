package net.novogrodsky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by davidnovogrodsky_wrk on 3/23/15.
 * This object will contain the information retrieved from the RESTful service.
 * This is not a domain object.  There is no reason this should directly connect
 * to a database table.
 *
 * also, I am setting this up to ignore unknown properties.  If I did not declare
 * a property in the class, the rest of the client can ignore it.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class RestData {
    private String name = null;
    private String about = null ;
    private String phone = null;
    private String website = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public RestData(String newName, String newAbout, String newPhone, String newWebsite) {
        setName(newName);
        setAbout(newAbout);
        setPhone(newPhone);
        setWebsite(newWebsite);
    }

    public RestData(){

    }

}
