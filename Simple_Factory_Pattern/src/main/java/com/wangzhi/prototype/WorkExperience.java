package com.wangzhi.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 工作经历类
 * @author wz157
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience implements Cloneable {

    private String workDate;

    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
