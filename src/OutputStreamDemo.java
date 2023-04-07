import java.io.*;
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("C:\\Users\\SangChi\\IdeaProjects\\java2\\car\\src\\file.txt");
        // dữ liệu ghi
        byte b[] = {65, 70, 89, 68};
        // thực hiện ghi
        outputStream.write(b);
        // xả sạch dòng
        outputStream.flush();
        //ghi 1 chuỗi liên tục
        for (int i = 65; i < 90; i++){
            outputStream.write(i);
        }
        outputStream.flush();
        outputStream.close();
    }
}
