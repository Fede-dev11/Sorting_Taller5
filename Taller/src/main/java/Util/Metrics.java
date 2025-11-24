package Util;

import dominio.Registro;

import java.util.Comparator;

public class Metrics {
    public long comparisons = 0;
    public long swaps = 0;
    public long timeNs = 0;

    public void reset() {
        comparisons = 0;
        swaps = 0;
        timeNs = 0;
    }


    public static class comparaciones {
        public static Comparator<Registro> porFecha() {
            return (a, b) -> {
                if (a.fechaHora == null && b.fechaHora == null) return 0;
                if (a.fechaHora == null) return 1;
                if (b.fechaHora == null) return -1;
                return a.fechaHora.compareTo(b.fechaHora);
            };
        }

        public static Comparator<Registro> porApellido() {
            return (a, b) -> a.apellido.compareToIgnoreCase(b.apellido);
        }

        public static Comparator<Registro> porStock() {
            return (a, b) -> Integer.compare(a.stock, b.stock);
        }
    }




}
