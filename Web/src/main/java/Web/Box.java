package Web;

public class Box
{
    int userID = -1;
    int postID = -1;

    public Box() {
    }

    public Box(int userID, int postID) {
        this.userID = userID;
        this.postID = postID;
    }

    @Override
    public String  toString() {
        return "Box{" +
                "userID=" + userID +
                ", postID=" + postID +
                '}';
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
}
