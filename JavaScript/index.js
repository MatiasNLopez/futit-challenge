'use strict'

/* Aca se ejecuta del ejercicio 2 al 4 */

import Ejer2 from "./Ejer2.js";
import Ejer3 from "./Ejer3.js";
import Ejer4 from "./Ejer4.js";

document.addEventListener("DOMContentLoaded", (e) => {
    const array = ["Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon","Pineapple", "Peach", "Peach"],
    matrix1  = [[1, 0, 0], [0, 2, 0], [0, 0, 3]],
    matrix2 = [[1, 0, 0], [0, 2, 3], [0, 0, 3]];

    Ejer2(array);
    Ejer3();
     
    /* Ejer 4  */
    console.log(Ejer4(matrix1)); //True
    console.log(Ejer4(matrix2)); //False
    
});