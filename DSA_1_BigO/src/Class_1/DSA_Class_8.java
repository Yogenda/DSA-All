package Class_1;

import java.util.*;

class Post {
    private String post;
    private int date;

    public Post(String post, int date) {
        this.post = post;
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Post{" +
               "post='" + post + '\'' +
               ", date=" + date +
               '}';
    }
}

public class DSA_Class_8 {
	
	public static void main(String[] args) {
		List<Post> array2 = new ArrayList<>();
        array2.add(new Post("hi", 2021));
        array2.add(new Post("my", 2000));
        array2.add(new Post("teddy", 2003));

        // Sort the array2 based on the date property in descending order
        Collections.sort(array2, new Comparator<Post>() {
            public int compare(Post a, Post b) {
                return a.getDate() - b.getDate();
            }
        });

        // Print the sorted array2
        System.out.println(array2);
	}

}