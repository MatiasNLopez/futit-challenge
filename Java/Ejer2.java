package Java;

/**
 * Ejer2
 */
public class Ejer2 {

    public static void main(String[] args) {
        
        /* 
            sumRow = 4 + 9 + 2 = 15
            sumCol = 4 + 3 + 8 = 15
            sumDiagonal = 4 + 5 + 6 = 15
            sumRow * 3 = 45
            sumCol * 3 = 45
            sumDiagonal * 3 = 45

        */

        int [][] squareMagic = {
            {4,9,2},
            {3,5,7},
            {8,1,6}
        };
        
        int [][] squareNoMagic = {
            {4,9,2},
            {3,5,10},
            {8,1,6}
        };
        
        System.out.println("El cubo\n" + toString(squareMagic));
        System.out.println(isMagicSquare(squareMagic) ? "Es magico":"No es magico");
        System.out.println();
        System.out.println("El cubo\n" + toString(squareNoMagic));
        System.out.println(isMagicSquare(squareNoMagic) ? "Es magico":"No es magico");
        
    
    }

    public static boolean isMagicSquare(int[][] square){
        
        int sumRow = 0;
        int sumCol = 0;
        int sumDiagonal = 0;
        //Sumo la primera fila 
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++){
                sumRow += square[i][j];
                sumCol += square[j][i];
                if(i == j) sumDiagonal += square[i][j];
                
            } 
            
            /*  la suma de una columna y una fila son distintas */
            if(sumRow != sumCol)return false;  
            
        }
        
        return sumRow == sumCol && sumRow ==  sumDiagonal * square.length;
    }

    public static String toString(int[][] square){
        
		String str = "";
       
		for (int i = 0; i < square.length; i++){
            for (int j = 0; j < square.length; j++) {
                if( j == 0) str += "[ "+square[i][j]+", ";
                else if (j == square.length - 1 ) str += square[i][j]+" ]";
                else str += square[i][j]+", "; 
            }

            str+="\n";
        } 
		
		return str;
	}
}