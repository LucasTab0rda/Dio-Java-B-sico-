package edu.lucas.quartaSemana;

public class Usuario {
    
    public static void main (String[] args)  {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada ?: "+ smartTv.ligada);
        
        System.out.println("Qual canal está?: " +smartTv.canal);
        
        System.out.println("Volume atual ?: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Tv ligada?: " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.print("volume Atual: " + smartTv.volume);
        smartTv.mudarDeCanal(12);
        System.out.print("Qual o canal ? " + smartTv.canal);
    }



}
