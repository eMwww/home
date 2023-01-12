---
layout: default
content: true
docs_list_title: Advanced Courses
use-site-title: false
---

# Advanced courses / tutorials
{% assign items = site.data.courses %}
<div markdown="1" style="font-size:6pt">
{% for n in items %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }}<br/>
<ul><ul> {% for date in n.when %} <li>{{ date }}</li> {% endfor %}</ul></ul>
 {% endfor %}
</div>

# Invited lectures / tutorials
{% assign items = site.data.invited %}
<div markdown="1" style="font-size:6pt">
{% for n in items %}
- {{ n.when }}: *{{ n.title }}* {{ n.where }}{% endfor %}
</div>
