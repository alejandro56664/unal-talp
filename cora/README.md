# Cora Lang

Lenguaje de jugete creado basado en el excelente tutorial del profesor Jaime Pavlich-Mariscal, puede ver su canal [aquí](https://www.youtube.com/playlist?list=PL5BoUl9EDVnBojdOv9J9S9KZPJdOc6HTw).

## To Do

- Implementación comparadores
- Implementación scope para las variables.
- Agregar comentarios
- Implementación manejo de strings

Ejemplo sintaxis lenguaje
´´´
program miprograma {
    var x
    x = 5
    if (not false and true) {
        log " El resultado es: { (5+1) * 2 }"
    } else {
        log (x-1)/2
    }
}
´´´

Idealmente podría ser un lenguaje para aplicar reglas de negocio sobre datos consultados en API Rest

Posibles influencias:
- SQL
- GraphQL

Consumo de API REST nativo

´´´
program miprograma {
	var user_id = 0
	var user = get from 'https://localhost:3000/api/{ user_id }' | select { id, name, type }
    if (user.type == 'json') {
		user.mensaje = 'es tipo json'
		log put user in 'https://localhost:3000/api/{ user_id }'
		log put { user.id } in 'https://localhost:3000/api/historic/{ user_id }'
    } else {
		log 'procedemos a borrar'
		delete 'https://localhost:3000/api/{ result.id }'
    }
}
´´´
