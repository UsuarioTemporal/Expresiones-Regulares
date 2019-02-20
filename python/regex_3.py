import re
string = 'Python.Python es un lenguaje de sintaxis sencilla'
print(re.search('th',string))

def search(string):
    if re.search('Thom',string) :
        return print('Encontrado')
    return print('No existe')
search('Roman Aguilar Thom')
search('Roman Aguilar Thomasdasd')

myObject = re.search('th',string)
print(myObject.span()) # imprime en que rango(tupla) lo encontro
print(myObject.start()) # imprime de donde comenzó a encontrar 
print(myObject.end()) # imprime de donde terminó de encontrar
print(myObject.group()) # imprimir el texto a buscar

print(re.findall('Python',string)) # devuelde una lista con los valores encontrados