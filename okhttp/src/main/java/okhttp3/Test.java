package okhttp3;

/**
 * @author TuFei
 * @date 18-9-23.
 */
public class Test {
    public static void main(String[] args) {
        byte b = 127;
        int value = b;
        System.out.println(b);
        System.out.println(value);

        byte[] a = new byte[10];
        a[0]= -1;
        System.out.println(a[0]);
        int c = a[0]&0xff;
        System.out.println(c);

        byte d = -127;
        int e = d;
        System.out.println(d);
    }
}
