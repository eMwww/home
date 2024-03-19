import yaml
# with open('/home/emilio/Dropbox/cv/cv.md', 'r') as cv:
#     for l in cv.readlines()[:5]:
#         print(l)

def getData(f):
    """reads the data from the file _data/f.yml"""
    with open('_data/%s.yml'%f, 'r') as file:
        return yaml.safe_load(file)

def fix(f,i,t='%s',d=''):
    """Retrieves f from i if f is a key, else returns d"""
    return t%i[f] if f in i.keys() else d

data = getData('pc')
for i in data:
    print('- %s: [%s](%s)'%(i['acr'], i['pc'], i['url']))

data = getData('examiner')
for i in data:
    print('- %s: %s. %s (%s)'%(i['viva'], i['title'], i['institution'], i['date']))

data = getData('service')
for i in data:
    at = '' if i['type']=='wg' else i['institution']
    descr = fix('descr', i, d=i['name'])
    date = fix('date', i, t='(%s)')
    print('- %s of %s %s %s'%(i['role'], descr, at, date))

data = getData('invited')
for i in data:
    title = '[%s](%s)'%(i['title'], i['url']) if 'url' in i.keys() else i['title']
    print('- %s. %s (%s)'%(title, i['where'], i['when']))

data = getData('phd')
for i in data:
    title = fix('title',i,t='. %s. ', d='. ')
    viva = fix('viva',i,t='Viva held on %s.')
    note = fix('note',i)
    print('- %s%s%s %s'%(i['name'], title, viva, note))

data = getData('edited')
for i in data:
    print('- [%s](%s)'%(i['title'], i['url']))

data = getData('sc')
for i in data:
    print('- [%s](%s)'%(i['acr'], i['url']))

data = getData('talks')
for i in data:
    print('- %s: [%s](%s)'%(i['venue'], i['title'], i['slides']))

data = getData('volumes')
for i in data:
    print('- %s: [%s](%s)'%(i['vol'], i['descr'], i['url']))

