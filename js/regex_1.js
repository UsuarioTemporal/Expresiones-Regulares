const fn = (texto)=>{

    // representacion literal de la expresion  literal
    let patron =/\w+/ // utilizar esta manera si la expresion se matiene constante
    // esta expresion literal ofrece la compilacion cuando se cargue eñ script
    return patron.test(texto)
}
console.log(fn('asdas'));