package Myclass;

public class textMachinePrint {
    public static void textPrint(String text, int delay) {
        for (char ch : text.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delay); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                e.printStackTrace();
            }
        }
        System.out.flush();
    }
}
