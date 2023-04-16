---
layout: default
content: true
---

# Some talks

{% assign items = site.data.talks %}
{% for n in items %}
- **_{{ n.title }}_**.  
{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}. <span class="tooltip"><span class="tooltiptext">![](/home/slides/{{ n.cover }})</span>[Slides]({{ n.slides }})</span>{% endfor %}

# Invited talks, tutorials, participations

{% assign items = site.data.invited %}
{% for n in items %}
- **_{{ n.title }}_**.  
{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}.
{{ n.where }}{% endfor %}


