import java.io.File;

public class Lab111 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No input provided");
            return;
        }

        String name = args[0];
        File file = new File(name);

        if (file.isFile()) {
            System.out.println("Size of the file: " + file.length() + " bytes");
        }
        else if (file.isDirectory()) {
            System.out.println("Listing files in the directory:");

            File[] files = file.listFiles();

            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                }
            }
             else {
                System.out.println("Unable to list files in the directory.");
            }
        }
        else {
            System.out.println("The specified name does not exist or is neither a file nor a directory.");
        }
    }
}
