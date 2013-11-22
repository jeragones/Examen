package Cargar_Clase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Por medio de esta clase se logran cargar dinamicamente las clases externas al proyecto
 * @author Daniel Berrocal
 * @author Jorge Rojas
 */
 
public class FileClassLoader extends ClassLoader {

    private String root;

    /**
     * Constructor de la clase
     * @param rootDir Direccion fisica del archivo a cargar.
     */
    public FileClassLoader(String rootDir) {
        if (rootDir == null) {
            throw new IllegalArgumentException("Null root directory");
        }
        root = rootDir;
    }

    /**
     * Metodo que permite cargar el archivo .class
     * @param name Archivo que se recibe.
     * @param resolve Bandera
     * @return Retorn la clase cargada.
     * @throws ClassNotFoundException 
     */
    public Class loadClass1(File name, boolean resolve)
            throws ClassNotFoundException {
        Class c = findLoadedClass("Preguntas." + name.getName().substring(0,
                name.getName().length() - 6));
        if (c == null) {
            try {
                c = findSystemClass(name.getName().substring(0, name.getName().length() - 6));
            } catch (Exception e) {
            }
        }
        if (c == null) {
 // Convert class name argument to filename 
            // Convert package names into subdirectories 
 /*String*/
            File filename = name;//.replace ('.', File.separatorChar) + ".class"; 
            try {
                byte data[] = loadClassData(filename);
                //c = defineClass(root, null, null);

                c = defineClass("Preguntas." + name.getName().substring(0, name.getName().length() - 6), data,
                        0,
                        data.length);
                if (c == null) {
                    throw new ClassNotFoundException(name.getName().substring(0,
                            name.getName().length() - 6));
                }
            } catch (IOException e) {
                throw new ClassNotFoundException("Error reading file: " + filename);
            }
        }
        if (resolve) {
            resolveClass(c);
        }
        return c;
    }

    /**
     * 
     * @param filename Archivo que se recibe
     * @return Retorna un arreglo de bytes con la informacion correspondiente a la clase cargada
     * @throws IOException 
     */
    private byte[] loadClassData(/*Strin*/File filename)
            throws IOException {
        // Create a file object relative to directory provided 
        File f = filename;//new File(filename); 
        // Get size of class file 
        int size = (int) f.length();
        // Reserve space to read 
        byte buff[] = new byte[size];
        // Get stream to read from 
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        // Read in data 
        dis.readFully(buff);
        // close stream 
        dis.close();
        // return data 
        return buff;
    }
}
