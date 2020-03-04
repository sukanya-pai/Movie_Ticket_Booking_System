public class ShowSeat extends Seat{
    int seatNum;
    int price;

    public ShowSeat(int seatNum, int price) {
        super();
        this.seatNum = seatNum;
        this.price = price;
    }

    public int getSeatNum() {
        return this.seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}