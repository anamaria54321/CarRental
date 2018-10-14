package ro.jademy.carrental.car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class CarState {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat();

    private boolean isRented = false;
    private GregorianCalendar startDate;
    private  GregorianCalendar finalDate;

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(GregorianCalendar finalDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarState carState = (CarState) o;
        return isRented == carState.isRented &&
                Objects.equals(startDate, carState.startDate) &&
                Objects.equals(finalDate, carState.finalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRented, startDate, finalDate);
    }
}
