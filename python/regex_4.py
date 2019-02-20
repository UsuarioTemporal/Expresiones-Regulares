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

list_web = ['google.com','ed.team','platzi.com','google.es']

for web in list_web :
    if re.findall('.team$',web) :
        print(web)