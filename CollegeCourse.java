class CollegeCourse {
    protected String department;
    protected int code;
    protected int credit;
    protected double fee;

    public CollegeCourse(String department, int code, int credit) {
        this.department = department;
        this.code = code;
        this.credit = credit;
    }

    public double calculator() {
        fee = 350 * credit;
        return fee;
    }

    public String display() {
        return "Your department is " + department + " with code " + code + " and credit " + credit + ". Total fee is " + calculator();
    }
}

class LabCourse extends CollegeCourse {
    public LabCourse(String department, int code, int credit) {
        super(department, code, credit);
    }

    
    public double calculator() {
        return super.calculator() + 100;
    }

    
    public String display() {
        return "Your department is " + department + " with code " + code + " and credit " + credit + ". Total fee is " + calculator();
    }
}


