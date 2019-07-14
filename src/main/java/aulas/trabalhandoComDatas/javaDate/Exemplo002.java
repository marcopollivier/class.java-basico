package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

/**
 *  Exemplo de utilização do construtor com passagem de parametro em milisegundos
 */
public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1563127311564

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019

    }
}
