package myweb.entity;

public class Studen {
    private String username;
    private String rollNumber;
    private String fullName;
    private String email;
    private String password;
    private int role;
    private int status;

    public Studen() {
    }

    public Studen(String username, String rollNumber, String fullName, String email, String password, int role, int status) {
        this.username = username;
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public enum Status{
        ACTIVE(1), DEACTIVE(0), DELETTED(-1);
        private int value;

        Status(int value) {
            this.value = value;
        }

        public static Status findByValue(int value){
            for (Status s : Status.values()){
                if(s.value == value){
                    return s;
                }
            }
            return Status.DEACTIVE;
        }
    }

    public enum Role{
        USER(1), ADMIN(2), STUDENT(3);
        private int value;

        Role(int value) {
            this.value = value;
        }

        public static Role findByValue (int value){
            for (Role r: Role.values()){
                if (r.value == value){
                    return r;
                }
            }
            return Role.USER;
        }
    }
}
