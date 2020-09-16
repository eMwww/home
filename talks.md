---
layout: default
content: true
---

# Some talks

{% assign items = site.data.talks %}
{% for n in items %}
- {{ n.title }}
  <span markdown="1" style="font-size:.75em"><br/>{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date }}. [Slides](slides/{{ n.slides }})</span>{% endfor %}

