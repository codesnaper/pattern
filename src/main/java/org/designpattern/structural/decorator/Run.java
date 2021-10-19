package org.designpattern.structural.decorator;

public class Run {
    public static void main(String[] args){
        Roti roti = new GralicNaanRotiDecorato(new ButterNaanRotiDecorator(new Naan()));
        System.out.println(roti.make());

        roti = new ButterNaanRotiDecorator(new Naan());
        System.out.println(roti.make());
    }

}
