package tasks.task1.comment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Comment comment1 = new Comment(51, 4, "One", "@fvvd", "Khbjckldvkdf");
        Comment comment2 = new Comment(85, 95, "Two", "@ijhg", "Bgvbvkbhnr");
        Comment comment3 = new Comment(32, 7, "Three", "@erfg", "OIMunbbcv");
        Comment comment4 = new Comment(952, 41, "Four", "@umthyg", "L,nibdvfregr");
        Comment comment5 = new Comment(98, 10, "Five", "@gdvr", "Xcvgbhmnjmk");

        Comment[] comments = new Comment[]{
                new Comment(51, 4, "One", "@fvvd", "Khbjckldvkdf"),
                new Comment(85, 95, "Two", "@ijhg", "Bgvbvkbhnr"),
                new Comment(32, 7, "Three", "@erfg", "OIMunbbcv"),
                new Comment(952, 41, "Four", "@umthyg", "L,nibdvfregr"),
                new Comment(98, 10, "Five", "@gdvr", "Xcvgbhmnjmk")
        };

//        for (Comment comment : comments) {
//            System.out.println(comment);
//        }

        ArrayList<Comment> commentsList = new ArrayList<>();
        commentsList.add(comment1);
        commentsList.add(comment2);
        commentsList.add(comment3);
        commentsList.add(comment4);
        commentsList.add(comment5);

        for (Comment comment : commentsList) {
            System.out.println(comment);
        }
    }
}
