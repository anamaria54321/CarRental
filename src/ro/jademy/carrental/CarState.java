package ro.jademy.carrental;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarState {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat();

    private boolean isRented = false;
    private Date startDate;
    private Date finalDate;

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public String toString() {
        return "CarState{" +
                "isRented=" + isRented +
                ", startDate=" + startDate +
                ", finalDate=" + finalDate +
                '}';
    }
}
