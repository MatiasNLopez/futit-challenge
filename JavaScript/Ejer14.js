/* { firstname: "demo", lastname: "demo", dni: 1234 } */

/* Uso la destructuracion para pasar los datos */
export const ListElement = ({firstname,lastname,dni}) =>{
    return(
        <ul>
            <li>Nombre: {firstname}</li>
            <li>Apellido: {lastname}</li>
            <li>DNI: {dni}</li>
        </ul>
    )
}