import java.io.*;
public class FileDemo {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        try {
            // ném file.txt vào dòng đọc InputStream
            inputStream = new FileInputStream("C:\\Users\\SangChi\\IdeaProjects\\java2\\car\\src\\file.txt");
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(inputStream != null) {
                inputStream.close();
            }
        }
    }
}
