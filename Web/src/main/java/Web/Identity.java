package Web;

public class Identity {
    int userID = -1;
    String studentID = null;
    String name = null;

    @Override
    public String toString() {
        return "Identity{" +
                "userID=" + userID +
                ", studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Identity() {
    }

    public Identity(int userID, String studentID, String name) {
        this.userID = userID;
        this.studentID = studentID;
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
