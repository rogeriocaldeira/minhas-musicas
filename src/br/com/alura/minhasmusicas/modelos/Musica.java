package br.com.alura.minhasmusicas.modelos;

import javax.sound.sampled.AudioFileFormat;

public class Musica extends Audio {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void info() {
        System.out.println("nome do cantor " + cantor);
        System.out.println("nome do album " + album);
        System.out.println("estilo de musica " + genero);
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 8;
        }
    }
}



