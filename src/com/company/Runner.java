package com.company;

public class Runner extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                int next = i + 1;
                System.out.println("Runner " + i + " Берёт палочку и бежит к Runner " + next);
                sleep(1000);
            }
            System.out.println("Runner 5 берет палочку бежит к финишу" );
            sleep(1000);

            System.out.println("Runner 5 бежит к Runner 4");
            sleep(1000);
            for (int i = 4; i > 1; i--) {
                int previous = i -1;
                System.out.println("Runner " + i + " Берёт палочку и бежит к Runner " + previous);
                sleep(1000);
            }
            System.out.println("Финиш! ");
        } catch (Exception m) {
            System.out.println(m.getLocalizedMessage());
        }
    }
}
