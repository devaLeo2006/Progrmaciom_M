/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulariohora;

/**
 *
 * @author Alumno
 */
public class Encapsulamiento {
    
    

    private int hora, minuto, segundo;

    public Encapsulamiento(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    Encapsulamiento() {
        establcerTiempo(hora, minuto, segundo);
        getHora();
        getMinuto();
        getSegundo();
    }

    

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto) {
        this.minuto =((minuto >= 0 && minuto < 60) ? minuto: 0);
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }

    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    public void establcerTiempo (int h, int m, int s){
        setHora(h);
        setMinuto(h);
        setSegundo(h);
    }
    
    public String horaUniversal(){
        return String.format("%d:%02d:%02d %s"
    }
    
    public String horaEstandar(){
        /*
        if ((getHora() ==0) || (getHora()==12)){
            hora=12;
        }
        else 
            hora=hora%12;
        if (getHora() <12){
            System.out.println("AM");
        } else System.out.println("PM");
        */
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? : getHora() % 12),
                (getMminuto,getSeundo,(getHora))
                
                );
    }

}
