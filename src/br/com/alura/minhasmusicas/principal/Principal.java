package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musicaPop = new Musica();
        musicaPop.setTitulo("esteiraRolante");
        musicaPop.setCantor("latino");
        musicaPop.setAlbum("euSouVeloz");
        musicaPop.setGenero("pop");


        for (int i = 0;i < 500 ;i++){
            musicaPop.curte();
        }
        for (int i =0;i< 200;i++){
            musicaPop.reproduz();
        }
        Podcast meuPodecast=new Podcast();
        meuPodecast.setTitulo("bolhaDev");
        meuPodecast.setApresentador("rogerio");
        meuPodecast.setDescricao("tecnologia");

        for(int i =0;i <5000;i++){
            meuPodecast.reproduz();
        }
        for (int i = 0;i<250;i++){
            meuPodecast.curte();
        }
        musicaPop.info();
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodecast);
        preferidas.inclui(musicaPop);







    }

}
