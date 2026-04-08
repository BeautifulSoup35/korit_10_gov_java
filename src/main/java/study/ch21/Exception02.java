package study.ch21;

import java.io.*;

public class Exception02 {
    /**
     *
     * @param path
     * @return 텍스트 파일로 부터 불러온 모든 텍스트 리턴
     *
     */
    public static String read(String path)  {
        StringBuilder stringBuilder = new StringBuilder();

        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);

            }
        }catch (FileNotFoundException e){
            System.out.println("해당파일이 존재하지 않습니다");
        }catch (IOException e) {
            System.out.println("읽을수없는 파일입니다");
        }catch (Exception e) {
            System.out.println("기타 예외처리");
            e.printStackTrace();
        }
        return stringBuilder.toString();


    }

    public static String read2(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);

        }
        return stringBuilder.toString();


    }

    public static void main(String[] args) {
        String txt1 = read("text.txt");

        try {
            String txt2 = read2("text.txt");//예외처리 안되면 빨간줄
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다.");
        }catch (IOException e){
            System.out.println("읽기 실패");
        }

    }
}
