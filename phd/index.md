---
layout: default
content: true
docs_list_title: PhD Students
use-site-title: false
---

<h2> My PhD students </h2>

{% assign items = site.phd | sort: 'name' %}

<div>
<ul>
  {% for n in items %}
    <li> {{ n.name }}  	{% if n.viva %} (viva held in {{ n.viva }}). {% else %} (current student) {% endif %}
 </li>
  {% endfor %}
</ul>
</div>
