import re
print(re.search(r"g","angel")) # r significara que lo desglozara por carater , si lo encuentra devuelve un match

print(re.search(r'hola*','holaaaaaaa').group())
print(re.search(r'hola?','holaaaaaaa').group())
print(re.search(r'hola+','hol'))
print(re.search(r'hola+','hola').group())
print(re.search(r'hola+','holaaa').group())