package Java;

public class Ejer3 {
    public static void main(String[] args) {
        int[] array = {1, 0, -2, 0, 0, 3, 4, 0, 0};
        System.out.println(toString(array));
        System.out.println("Los elementos distintos de 0 son " + contDistZero(array));
        System.out.println(toString(array)); 
    }   
    
    public static int contDistZero(int [] list){
        int cont = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] != 0){
                list[cont] = list[i];
                if(i != cont) list[i] = 0;
                cont ++;
            }
        }
        return cont;
    }

    public static String toString(int [] array){
        String str = "[ ";
        if(array.length > 0){
            
            if(array.length == 1) return "[ " + array[0]+" ]";

            for (int i = 0; i < array.length-1; i++) 
                str += array[i]+",";
            
            str += array[array.length-1];
        }
        
        return str +" ]";
    }
}


