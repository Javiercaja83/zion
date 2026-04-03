public class Animal {
    public String especie, sonido;
    public int numeroPatas, numeroAlas;
    public boolean terrestre;


    public Animal() {
    }

    public Animal(String especie, String sonido, int numeroPatas, int numeroAlas, boolean terrestre) {
        this.especie = especie;
        this.sonido = sonido;
        this.numeroPatas = numeroPatas;
        this.numeroAlas = numeroAlas;
        this.terrestre = true;
    }

    public void hacerSonido(){
        System.out.println(sonido);

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public boolean esAve(int numeroAlas){
        boolean esAve = (numeroAlas > 0) ? true : false;
        return esAve;
    }
}
