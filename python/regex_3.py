import re
string = 'Python'
print(re.search('th',string))

def search(string):
    if re.search('Thom',string) :
        return print('Encontrado')
    return print('No existe')
search('Roman Aguilar Thom')
search('Roman Aguilar Thomasdasd')

myObject = re.search('th',string)
print(myObject.span()) # imprime en que lugar lo encontro
print(myObject.start()) # imprime de donde comenza a encontrar 
print(myObject.end()) # imprime de donde termino de encontrar
print(myObject.group()) # imprimir el texto a buscar