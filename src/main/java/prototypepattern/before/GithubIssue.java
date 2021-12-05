package prototypepattern.before;

public class GithubIssue {
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
}
