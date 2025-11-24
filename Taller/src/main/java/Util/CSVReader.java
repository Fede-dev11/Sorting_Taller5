package Util;

import dominio.Registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CSVReader {

    // 1) citas_100.csv y citas_100_casi_ordenadas.csv
    public static Registro[] leerCitas(String ruta) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        ArrayList<Registro> lista = new ArrayList<>();
        br.readLine(); // encabezado

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] p = linea.split(";");

            LocalDateTime fecha = LocalDateTime.parse(p[2]);

            lista.add(new Registro(
                    p[0],
                    p[1],
                    fecha,
                    0,
                    0
            ));
        }
        br.close();
        return lista.toArray(new Registro[0]);
    }
    public static Registro[] leerCitasCasiOrd(String ruta) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        ArrayList<Registro> lista = new ArrayList<>();
        br.readLine();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] p = linea.split(";");

            LocalDateTime fecha = LocalDateTime.parse(p[2]);

            lista.add(new Registro(
                    p[0],
                    p[1],
                    fecha,
                    0,
                    0
            ));
        }
        br.close();
        return lista.toArray(new Registro[0]);
    }

    // 2) pacientes_500.csv
    public static Registro[] leerPacientes(String ruta) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        ArrayList<Registro> lista = new ArrayList<>();
        br.readLine();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] p = linea.split(";");

            lista.add(new Registro(
                    p[0],
                    p[1],
                    null,                 // no hay fecha en este dataset
                    Integer.parseInt(p[2]),
                    0
            ));
        }
        br.close();
        return lista.toArray(new Registro[0]);
    }

    // 3) inventario
    public static Registro[] leerInventario(String ruta) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        ArrayList<Registro> lista = new ArrayList<>();
        br.readLine();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] p = linea.split(";");

            lista.add(new Registro(
                    p[0],
                    p[1],
                    null,
                    0,
                    Integer.parseInt(p[2])
            ));
        }
        br.close();
        return lista.toArray(new Registro[0]);
    }
}
