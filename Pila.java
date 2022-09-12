package Analizador_Sintactico_Pila;
public class Pila {
    private Nodo UltimoValorAdd;
    
    public Pila(){
        UltimoValorAdd = null;
    }
    
    //Metodo de inserccion de pila
    public void Insert(char Value){
        Nodo new_Nodo = new Nodo();
        new_Nodo.informacion = Value;
        if(UltimoValorAdd == null){
            new_Nodo.siguiente = null;
            UltimoValorAdd = new_Nodo;
        } else {
            new_Nodo.siguiente = UltimoValorAdd;
            UltimoValorAdd = new_Nodo;
        }
    }

    public char extraer(){
        if (UltimoValorAdd != null){
            char informacion = UltimoValorAdd.informacion;
            UltimoValorAdd = UltimoValorAdd.siguiente;
            return informacion;
        }else{
            return  Character.MAX_VALUE;
        }
    }

    public boolean PilaVacia(){
        return  UltimoValorAdd == null; //Si = 0 true no == false
    }

}
