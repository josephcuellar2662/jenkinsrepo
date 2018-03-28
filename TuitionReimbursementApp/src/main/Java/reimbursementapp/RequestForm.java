package reimbursementapp;

public class RequestForm {
    private int form_id;
    private int employee_id;
    private String date;
    private String streetname;
    private String state;
    private String city;
    private int zip;
    private double price;
    private String wrj;
    private String gradingFormat;
    private String event;
    private String ad_by_supervisor;
    private String ad_by_head;
    private String ad_by_benco;
    private String grade;
    private String firstname;
    private String lastname;

    public RequestForm() {

    }

    public RequestForm(int employee_id, String date, String streetname, String state, String city, int zip, double price, String wrj, String gradingFormat, String event, String ad_by_supervisor, String ad_by_head, String ad_by_benco) {
        this.employee_id = employee_id;
        this.date = date;
        this.streetname = streetname;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.price = price;
        this.wrj = wrj;
        this.gradingFormat = gradingFormat;
        this.event = event;
        this.ad_by_supervisor = ad_by_supervisor;
        this.ad_by_head = ad_by_head;
        this.ad_by_benco = ad_by_benco;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWrj() {
        return wrj;
    }

    public void setWrj(String wrj) {
        this.wrj = wrj;
    }

    public String getGradingFormat() {
        return gradingFormat;
    }

    public void setGradingFormat(String gradingFormat) {
        this.gradingFormat = gradingFormat;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAd_by_supervisor() {
        return ad_by_supervisor;
    }

    public void setAd_by_supervisor(String ad_by_supervisor) {
        this.ad_by_supervisor = ad_by_supervisor;
    }

    public String getAd_by_head() {
        return ad_by_head;
    }

    public void setAd_by_head(String ad_by_head) {
        this.ad_by_head = ad_by_head;
    }

    public String getAd_by_benco() {
        return ad_by_benco;
    }

    public void setAd_by_benco(String ad_by_benco) {
        this.ad_by_benco = ad_by_benco;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    @Override
    public String toString() {
        return "RequestForm{" +
                "employee_id=" + employee_id +
                ", date='" + date + '\'' +
                ", streetname='" + streetname + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", price=" + price +
                ", wrj='" + wrj + '\'' +
                ", gradingFormat='" + gradingFormat + '\'' +
                ", event='" + event + '\'' +
                ", ad_by_supervisor='" + ad_by_supervisor + '\'' +
                ", ad_by_head='" + ad_by_head + '\'' +
                ", ad_by_benco='" + ad_by_benco + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}