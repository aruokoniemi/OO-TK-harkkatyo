/* 
 * Tekijä: Aleksi Ruokoniemi
 * Oppilasnumero: 0452334
 */

package harkkatyo;

import java.util.ArrayList;

public class SmartPost {
    private int SmartPostID;
    final private String address;
    final private String postalNumber;
    final private String city;
    final private String availability;
    final private String postoffice;
    final private GeoPoint gp;
    
    public class GeoPoint {
        final private String latitude;
        final private String longitude;
        
        public GeoPoint(String lat, String lon) {
            this.latitude = lat;
            this.longitude = lon;
        }
         
        public ArrayList<String> getAsArrayList() {
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add(latitude);
            arrList.add(longitude);
            return arrList;
        }
    }
 
    public SmartPost(String address, String city, String postalnumber, 
            String avail, String postoffice, String latitude, String longitude) {
        this.address = address;
        this.postalNumber = postalnumber;
        this.city = city;
        this.availability = avail;
        this.postoffice = postoffice;
        
        gp = new GeoPoint(latitude, longitude);
    }
    
    public SmartPost(int smartPostID, String address, String city, String postalnumber, 
            String avail, String postoffice, String latitude, String longitude) {
        this.SmartPostID = smartPostID;
        this.address = address;
        this.postalNumber = postalnumber;
        this.city = city;
        this.availability = avail;
        this.postoffice = postoffice;
        
        gp = new GeoPoint(latitude, longitude);
        
    }
    
    public int getID() {
        return SmartPostID;
    }
    
    public String getAvailability() {
        return availability;
    }
    
    public String getPostOffice() {
        return postoffice;
    }
    
    public String getLocalAddress() {
        return address;
    }    
    
    public String getCity() {
        return city;
    }
    
    public String getPostalNumber() {
        return postalNumber;
    }
    
    public GeoPoint getGeoPoint() {
        return gp;
    }
    
}

