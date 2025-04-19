public class Task2 {
    public static void main(String[] args) {
        System.out.println("задание 2");
        int n = 123;
        int w = n/100;//1
        int r = n%10;//3
        int s = n/10;//12
        int t = s%10;//2
        int result=w+r+t;
        System.out.println(result);

    }
}
