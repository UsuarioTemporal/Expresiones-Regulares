import re

patron = re.compile("\d") # significa un digito
patron = re.compile("\d\d") # significa un numero de dos digitos

print(patron.search("dasda1sdas23w342asd43"))

if re.search('[A-Z][0-9].*$','asdasd asdasd SDASD3'):
    print('Encontrado')