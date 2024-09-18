////class H0918_1 {
////    public static void main(String[] args) {
////        Tv t;
////        t = new Tv();
////        t.channel = 7;
////        t.channelDown();
////        System.out.println("현재 채널은 " + t.channel + " 입니다.");
////    }
////}
//
//class Tv {
//    String color;
//    boolean power;
//    int channel;
//
//    void power() { power = !power; }
//    void channelUp() { ++channel; }
//    void channelDown() { --channel; }
//}
//
//class H0918_2 {
//    public static void main(String[] args) {
//        Tv t1 = new Tv();
//        Tv t2 = new Tv();
//        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
//        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
//
//        t1.channel = 7;
//        System.out.println("t1의 channel값을 7로 변경하였씁니다.");
//
//        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
//        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
//    }
//}
//
//public final class String implements java.io.Serializable, Comparable {
//    private char[] value;
//
//    public String replace(char oldChar, char newChar) {
//        char[] val = value;
//    }
//}

//public class Time {
//    private int hour;
//    private int minute;
//    private float second;
//
//    public void setHour(int h) {
//        if (h < 0 || h > 23) return;
//        hour = h;
//    }
//}

//class Card {
//    String kind;
//    int number;
//
//    static int width = 100;
//    static int height = 250;
//}
//
//class H0918_3 {
//    public static void main(String[] args) {
//        System.out.println("Card.width = " + Card.width);
//        System.out.println("Card.height = " + Card.height);
//
//        Card c1 = new Card();
//        c1.kind = "Heart";
//        c1.number = 7;
//
//        Card c2 = new Card();
//        c2.kind = "Spade";
//        c2.number = 4;
//
//        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
//        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
//        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
//
//        c1.width = 50;
//        c1.height = 80;
//
//        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
//        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
//    }
//}

//class MyMath {
//    long add(long a, long b) {
//        long result = a + b;
//        return result;
//        // 위의 두 줄을 return a + b; 로 표현할 수 있음
//    }
//    long subtract(long a, long b) { return a - b; }
//    long multiply(long a, long b) { return a * b; }
//    double divide(double a, double b) { return a / b; }
//}
//
//class H0918_4 {
//    public static void main(String[] args) {
//        MyMath mm = new MyMath();
//        long result1 = mm.add(5L, 3L);
//        long result2 = mm.subtract(5L, 3L);
//        long result3 = mm.multiply(5L, 3L);
//        double result4 = mm.divide(5L, 3L);
//
//        System.out.println("add(5L, 3L) = " + result1);
//        System.out.println("subtract(5L, 3L) = " + result2);
//        System.out.println("multiply(5L, 3L) = " + result3);
//        System.out.println("divide(5L, 3L) = " + result4);
//    }
//}

//class Data { int x; }
//class H0918_5 {
//    public static void main(String[] args) {
//        Data d = new Data();
//        d.x = 10;
//        System.out.println("main() : x = " + d.x);
//
//        change(d.x);
//        System.out.println("After change(d.x)");
//        System.out.println("main() : x = " + d.x);
//    }
//    static void change(int x) {
          // 원본이 아닌 복사본의 값만 변경되어 원본에는 영향을 미치지 못함
//        x = 1000;
//        System.out.println("change() : x = " + x);
//    }
//}

//class Data2 { int x; }
//class H0918_6 {
//    public static void main(String[] args) {
//        Data2 d = new Data2();
//        d.x = 10;
//        System.out.println("main() : x = " + d.x);
//
//        change(d);
//        System.out.println("After change(d)");
//        System.out.println("main() : x = " + d.x);
//    }
//    static void change(Data2 d) {
          // 값이 저장된 주소 자체를 change에 넘겨주었기때문에 원본의 x값도 변경됨
//        d.x = 1000;
//        System.out.println("change() : x = " + d.x);
//    }
//}

class Data3 { int x; }
class H0918_7 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x =" + d.x);
        System.out.println("d2.x =" + d2.x);
    }
    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        // 새로운 객체 tmp를 생성한다.
        tmp.x = d.x;
        // d.x의 값을 tmp.x의 값에 복사한다.
        return tmp;
        // 복사한 객체의 주소를 반환한다.
    }
}