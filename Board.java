//a계정 추가한 주석
public class Board {
private int id;
private String title;
private String author;
// getter/setter 생략
}
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
