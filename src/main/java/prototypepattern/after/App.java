package prototypepattern.after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jaden");
        repository.setName("live-study");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("1주차 과제 : JVM 은 무엇이고...");


        GithubIssue clone = (GithubIssue) issue.clone();
        repository.setName("reset");
        repository.setUser("reset");
        System.out.println(issue.getUrl());
        System.out.println(clone.getUrl());

        System.out.println(clone != issue);
        System.out.println(clone.equals(issue));
        System.out.println(clone.getClass() == issue.getClass());
    }
}
