package aulas.trabalhandoComDatas.javaDate;

import java.time.Instant;
import java.util.Date;

/**
 *  Exemplo de conversão entre Date e Instant
 */
public class Exemplo005 {
    public static void main(String[] args) {

        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
    }
}
