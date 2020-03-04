public class Show{
    DateTime startTime;
    DateTime endTime;
    int intervalDuration;
    List<ShowSeat> showSeats;

    public Show() {
    }

    public Show(DateTime startTime, DateTime endTime, int intervalDuration) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.intervalDuration = intervalDuration;
    }

    public DateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public int getIntervalDuration() {
        return this.intervalDuration;
    }

    public void setIntervalDuration(int intervalDuration) {
        this.intervalDuration = intervalDuration;
    }

    public List<ShowSeat> getShowSeats() {
        return this.showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }






}