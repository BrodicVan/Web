package Web;

public class UserDetail {
    int userID = -1;
    String birthday = null;
    String phone = null;
    String QQ = null;
    String WeChat = null;
    String selfIntro = null;

    public UserDetail() {
    }

    public UserDetail(int userID, String birthday, String phone, String QQ, String weChat, String selfIntro) {
        this.userID = userID;
        this.birthday = birthday;
        this.phone = phone;
        this.QQ = QQ;
        WeChat = weChat;
        this.selfIntro = selfIntro;
    }

    @Override
    public String toString() {
        return "UserDetial{" +
                "userID=" + userID +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", QQ='" + QQ + '\'' +
                ", WeChat='" + WeChat + '\'' +
                ", selfIntro='" + selfIntro + '\'' +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWeChat() {
        return WeChat;
    }

    public void setWeChat(String weChat) {
        WeChat = weChat;
    }

    public String getSelfIntro() {
        return selfIntro;
    }

    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }
}
