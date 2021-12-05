package prototypepattern.java;

import org.modelmapper.ModelMapper;
import prototypepattern.after.GithubIssue;
import prototypepattern.after.GithubRepository;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jaden");
        repository.setName("GoF-디자인패턴");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("디자인패턴");

        ModelMapper mapper = new ModelMapper();
        GithubIssueData map = mapper.map(issue, GithubIssueData.class);
        System.out.println(map);
    }

}
