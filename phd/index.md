---
layout: default
content: true
docs_list_title: PhD Students
use-site-title: false
---


## My PhD students
(in reverse time order)

{% assign items = site.data.phd %}
{% for n in items %}
- _{{ n.name }}_{: style="color:  #117a65;" }
  {% if n.viva %} _(viva held in {{ n.viva }})_{: style="font-size:12pt" }. {% else %} _(current student)_{: style="font-size:12pt" } {% endif %}
{% endfor %}


