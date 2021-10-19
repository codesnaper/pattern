package org.designpattern.structural.decorator;

public class GralicNaanRotiDecorato extends NaanRotiDecorator{
    public GralicNaanRotiDecorato(Roti roti) {
        super(roti);
    }

    @Override
    public String make() {
        return String.format("%s %s",addGralic(),roti.make());
    }

    public String addGralic(){
        return "Garlic";
    }
}
