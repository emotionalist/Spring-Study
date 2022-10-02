package CtoySeason2Server.domian;

public class Comment {
    private String password; //비밀번호
    private Long NUM; // 댓글 번호
    private String name; // 이름
    private String CommentTime; // 달린 시간
    private String CommentText; // 댓글 내용

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getNUM() {
        return NUM;
    }

    public void setNUM(Long NUM) {
        this.NUM = NUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommentTime() {
        return CommentTime;
    }

    public void setCommentTime(String commentTime) {
        CommentTime = commentTime;
    }

    public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String commentText) {
        CommentText = commentText;
    }
}

