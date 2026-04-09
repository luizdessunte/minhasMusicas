package br.com.alura.minhasMusicas.Principal;

import br.com.alura.minhasMusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasMusicas.modelos.Musica;
import br.com.alura.minhasMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("ONE");
        minhaMusica.setArtista("Metallica");

        for (int i = 0; i< 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i< 100; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("IA");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i< 2000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i< 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



    }
}
