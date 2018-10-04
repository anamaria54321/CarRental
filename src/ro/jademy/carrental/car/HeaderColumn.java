package ro.jademy.carrental.car;

import java.util.ArrayList;

public class HeaderColumn {
    private String columnName;
    private int length;


    public HeaderColumn(String columnName) {
        this.columnName = columnName;
        this.length = columnName.length();
    }

    public String getColumnName() {
        return columnName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > columnName.length()) {
            this.length = length;
        }
    }
}
