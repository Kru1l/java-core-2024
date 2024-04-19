package tasks.task1.post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(11, 5, "The Corner", "Lkfskjfnckb fbirbg bcence");
        Post post2 = new Post(64, 7, "The Son", "Bdbsfr rfr fe bfebf eurf");
        Post post3 = new Post(47, 35, "The Moon", "Fbev bfe bfebbfeb bef");
        Post post4 = new Post(52, 85, "The Earth", "Pndjew wedvg jfevbnetg wfef w");
        Post post5 = new Post(38, 35, "The Sky", "Moierfb f4w vergf q fer ef ");


        Post[] posts = new Post[5];
        posts[0] = post1;
        posts[1] = post2;
        posts[2] = post3;
        posts[3] = post4;
        posts[4] = post5;

        ArrayList<Post> postsList = new ArrayList<>();
        postsList.add(post1);
        postsList.add(post2);
        postsList.add(post3);
        postsList.add(post4);
        postsList.add(post5);

//        for (Post post : posts) {
//            System.out.println(post);
//        }

        for (Post post : postsList) {
            System.out.println(post);
        }
    }
}
