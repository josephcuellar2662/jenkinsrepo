package reimbursementapp;

public class GradingFormat {
    private String name;

    public GradingFormat(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade(){
        if(this.name.equals("letter")){

        }
        return 0;
    }
}
