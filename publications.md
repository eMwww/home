---
layout: default
content: true
---

# Recent or ongoing stuff
{% assign items = site.data.drafts %}
{% for n in items %}
- <span class="tooltip">{{ n.title }}<span class="tooltiptext">with {{ n.author }}.<br/>{{ n.descr }}</span></span>
  <span style="color:#f98811;"> {% if n.venue %}Accepted at {{ n.venue }}.{% endif %}{% if n.printed %}{{ n.printed }}.{% endif %}
  {% if n.draft %}Submitted at {{ n.draft }}.{% endif %}</span> <span markdown="1" style="color:#117a65">{% if n.url %} Available [here]({{ n.url }}) {% endif %}</span>{% endfor %}

# Contributed collections
{% assign items = site.data.books %}
{% for n in items %}
- {{ n.title }}. <span markdown="1" class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span> Available [Here]({{ n.url }})</span>{% endfor %}

# Edited volumes

{% assign items = site.data.edited %}
{% for n in items %}
- *{{ n.title }}*{: style="color:  #117a65; opacity: 0.80;" } <span markdown="1" class="tooltip"><span class="tooltiptext">![{{ n.title }}](images/{{ n.img }} "{{ n.title }}"){: style="width:50%" }</span>[{{ n.ref }}]({{ n.url }})</span>{% endfor %}

