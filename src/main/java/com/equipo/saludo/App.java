package com.equipo.saludo;
import java.util.logging.Logger;

public class App {
 public static String saludar(String nombre) {
 return "¡Hola, " + nombre + "!";
 }
 public static void main(String[] args) {
  Logger logger = Logger.getLogger(App.class.getName());
  if (logger.isLoggable(java.util.logging.Level.INFO)) {
   logger.info(saludar("DevOps"));
  }
 }
}