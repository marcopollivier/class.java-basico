package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como manioular LocalTime
 */
public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:55:37.421

    }
}
