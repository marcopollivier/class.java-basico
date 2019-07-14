package aulas.javaDate;

import java.util.Date;

public class Exemplo002 {

    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1513124807691

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 14:23:42 BRT 2019

    }

}
