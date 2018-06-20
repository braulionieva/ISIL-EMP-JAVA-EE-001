package pe.egcc.pagoapp.dto;

public class PagoDto {

    //INPUT
    private int horasDia;
    private int dias;
    private double pagoHora;

    //OUTPUT
    private double ingreso;
    private double renta;
    private double neto;

    public PagoDto() {
    }

    public PagoDto(int horasDia, int dias, double pagoHora) {
        this.horasDia = horasDia;
        this.dias = dias;
        this.pagoHora = pagoHora;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    
}
