---
layout: default
content: true
---

# Papers
My papers can be found on 
[DBLP](http://www.informatik.uni-trier.de/~ley/pers/hd/t/Tuosto:Emilio.html).
Some recent drafts are listed below (in no particular order; mouse-over titles for a short description)

{% assign items = site.data.drafts %}
{% for n in items %}
- <span class="tooltip">{{ n.title }}<span class="tooltiptext">with {{ n.author }}.{{ n.descr }}</span></span>
  <span style="color:#f98811; font-size:.75em;"> {% if n.venue %}Accepted at {{ n.venue }}.{% endif %}
  {% if n.draft %}Submitted at {{ n.draft }}.{% endif %}</span> <span markdown="1" style="font-size:.75em">{% if n.url %} Available [here]({{ n.url }}) {% endif %}</span>{% endfor %}

# Edited volumes

{% assign items = site.data.edited %}
{% for n in items %}
 - *{{ n.title }}*{: style="color:  #117a65; opacity: 0.80;" }
 <a href="{{ n.url }}">{{ n.ref }}</a> {% if n.img %} <img alt="{{ n.title }}" src="/home/images/{{ n.img }}" width="3%" /> {% endif %} {% endfor %}

