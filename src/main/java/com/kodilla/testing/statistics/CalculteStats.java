package com.kodilla.testing.statistics;

public class CalculteStats {
    private double usersCount;
    private double postsCount;
    private double commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        avgPostsPerUser = postsCount/usersCount;
        avgCommentsPerUser = commentsCount/usersCount;
        avgCommentsPerPost = commentsCount/postsCount;
    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user:" + avgPostsPerUser);
        System.out.println("Average number of comments per user: " + avgCommentsPerPost);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
}
