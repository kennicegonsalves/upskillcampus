import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CMSBlog {
    public static void savePost(String title, String content) {
        try {
            FileWriter writer = new FileWriter("blog_data.txt", true);
            writer.write("Title: " + title + "\n");
            writer.write("Content:\n" + content + "\n");
            writer.write("------------------------------------\n");
            writer.close();
            System.out.println("Blog saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving blog: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("---- Blog Post Publisher ----");
        System.out.print("Enter blog title: ");
        String title = scanner.nextLine();
    
        System.out.print("Enter blog content (in HTML): ");
        String content = scanner.nextLine();
    
        savePost(title, content);
    
        scanner.close();
    }
}    