package Web;

public class Message
{
    int userID = -1;
    int postID = -1;
    int status = -1;

    @Override
    public String toString() {
        return "Message{" +
                "userID=" + userID +
                ", postID=" + postID +
                ", status=" + status +
                '}';
    }

    public Message() {
    }

    public Message(int userID, int postID, int status) {
        this.userID = userID;
        this.postID = postID;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
