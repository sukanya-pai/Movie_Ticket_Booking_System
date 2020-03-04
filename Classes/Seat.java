public class Seat{
    int seatRow;
    int seatCol;
    String type;


    public Seat() {
    }

    public Seat(int seatRow, int seatCol, String type) {
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.type = type;
    }

    public int getSeatRow() {
        return this.seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatCol() {
        return this.seatCol;
    }

    public void setSeatCol(int seatCol) {
        this.seatCol = seatCol;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}