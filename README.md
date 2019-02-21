# **REGEX**

Tambien conocido com expresiones regulares , es una forma en la que la computación para trabajar con el lenguaje.Nos sirve mucho para trabajar con busquedas especificas .
Secuencia de caracteres(metacaracteres) que forman un patrón de búsqueda

Estos patrones están definidos bajo operaciones básicas :

## **Alternación(|)**

Es una barra vertical que separá las alternativas

## **Cuantificación(?,+,{},*)**

Cuantos caracteres se va a especificar, es decir se usa para especificar la cantidad de ocurrencias de determinado elemento.

Ejm :
hola? ... esto significara que el elemento que le antecede(a) puede aparecer cero o sola una vez

hola* ... esto significara que el elemento que le antecede puede aparecer cero o muchas veces

hola+ ... esto significara que el elemento que le antecede puede aparecer al menos una ves o mas

hola{3,} ... esto significara que el elemento que le antecede aparacesca al menos 3 veces o mas

hola{3,5} ... esto significara que el elemento que le antecede aparacesca al menos 3 o a lo mas 5

## **Agrupación('()')**

Se utilizan para agrupar a los patrones esto es muy utilizados con los cuantificadores y alternaciones

```python
    # Autor : Thom Maurick Roman Aguilar
```