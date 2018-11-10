package lesson.fortest;

public class TestBean {

    private String content;

    public TestBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
