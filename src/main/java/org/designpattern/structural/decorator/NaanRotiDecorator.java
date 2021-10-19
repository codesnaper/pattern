package org.designpattern.structural.decorator;

public abstract class NaanRotiDecorator implements Roti{

    protected Roti roti;

    public NaanRotiDecorator(Roti roti) {
        this.roti = roti;
    }

    @Override
    public String make() {
        return roti.make();
    }
}
