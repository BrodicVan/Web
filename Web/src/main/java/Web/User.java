package Web;

public class User
{
    int userID = -1;
    String userName = null;
    String password = null;
    int userType = -1;
    String email = null;
    int status = -1;
    String head = null;

    public User() {
    }

    public User(int userID, String userName, String password, int userType, String email, int status, String head) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.email = email;
        this.status = status;
        this.head = head;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", head='" + head + '\'' +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
