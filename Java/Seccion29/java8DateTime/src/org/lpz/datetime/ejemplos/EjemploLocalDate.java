package org.lpz.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    static void main() {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual: " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());

        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println("anio: " + fechaActual.getYear());
        System.out.println("Dia del anio: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2026, 1, 19);
        System.out.println("Fecha Actual: " + fechaActual);

        fechaActual = LocalDate.of(2026, Month.JANUARY, 19);
        System.out.println("Fecha Actual: " + fechaActual);

        fechaActual = LocalDate.parse("2020-01-19");
        System.out.println("Fecha Actual: " + fechaActual);

        LocalDate diaDeManana = LocalDate.now().plusDays(1);
        System.out.println("Dia de mañana: " + diaDeManana);

        //LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Mes anterior y mismo dia: " + mesAnteriorMismoDia);

        DayOfWeek lunes = LocalDate.parse("2026-01-19").getDayOfWeek();
        System.out.println("Lunes: " + lunes);

        int dia = LocalDate.of(2026, 01, 19).getDayOfMonth();
        System.out.println("dia: " + dia);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("Es bisiesto? " + esBisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2026-01-18"));
        System.out.println("Antes: " + esAntes);

        boolean esDespues = LocalDate.now().isAfter(LocalDate.parse("2020-01-20"));
        System.out.println("Despues: " + esDespues);


    }
}
