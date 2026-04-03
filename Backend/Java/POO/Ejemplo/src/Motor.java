class Motor {
    private String matricula;
    private float plazas;
    private float capacidadDeDeposito;
    private float cantidadDeposito;
    private boolean arrancado;
    private boolean enMarcha;

    public Motor(String matricula, float plazas, float capacidadDeDeposito, float cantidadDeposito, boolean arrancado,
            boolean enMarcha) {
        this.matricula = matricula;
        this.plazas = plazas;
        this.capacidadDeDeposito = capacidadDeDeposito;
        this.cantidadDeposito = cantidadDeposito;
        this.arrancado = arrancado;
        this.enMarcha = enMarcha;
    }

    public Motor() {}

    private float llenarDeposito() {
        if (this.cantidadDeposito != this.capacidadDeDeposito) {
            this.cantidadDeposito++;
        }
        return this.cantidadDeposito;
    }

    private boolean arrancado() {
        if (this.arrancado) {
            System.out.println("El motor ya esta arrancado");
        } else {
            this.arrancado = true;
        }
        return arrancado;
    }

    private boolean apagar() {
        if (!this.arrancado) {
            System.out.println("El motor ya esta apagado");
        } else {
            this.arrancado = false;
        }
        return arrancado;
    }

    private float vaciarDeposito() {
        if (arrancado) {
            this.cantidadDeposito--;
        }
        return cantidadDeposito;
    }

    @Override
    public String toString() {
        return "Motor [matricula=" + matricula + ", plazas=" + plazas + ", capacidadDeDeposito=" + capacidadDeDeposito
                + ", cantidadDeposito=" + cantidadDeposito + ", arrancado=" + arrancado + ", enMarcha=" + enMarcha
                + "]";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getPlazas() {
        return plazas;
    }

    public void setPlazas(float plazas) {
        this.plazas = plazas;
    }

    public float getCapacidadDeDeposito() {
        return capacidadDeDeposito;
    }

    public void setCapacidadDeDeposito(float capacidadDeDeposito) {
        this.capacidadDeDeposito = capacidadDeDeposito;
    }

    public float getCantidadDeposito() {
        return cantidadDeposito;
    }

    public void setCantidadDeposito(float cantidadDeposito) {
        this.cantidadDeposito = cantidadDeposito;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

}