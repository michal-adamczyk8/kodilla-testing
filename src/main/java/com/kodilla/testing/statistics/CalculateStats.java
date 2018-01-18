package com.kodilla.testing.statistics;

public class CalculateStats {
    public double usersCount;
    public double postsCount;
    public double commentsCount;
    public double avgPostsPerUser;
    public double avgCommentsPerUser;
    public double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){


        usersCount = statistics.usersNames().size();

        postsCount = statistics.postsCount();

        commentsCount = statistics.commentsCount();

        if(usersCount == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
            avgCommentsPerPost = 0;
        }
        else{
            if(postsCount == 0){
                avgCommentsPerPost = 0;
            }
            else{
                avgPostsPerUser = postsCount/usersCount;
                avgCommentsPerUser = commentsCount/usersCount;
                avgCommentsPerPost = commentsCount/postsCount;
            }
        }

    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average number of posts per user:" + avgPostsPerUser);
        System.out.println("Average number of comments per user: " + avgCommentsPerUser);
        System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }
}
