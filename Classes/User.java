public class User{
    int userId;
    String name;
    Date dateOfBirth;
    Long mobNum;
    String emailId;
    String gender;


    public User(int userId, String name, Date dateOfBirth, Long mobNum, String emailId, String gender) {
        this.userId = userId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mobNum = mobNum;
        this.emailId = emailId;
        this.gender = gender;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getMobNum() {
        return this.mobNum;
    }

    public void setMobNum(Long mobNum) {
        this.mobNum = mobNum;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}