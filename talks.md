---
layout: default
content: true
---

# Some talks

{% assign items = site.data.talks %}
<span markdown="1" style="line-height:.5em">
{% for n in items %}
- _{{ n.title }}_.
{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}.
<span class="tooltip" style="font-size:100%;">
<span class="tooltiptext">
<img  alt="" src="/home/slides/{{ n.cover }}" width="120%" title="cover"/>
</span>
<br/>[Slides]({{ n.slides }})
{% endfor %}
</span>


