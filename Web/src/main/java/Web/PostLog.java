package Web;

public class PostLog {
    int postLogID = -1;
    int userID = -1;
    int postID = -1;
    String time = null;
    int type = -1;
    String message = null;

    public PostLog() {
    }

    public PostLog(int postLogID, int userID, int postID, String time, int type, String message) {
        this.postLogID = postLogID;
        this.userID = userID;
        this.postID = postID;
        this.time = time;
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "PostLog{" +
                "postLogID=" + postLogID +
                ", userID=" + userID +
                ", postID=" + postID +
                ", time='" + time + '\'' +
                ", type=" + type +
                ", message='" + message + '\'' +
                '}';
    }

    public int getPostLogID() {
        return postLogID;
    }

    public void setPostLogID(int postLogID) {
        this.postLogID = postLogID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
