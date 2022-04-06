package com.zakat.rabbitconsumer;

import java.io.Serializable;

public class IntDto implements Serializable {
    private Long number;

    public IntDto() {
    }

    public IntDto(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IntDto{" +
                "number=" + number +
                '}';
    }
}
