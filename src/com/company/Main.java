package com.company;

public class Main {

    public static void main(String[] args) {
            Persona persona = new Persona();
            persona.setEdad(15);
            persona.setNombre("alexis");
            persona.setTelefono(603721541);


            System.out.println(persona.getEdad());
            System.out.println(persona.nombre);
            System.out.println(persona.getTelefono());
        }
    }

    class Persona{
        private int edad;
        String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }

    }