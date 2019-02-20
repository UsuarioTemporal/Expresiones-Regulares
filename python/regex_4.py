import re
import json

with open('data.json') as file:
    data = json.load(file)

list_ = data['personas']
# print(list_)


for per in list_ :
    if re.findall('^c',per['nombre']) :
        print(per)

print('\n')

for per in list_ :
    if re.findall('an$',per['nombre']):
        print(per)
