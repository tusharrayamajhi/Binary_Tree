import java.io.*;
public class CreateFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\tush.txt");
        try{
            if(f.createNewFile()){
        }else{
            System.out.println("file alerady exist");
        }
        } catch(IOException i){
            System.out.println("exception handle");
        };
        if(f.exists()){
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.length());
            System.out.println(f.delete());
        }else{
            System.out.println("doestnot exists file");
        }
        
    }
}
