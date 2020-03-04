public class CinemaHall{
    String name;
    int totalScreens;
    String type;
    List<Seat> cinemaHallSeats;

    public CinemaHall() {
    }

    public CinemaHall(String name, int totalScreens, String type, List<Seat> cinemaHallSeats) {
        this.name = name;
        this.totalScreens = totalScreens;
        this.type = type;
        this.cinemaHallSeats = cinemaHallSeats;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalScreens() {
        return this.totalScreens;
    }

    public void setTotalScreens(int totalScreens) {
        this.totalScreens = totalScreens;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Seat> getCinemaHallSeats() {
        return this.cinemaHallSeats;
    }

    public void setCinemaHallSeats(List<Seat> cinemaHallSeats) {
        this.cinemaHallSeats = cinemaHallSeats;
    }



}
    
