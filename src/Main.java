public class Main {
    public static void main(String[] args) {
        int i = 5;
        byte b = 10;
        boolean bool = true;

        if (!bool) {
            i = b;
        } else {
            System.out.println("Значение ложно");
        }
        for (int j = 5; j <= 10; j += 2) {
            System.out.println(j);
        }
        while (bool) {
            System.out.println(i);
            i++;
            if (i == 8) {
                bool = false;
            }
        }
    }
}

