---
layout: default
content: true
---

# Some talks

{% assign items = site.data.talks %}
<div markdown="1" style="font-size:75%">
{% for n in items %}
- **_{{ n.title }}_**.  
{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}.
<span class="tooltip" style="line-height:.5em">
<span class="tooltiptext">
<img  alt="" src="/home/slides/{{ n.cover }}" width="120%" title="cover"/>
</span><br/>
[Slides]({{ n.slides }})
</span>
{% endfor %}
</div>


