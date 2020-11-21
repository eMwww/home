---
layout: default
content: true
---

# Some talks

{% assign items = site.data.talks %}
{% for n in items %}
- _{{ n.title }}_
  <span markdown="1" style="font-size:.75em"><br/>
  {% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}. [Slides]({{ n.slides }})
  </span>{% endfor %}

