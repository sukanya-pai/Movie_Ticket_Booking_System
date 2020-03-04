public class Booking{
    int bookingId;
    int userId;
    int cinemaId;
    List<Seat> bookedSeats;
    long amount;
    String paymentStatus;
    Date bookedDate;
    DateTime movieTiming;

    public Booking(int bookingId, int userId, int cinemaId, List<Seat> bookedSeats, long amount, String paymentStatus, Date bookedDate, DateTime movieTiming) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.cinemaId = cinemaId;
        this.bookedSeats = bookedSeats;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.bookedDate = bookedDate;
        this.movieTiming = movieTiming;
    }

    public int getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCinemaId() {
        return this.cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public List<Seat> getBookedSeats() {
        return this.bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getBookedDate() {
        return this.bookedDate;
    }

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public DateTime getMovieTiming() {
        return this.movieTiming;
    }

    public void setMovieTiming(DateTime movieTiming) {
        this.movieTiming = movieTiming;
    }

    

}