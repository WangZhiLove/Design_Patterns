package com.wangzhi.prototype;

public class ProtorypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("王智");
        resume.setWorkExperience("2018-2019", "XXXXXXXXX");
        resume.setPersonInfo("男", "26");
        resume.display();

        Resume resume1 = (Resume) resume.clone();
        resume1.setWorkExperience("2019-2020", "xxxxxxxxxxxxx");
        resume1.display();
    }
}
