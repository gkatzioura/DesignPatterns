package com.gkatzioura.design.behavioural.iterator;

public class IteratorExample {

    public static void main(String[] args) throws Exception {
        GitHubJobsRepository gitHubJobsRepository = new GitHubJobsRepository();

        Iterator<GitHubJob> gitHubJobIterator = gitHubJobsRepository.iterator();

        while (gitHubJobIterator.hasNext()) {
            GitHubJob gitHubJob = gitHubJobIterator.next();
            System.out.println(String.format(" id: %s title: %s company: %s",gitHubJob.getId(),gitHubJob.getTitle(),gitHubJob.getCompany()));
        }
    }

}
