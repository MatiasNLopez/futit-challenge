/* El parametro options esun objeto de opciones que se le pasan a las peticiones, estas comunmente son: 
    method: GET,POST,UPDATE o DELETE
    Headers: Es un objeto donde se pasan cabeceras de la peticion como por ejemplo {"content-type":"application/json"}
    body: Que son los datos que reciben la peticion, generalmete se usan en peticiones POST o UPDATE  
*/

fetch(url, options)
.then(res => res.ok
    ? res.json() 
    : Promise.reject(
        {
            error: true,
            msg: "ocurrio un error en la peticion"
        })
    )
.catch(err => err)