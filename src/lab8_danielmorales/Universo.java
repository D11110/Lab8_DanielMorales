/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_danielmorales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Universo {

    private String nombre;
    private ArrayList<SerVivo> seresVivos = new ArrayList();
    private File archivo = null;

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public void iniciarUniverso(String path) {
        archivo = new File(path);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seresVivos=" + seresVivos + '}';
    }
    
    public void escribirArchivoSOBRE() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String acum = "";
        for (SerVivo sv : seresVivos) {
            try {
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                acum += sv.getNombre() + ";" + sv.getPoder() + ";" + sv.getAños() + ";" + sv.getPlanetaProcedencia() + ";" + sv.getRaza() + "\n";
                bw.write(acum);

            } catch (Exception ex) {
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String acum = "";
        for (SerVivo sv : seresVivos) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                acum += sv.getNombre() + ";" + sv.getPoder() + ";" + sv.getAños() + ";" + sv.getPlanetaProcedencia() + ";" + sv.getRaza() + "\n";
                bw.write(acum);

            } catch (Exception ex) {
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            seresVivos = new ArrayList();
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            if (archivo.exists()) {
                String lineBeingRead = "";
                try {
                    while ((lineBeingRead = br.readLine()) != null) {
                        try {
                            String parsedElement[] = lineBeingRead.split(";");
                            SerVivo sv = new SerVivo(parsedElement[0], parsedElement[1], parsedElement[2], parsedElement[3], parsedElement[4]);
                            seresVivos.add(sv);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Universo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Universo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
