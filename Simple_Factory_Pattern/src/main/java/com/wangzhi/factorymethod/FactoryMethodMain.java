package com.wangzhi.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        IFactory studentFactory = new UndergraduateFactory();
        LeiFeng student = studentFactory.createLeiFeng();
        student.sweep();
        student.wash();
        student.buyRice();

        // ================

        IFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        volunteer.sweep();
        volunteer.wash();
        volunteer.buyRice();
    }
}
