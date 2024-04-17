public class SchoolDemographics {
    private String school;
    private double students;
    private double black;
    private double hispanic;
    private double ELLs;
    private double lunchfees;
    private double disadvantaged;

    public SchoolDemographics(String school, double students, double black, double hispanic, double ELLs, double lunchfees, double disadvantaged){
        this.school = school;
        this.students = students;
        this.black = black;
        this.hispanic = hispanic;
        this.ELLs = ELLs;
        this.lunchfees = lunchfees;
        
    }
    public SchoolDemographics(){
        this.school = null;
        this.students = 0;
        this.black = 0;
        this.hispanic = 0;
        this.ELLs = 0;
        this.lunchfees = 0;
        this.disadvantaged = 0;

    }
    

    public String getSchool(){
        return this.school;
    }
    public double getStudents(){
        return this.students;
    }
    public double getBlacks(){
        return this.black;
    }
    public double getHispanics(){
        return this.hispanic;
    }
    public double getELLs(){
        return this.ELLs;
    }
    public double getLunchfees(){
        return this.lunchfees;
    }

    public double getDisadvantaged(){
        return this.disadvantaged;
    }

    
    public void setSchool(String school){
        this.school = school;
    }
    public void setStudents(double students){
        this.students = students;
    }
    public void setBlacks(double black){
        this.black = black;
    }
    public void setHispanics(double hispanic){
        this.hispanic = hispanic;
    }
    public void setELLs(double ELLs){
        this.ELLs = ELLs;
    }
    public void setLunchfees(double lunchfees){
        this.lunchfees = lunchfees;
    }
    public void setDisadvantaged(double disadvantaged){
        this.disadvantaged = disadvantaged;
    }
    

}
