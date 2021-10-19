package org.designpattern.structural.decorator;

public class ButterNaanRotiDecorator extends NaanRotiDecorator{

    public ButterNaanRotiDecorator(Roti roti) {
        super(roti);
    }

    @Override
    public String make() {
        return String.format("%s %s",addButter(),roti.make());
    }

    public String addButter(){
        return "Butter";
    }
}
