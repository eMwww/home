---
layout: default
content: true
---
# Publications

## Papers
My papers can be found on 
[DBLP](http://www.informatik.uni-trier.de/~ley/pers/hd/t/Tuosto:Emilio.html).
I will soon add here my papers...bear with me.
{% assign items = site.editor | sort: 'date' | reverse %}


## Edited volumes

{% assign items = site.editor | sort: 'date' | reverse %}

<div>
  <ul>
    {% for n in items %}
      <li>{{ n.title }} -  <a href="{{ n.url }}</li>">{{ n.ref }}</a> {% if n.img %} <img alt="{{ n.title }}" src="{{ n.img }}" width="3%" /> {% endif %}</li>
    {% endfor %}
  </ul>
</div>


