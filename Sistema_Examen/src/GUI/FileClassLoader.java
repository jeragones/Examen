package GUI;

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
 *
 * @author GeOrge
 */
//public class FileClassLoader extends ClassLoader {
//
//  private String root;
//
//  public FileClassLoader(String rootDir) {
//    if (rootDir == null) {
//          throw new IllegalArgumentException ("Null root directory");
//      }
//    root = rootDir;
//  }
//
//  //  @Override
//  public Class loadClass (/*String name*/File name, boolean resolve) 
//    throws ClassNotFoundException {
//
//    // Since all support classes of loaded class use same class loader
//    // must check subclass cache of classes for things like Object
//      String h = name.getName().substring(0, name.getName().length()-6);
//    Class c = findLoadedClass (name.getName().substring(0, name.getName().length()-6));
//
//    if (c == null) {
//      try {
//        c = findSystemClass (name.getName().substring(0, name.getName().length()-6));
//      } catch (Exception e) {
//      }
//    }
//    
//    if (c == null) {
//      // Convert class name argument to filename
//      // Convert package names into subdirectories
////      /*String*/File filename = name;//.replace ('.', File.separatorChar) + ".class";
//
//      try {
//        byte data[] = loadClassData(name);
//        String yy = name.getName();
//        c = defineClass (h/*name.getName().substring(0, name.getName().length()-6)*/, data, 0, data.length);
//        if (c == null) {
//              throw new ClassNotFoundException (name.getName().substring(0, name.getName().length()-6));
//          }
//      } catch (IOException e) {
//        throw new ClassNotFoundException ("Error reading file: " + /*filename*/name);
//      }
//    }
//    if (resolve) {
//            resolveClass (c);
//        }
//    return c;
//  }
//  
//  private byte[] loadClassData (/*Strin*/File filename) 
//      throws IOException {
//
//    // Create a file object relative to directory provided
//    File f = filename;//new File(filename);
//
//    // Get size of class file
//    int size = (int)f.length();
//
//    // Reserve space to read
//    byte buff[] = new byte[size];
//
//    // Get stream to read from
//    FileInputStream fis = new FileInputStream(f);
//    DataInputStream dis = new DataInputStream (fis);
//
//    // Read in data
//    dis.readFully (buff);
//
//    // close stream
//    dis.close();
//
//    // return data
//    return buff;
//  }
//}

public class FileClassLoader extends ClassLoader {

  private String root;

  public FileClassLoader(String rootDir) {
    if (rootDir == null)
      throw new IllegalArgumentException ("Null root directory");
    root = rootDir;
  }

  public Class loadClass (String name, boolean resolve) 
    throws ClassNotFoundException {

    // Since all support classes of loaded class use same class loader
    // must check subclass cache of classes for things like Object

    Class c = findLoadedClass (name);
    if (c == null) {
      try {
        c = findSystemClass (name);
      } catch (Exception e) {
      }
    }

    if (c == null) {
      // Convert class name argument to filename
      // Convert package names into subdirectories
      String filename = name.replace ('.', File.separatorChar) + ".class";

      try {
        byte data[] = loadClassData(name/*filename*/);
        c = defineClass (name, data, 0, data.length);
        if (c == null)
          throw new ClassNotFoundException (name);
      } catch (IOException e) {
        throw new ClassNotFoundException ("Error reading file: " + filename);
      }
    }
    if (resolve)
      resolveClass (c);
    return c;
  }
  
  
  private byte[] loadClassData (String filename) 
      throws IOException {

    // Create a file object relative to directory provided
    File f = new File (root, filename);

    // Get size of class file
    int size = (int)f.length();

    // Reserve space to read
    byte buff[] = new byte[size];

    // Get stream to read from
    FileInputStream fis = new FileInputStream(f);
    DataInputStream dis = new DataInputStream (fis);

    // Read in data
    dis.readFully (buff);

    // close stream
    dis.close();

    // return data
    return buff;
  }
}
