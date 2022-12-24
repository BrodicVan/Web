package Web;

public class PostTag
{
    int postID = -1;
    int tagID = -1;

    public PostTag() {
    }

    public PostTag(int postID, int tagID) {
        this.postID = postID;
        this.tagID = tagID;
    }

    @Override
    public String  toString() {
        return "Box{" +
                "postID=" + postID +
                ", tagID=" + tagID +
                '}';
    }

    public int getUserID() {
        return postID;
    }

    public void setUserID(int postID) {
        this.postID = postID;
    }

    public int getPostID() {
        return tagID;
    }

    public void setPostID(int tagID) {
        this.tagID = tagID;
    }
}
