package com.ramsay.classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.getCourses();
        classroom.getCourseWorks();

    }
    public List<Course> getCourses () {
        return new ArrayList<>();
   }

    public List<Coursework> getCourseWorks () {
        return new ArrayList<>();
    }

}
