public class Address{
    String addLine1;
    String city;
    String state;
    String country;
    int zip;


    public Address() {
    }

    public Address(String addLine1, String city, String state, String country, int zip) {
        this.addLine1 = addLine1;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public String getAddLine1() {
        return this.addLine1;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return this.zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


}