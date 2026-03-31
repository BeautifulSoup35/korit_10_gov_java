package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        //100명의 학생정보 저장
        //이름, 나이, 학년

        class 학생{
            String 이름;
            int 나이;

            void printInfo() {
                System.out.println("name: " + 이름);
                System.out.println("age: " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한 살 더 먹기");
                나이++;
            }
        }
        학생 학생1 = new 학생();
        학생1.이름 = "권민주";
        학생1.나이 = 22;
        학생1.printInfo();
        학생1.increaseAge();
        학생1.printInfo();
        학생1.printInfo();

        학생 학생2 = new 학생();
        학생2.이름 = "권민중";
        학생2.나이 = 23;



    }

}
