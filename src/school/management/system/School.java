package school.management.system;

/*
    many teachers,many students
    implements teachers and student using an Arraylist
 */

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpend;

    /*
    new school object is created
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;

    }

    /*
    @return the list of teacher
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /*
    adds a teacher to the school
    @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /*
    @return th e list of student
     */

    public List<Student> getStudents() {
        return students;
    }

    /*
    adds a student to the school
    @param student student to be added
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /*
    @return the total money earned by the money
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /*
    add the total money earned by the school
    @param MoneyEarned money that is supposed to be added
     */

    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned = MoneyEarned;
    }

    /*
    @return the total money spent
     */

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    /*

     */

    public void updateTotalMoneySpend(int totalMoneySpend) {
        this.totalMoneySpend = totalMoneySpend;
    }
}
