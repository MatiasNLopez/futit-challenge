'use strict'

/* retorna las palabras que contengan la 'p' en minuscula */
const getAllStringP = (array) =>  array.filter((word) => word.includes("p"));

/* retorna la palabra "Grape" */
const getStringGrape = (array) => array.filter((word) => word.includes("Grape"))[0];

export default function Ejer2(array){
    console.log(getAllStringP(array));
    console.log(getStringGrape(array));
}