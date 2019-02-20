import re
import json

with open('data.json') as file:
    data = json.load(file)

list_ = data['personas']
print(list_)


for per in list_ :
    if re.findall('^cristian',per['nombre']) :
        print(per)