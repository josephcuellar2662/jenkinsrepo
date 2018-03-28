package reimbursementapp;

public class Event {

    private int type;
    private String description;

    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Event(int type, String description) {
        super();
        this.type = type;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
