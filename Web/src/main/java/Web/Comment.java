package Web;

public class Comment
{
    int fatherID = -1;
    int childID = -1;

    public Comment() {
    }

    public Comment(int fatherID, int childID) {
        this.fatherID = fatherID;
        this.childID = childID;
    }

    @Override
    public String  toString() {
        return "Box{" +
                "fatherID=" + fatherID +
                ", childID=" + childID +
                '}';
    }

    public int getUserID() {
        return fatherID;
    }

    public void setUserID(int fatherID) {
        this.fatherID = fatherID;
    }

    public int getPostID() {
        return childID;
    }

    public void setPostID(int childID) {
        this.childID = childID;
    }
}
