package com.company;

public class Prototype implements Cloner {
    private int id;
    private String name;
    private String source;

    public Prototype(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Object copy() {
        Prototype copy = new Prototype(id, name, source);
        return copy;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
