export const Component = (data) => {
    let {name, lastName} = data
    return(
        <h1>Bienvenido {name} {lastName}</h1>
    )
}