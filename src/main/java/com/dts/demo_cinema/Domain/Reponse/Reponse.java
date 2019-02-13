package com.dts.demo_cinema.Domain.Reponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Reponse {
    private int rc;
    private String rd;

    public Reponse() {
        this.rc = 0;
        this.rd = "Ok";
    }
    public void server_err(){
        this.rc = -1;
        this.rd = "Server error";
    }
}
