/*Lab 2
 Q2. Wap to print all ascii characters from 0 to 127.*/

class AsciiChar {
    public static void main(String args[]) {
        System.out.println("ASCII in Characters from 0 to 127:");
        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII Value: " + i + " ==>> Character: " + (char) i);
        }
    }
}
