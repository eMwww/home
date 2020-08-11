---
layout: default
content: true
docs_list_title: Advanced Courses
use-site-title: false
---

# Taught advanced courses

{% assign items = site.data.courses %}

{% for n in items %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }} {{ n.when }}{% endfor %}

