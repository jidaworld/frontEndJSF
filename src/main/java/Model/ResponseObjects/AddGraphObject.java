package Model.ResponseObjects;

import java.util.concurrent.atomic.AtomicInteger;

public class AddGraphObject {

    private int[] yValue;
    private static final AtomicInteger COUNTER = new AtomicInteger();
    private final int id;
    private String email;

    public AddGraphObject(int[] yValue, String email){
        this.id = COUNTER.getAndIncrement();
        this.yValue = yValue;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int[] getyValue() {
        return yValue;
    }

    public void setyValue(int[] yValue) {
        this.yValue = yValue;
    }
}

