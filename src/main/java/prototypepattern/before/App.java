package prototypepattern.before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jaden");
        repository.setName("live-study");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("1주차 과제 : JVM 은 무엇이고...");

        String url = issue.getUrl();
        System.out.println(url);
    }
}
