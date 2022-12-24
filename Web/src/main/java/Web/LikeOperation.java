package Web;

public class LikeOperation
{
    int userID = -1;
    int postID = -1;
    int operation = -1;

    public LikeOperation() {
    }

    public LikeOperation(int userID, int postID, int operation) {
        this.userID = userID;
        this.postID = postID;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "LikeOperation{" +
                "userID=" + userID +
                ", postID=" + postID +
                ", operation=" + operation +
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

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }
}
