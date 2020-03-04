public class Cinema{
    int cinemaId;
    String name;
    Address location;
    List<CinemaHall> cinemaHalls;

    public Cinema() {
    }

    public Cinema(int cinemaId, String name, Address location, List<CinemaHall> cinemaHalls) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.location = location;
        this.cinemaHalls = cinemaHalls;
    }

    public int getCinemaId() {
        return this.cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return this.location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public List<CinemaHall> getCinemaHalls() {
        return this.cinemaHalls;
    }

    public void setCinemaHalls(List<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

}