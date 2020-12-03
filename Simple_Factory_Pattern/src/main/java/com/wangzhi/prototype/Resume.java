package com.wangzhi.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wz157
 */
@AllArgsConstructor
@Data
public class Resume implements Cloneable{

    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setWorkExperience(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作简历：" + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = new Resume(workExperience);
        resume.age = this.age;
        resume.sex = this.sex;
        resume.name = this.name;
        return resume;
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume clone = (Resume)super.clone();
        clone.setWorkExperience(this.workExperience);
        return clone;
    }
}
