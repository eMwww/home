---
layout: default
content: true
---

## Programme committees
{% assign items = site.data.pc | sort: 'date' | reverse %}
{% for n in items %}
- {% if n.pc %} {{ n.pc }} {% endif %}{% if n.oc %}
  organising committee {{ n.oc }}
  {% endif %}({% if n.url %}[{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}]({{ n.url }}), {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}
