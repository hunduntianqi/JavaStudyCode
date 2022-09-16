package com.$4_FaceObject.FaceDemo.$2_Inhert.$4_this;

public class Student {
    private String name;
    private String schoolName = "河南职业技术学院";
    
    public Student() {
    }
    
    public Student (String name) {
        this(name, "河南职业技术学院");
        
    }
    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
