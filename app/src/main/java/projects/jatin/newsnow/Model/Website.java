package projects.jatin.newsnow.Model;

import java.util.List;

/**
 * Created by Jateen on 07-10-2017.
 */

public class Website {

    public String status;
    private List<Source> sources;

    public Website() {
    }

    public Website(String status, List<Source> sources) {
        this.status = status;
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }
}
