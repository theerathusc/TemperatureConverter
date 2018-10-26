package com.example.admin.temperatureconverter;

public class Convert {
    private int number;

    public Convert(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int convert_c_to_f() {
        return (int) (number * 1.8) + 32;
    }

    public double convert_f_to_c() {
        return (number - 32) / 1.8;
    }
}
