package com.curso;

import com.curso.Animales.Aves.Pavo;
import com.curso.Animales.Mamiferos.Buey;
import com.curso.Animales.Mamiferos.Caballo;
import com.curso.Animales.Aves.Gallina;
import com.curso.instalaciones.Establo;
import com.curso.instalaciones.Gallinero;
import com.curso.instalaciones.Matadero;

public class Main {

    public static void main(String[] args) {

        Establo establo = new Establo();
        Matadero matadero = new Matadero();
        Gallinero gallinero = new Gallinero();

        Caballo caballo = new Caballo("Pepe");
        Caballo caballo2 = new Caballo("Rocinante");
        Caballo caballo3 = new Caballo("Paco");
        Caballo caballo4 = new Caballo("Raúl");
        Caballo caballo5 = new Caballo("Santiago");

        Buey buey = new Buey("Wanchope");
        Gallina gallina = new Gallina("Caponata");
        Pavo pavo = new Pavo("Perico");
        Pavo pavo2 = new Pavo("Pavichi");

        gallinero.meterAve(gallina);
        gallinero.meterAve(pavo);
        gallinero.meterAve(pavo2);

        establo.metermamifero(caballo);
        establo.metermamifero(buey);
        establo.metermamifero(caballo2);
        establo.metermamifero(caballo3);
        establo.metermamifero(caballo4);
        establo.metermamifero(caballo5);

        matadero.matarAve(gallinero);

        gallinero.cogerHuevos();

    }
}
