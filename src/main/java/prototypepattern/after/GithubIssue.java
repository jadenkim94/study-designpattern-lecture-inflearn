package prototypepattern.after;

import java.util.Objects;

public class GithubIssue implements Cloneable {
    private int id;
    private String title;
    private String url;
    private GithubRepository repository;

    public GithubIssue(GithubRepository repository){
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public void setRepository(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return "https://github.com/"+repository.getUser()+repository.getName()+"issues"+id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setName(this.repository.getName());
        repository.setUser(this.repository.getUser());

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(this.id);
        issue.setTitle(this.title);

        return issue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(url, that.url)
            && Objects.equals(repository, that.repository);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, repository);
    }
}
