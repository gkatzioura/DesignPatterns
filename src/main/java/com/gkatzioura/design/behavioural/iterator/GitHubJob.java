package com.gkatzioura.design.behavioural.iterator;

import java.util.UUID;

public class GitHubJob {

    private final UUID id;
    private final String company;
    private final String title;

    public GitHubJob(UUID id, String company, String title) {
        this.id = id;
        this.company = company;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }
}
