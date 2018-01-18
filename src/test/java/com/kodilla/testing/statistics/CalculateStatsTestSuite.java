package com.kodilla.testing.statistics;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatsTestSuite {
    private static int testCount = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("The tests have now started");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("The end of all tests.");
    }

    @Before
    public void beforeEveryTest(){
        testCount++;
        System.out.println("The test # " + testCount + " is being performed right now.");
    }

    @Test
    public void testCalculateStatsNoPost(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        userList.add("John Wayne");

        //When
        when(mockForum.usersNames()).thenReturn(userList);
        when(mockForum.postsCount()).thenReturn(0);
        when(mockForum.commentsCount()).thenReturn(0);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();
        //Then
        Assert.assertEquals(1,exterminator.usersCount,0);
        Assert.assertEquals(0, exterminator.postsCount,0);
        Assert.assertEquals(0, exterminator.commentsCount,0);
        Assert.assertEquals(0, exterminator.avgCommentsPerPost, 0);
        Assert.assertEquals(0,exterminator.avgCommentsPerUser,0);
        Assert.assertEquals(0,exterminator.avgPostsPerUser,0);
    }

    @Test
    public void testCalculateStatsPosts1000(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        for(int i=0; i<50; i++){
            userList.add("Just another user" + i);
        }

        //When
        when(mockForum.usersNames()).thenReturn(userList);
        when(mockForum.postsCount()).thenReturn(1000);
        when(mockForum.commentsCount()).thenReturn(200000);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();
        //Czy da się tak zmodyfikować metodę showStatistics(), żeby po jej odpowiednim wywołaniu zwracała intersującą nas wartość(np. avgPostsperUser), ale tylko jedną!!!
        double users = userList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = posts/users;
        double avgCommentsPerPost = comments/posts;
        double avgCommentsPerUser = comments/users;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
    @Test
    public void testCalculateStatsNoComments() {
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for(int i=0; i<50; i++){
            usersList.add("Just another user" + i);
        }
        //When
        when(mockForum.usersNames()).thenReturn(usersList);
        when(mockForum.postsCount()).thenReturn(1000);
        when(mockForum.commentsCount()).thenReturn(0);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();

        double users = usersList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = posts/users;
        double avgCommentsPerPost = comments/posts;
        double avgCommentsPerUser = comments/users;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
    @Test
    public void testCalculateStatsWhenCommentsLessThanPosts(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for(int i=0; i<100; i++){
            usersList.add("Just another user" + i);
        }
        //When
        when(mockForum.usersNames()).thenReturn(usersList);
        when(mockForum.postsCount()).thenReturn(1000);
        when(mockForum.commentsCount()).thenReturn(25);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();

        double users = usersList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = posts/users;
        double avgCommentsPerPost = comments/posts;
        double avgCommentsPerUser = comments/users;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
    @Test
    public void testCalculateStatsWhenPostsLessThanComments(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for(int i=0; i<100; i++){
            usersList.add("Just another user" + i);
        }
        //When
        when(mockForum.usersNames()).thenReturn(usersList);
        when(mockForum.postsCount()).thenReturn(1000);
        when(mockForum.commentsCount()).thenReturn(1125);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();

        double users = usersList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = posts/users;
        double avgCommentsPerPost = comments/posts;
        double avgCommentsPerUser = comments/users;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
    @Test
    public void testCalculateStatsWhenNoUsers(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();

        //When
        when(mockForum.usersNames()).thenReturn(usersList);
        when(mockForum.postsCount()).thenReturn(1000);
        when(mockForum.commentsCount()).thenReturn(1125);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();

        double users = usersList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = 0;
        double avgCommentsPerPost = 0;
        double avgCommentsPerUser = 0;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
    @Test
    public void testWhenUsersEquals100(){
        //Given
        CalculateStats exterminator = new CalculateStats();
        Statistics mockForum = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for(int i=0; i<100; i++){
            usersList.add("Just another user" + i);
        }
        //When
        when(mockForum.usersNames()).thenReturn(usersList);
        when(mockForum.postsCount()).thenReturn(1);
        when(mockForum.commentsCount()).thenReturn(1);
        exterminator.calculateAdvStatistics(mockForum);
        exterminator.showStatistics();

        double users = usersList.size();
        double posts = mockForum.postsCount();
        double comments = mockForum.commentsCount();
        double avgPostsPerUser = posts/users;
        double avgCommentsPerPost = comments/posts;
        double avgCommentsPerUser = comments/users;

        //Then
        Assert.assertEquals(users, exterminator.usersCount, 0);
        Assert.assertEquals(posts, exterminator.postsCount, 0);
        Assert.assertEquals(comments, exterminator.commentsCount, 0);
        Assert.assertEquals(avgPostsPerUser, exterminator.avgPostsPerUser,0);
        Assert.assertEquals(avgCommentsPerUser, exterminator.avgCommentsPerUser, 0);
        Assert.assertEquals(avgCommentsPerPost, exterminator.avgCommentsPerPost,0);
    }
}
