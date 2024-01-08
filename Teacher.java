public class Teacher extends Person {
    
    String subject;
    String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    public Teacher(String name, String subject, String schoolName) {
        super(name);
        this.subject = subject;
        this.schoolName = schoolName;
    }
    
    @Override
    void describeRole() {
        System.out.println(getName() + "  work at " + schoolName + " subject: " + subject);
    }

    


}
