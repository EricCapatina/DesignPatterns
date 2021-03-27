package com.company;

public class Factory {

    Prototype prototype;

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Factory(Prototype prototype) {
        this.prototype = prototype;
    }
    Prototype cloneprototype()
    {
        return (Prototype) prototype.copy();
    }
}
