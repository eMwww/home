---
layout: default
content: true
docs_list_title: Advanced Courses
use-site-title: false
---

# Advanced courses / tutorials
{% assign items = site.data.courses %}

{% for n in items %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }} {{ n.when }}{% endfor %}

# Invited lectures / tutorials
{% assign items = site.data.invited %}

{% for n in items %}
- {{ n.when }}: *{{ n.title }}* {{ n.where }}{% endfor %}
