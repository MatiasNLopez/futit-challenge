'use strict'

export default function Ejer4(array){
    for (let i = array.length - 1; i >= 0; i--) {
        for (let j = array.length - 1; j >= 0; j--) 
            if(i!=j && array[i][j] !== 0 ) return false;
    }
    return true;
} 