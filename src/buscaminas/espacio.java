/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Hugoriquelme
 */
public class espacio{


    private int minasAlrededor;
    private boolean esMina;
    private boolean revelado;
    public espacio(){

        minasAlrededor=0;
        esMina=false;
    }
    public void colocarMina(){


        esMina=true;
    }
    public void aumentarMinas(){

        if(esMina==false){
            minasAlrededor++;
        }
    }
    public boolean verMina(){

        return esMina;
    }
    public boolean verRevelado(){

        return revelado;
    }
    public void cambiarEstado(){
        revelado=true;
    }
    public String toString(){

        String res="*";
        if(revelado==true){
            res=""+minasAlrededor;
        }
        if(esMina==true&&revelado==true)
        res="X";
        return res;
    }
}
