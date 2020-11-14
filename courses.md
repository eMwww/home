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

# Membership of scientific committees 
{% assign items = site.data.pc %}

{% for n in items %}
- Member of the {% if n.pc %} program committee of {% if n.url %} <a href="{{ n.url }}">{{ n.acr }}</a>{% endif %} {{ n.pc }}{% endif %} {% if n.sc %} steering committee of {{ n.sc }} ({{ n.from }} --- {{ n.to }}){% endif %} {% if n.oc %} organising committee of {{ n.oc }}{% endif %}{% endfor %}
