import re
list_ = ['Ma1',
            'Ma2',
            'Mb4',
            'Mc4',
            'Se1',
            'VaA',
            'MaC',
            'Maa']

for item in list_ :
    if re.findall('[^0-9A-Z]$',item) :
        print(item)