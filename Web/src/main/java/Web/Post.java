package Web;

public class Post {
    int postID = -1;
    String title = null;
    String content = null;
    int userID = -1;
    String time = null;
    int type = -1;
    String link = null;
    int likes = -1;
    int dislikes = -1;
    int status = -1;
    int anon = -1;// 是否匿名

    public Post() {
    }

    public Post(int postID, String title, String content, int userID, String time, int type, String link, int likes, int dislikes, int status, int anon) {
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.userID = userID;
        this.time = time;
        this.type = type;
        this.link = link;
        this.likes = likes;
        this.dislikes = dislikes;
        this.status = status;
        this.anon = anon;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postID=" + postID +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userID=" + userID +
                ", time='" + time + '\'' +
                ", type=" + type +
                ", link='" + link + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", status=" + status +
                ", anon=" + anon +
                '}';
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAnon() {
        return anon;
    }

    public void setAnon(int anon) {
        this.anon = anon;
    }
}
