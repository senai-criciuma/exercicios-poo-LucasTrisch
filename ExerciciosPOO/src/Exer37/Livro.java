package Exer37;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public abstract class Livro {
    private String titulo;
    private String autor;
    private int numePag;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumePag() {
        return numePag;
    }

    public void setNumePag(int numePag) {
        this.numePag = numePag;
    }
}
