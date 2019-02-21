import re

if re.match('sandra','Sandra',re.IGNORECASE) :
    print('Hecho')

print(re.search(r'hol(a|i)?','holo'))
print(re.search(r'h(ola)*','holo'))