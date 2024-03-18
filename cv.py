import yaml
with open('_data/pc.yml', 'r') as file:
    pc = yaml.safe_load(file)
    for i in pc[:5]:
        print('- %s: [%s](%s)'%(i['acr'], i['pc'], i['url']))
    
	

