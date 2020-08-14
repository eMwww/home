---
layout: default
content: true
---
# Publications


## Papers
My papers can be found on 
[DBLP](http://www.informatik.uni-trier.de/~ley/pers/hd/t/Tuosto:Emilio.html).
Some recent drafts are listed below (in no particular order)

{% assign items = site.data.drafts %}
{% for n in items %}
- *{{ n.title }}*{: style="color:  #117a65; opacity: 0.80;" }
  (with {{ n.author }}).  
  <span markdown="1" style="color:#888888">{{ n.descr }} {% if n.url %} Available at [{{ n.url }}](here) {% endif %}{% endfor %}</span>


## Edited volumes

{% assign items = site.data.edited %}
{% for n in items %}
 - *{{ n.title }}*{: style="color:  #117a65; opacity: 0.80;" }
 <a href="{{ n.url }}">{{ n.ref }}</a> {% if n.img %} <img alt="{{ n.title }}" src="/home/images/{{ n.img }}" width="3%" /> {% endif %} {% endfor %}

