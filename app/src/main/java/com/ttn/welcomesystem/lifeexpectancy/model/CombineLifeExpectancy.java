package com.ttn.welcomesystem.lifeexpectancy.model;

public class CombineLifeExpectancy {
    public LifeExpectancy lifeExpectancy;
    public RemainingLifeExpectancy remainingLifeExpectancy;

    public CombineLifeExpectancy(LifeExpectancy lifeExpectancy, RemainingLifeExpectancy remainingLifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
        this.remainingLifeExpectancy = remainingLifeExpectancy;
    }
}
