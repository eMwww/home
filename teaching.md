---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign items = site.data.courses %}

<table>
  <tr>
    <th style="width:40%; background:#dddddd; text-align:left">Regular courses @ GSSI</th>
    <th style="width:60%; background:#dddddd; text-align:left">Other lectures/tutorials</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign courses = items | where: "where", "GSSI" %}
- Current courses{% for course in courses %}{% unless course.list == "past" %}
	- [{{ course.title }}](teaching/{{ course.path }}){% if course.guest %} (Lecturer: {{ course.guest }}){% endif %}{% endunless %}{% endfor %}
{% assign past = courses | where: "list", "past" %}
- Past courses{% for course in past %}
	- {{ course.title }}{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.courses %}
{% for n in items %}{% unless n.list == "yes" or n.where == "GSSI" %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }} ({% for date in n.when %}{{ date }}{% endfor %}){% endunless %}{% endfor %}
</td>
</tr>
<tr>
<th style="width:40%; background:#dddddd; text-align:left" colspan="2">Invited Lectures/tutorials</th>
</tr>
<tr>
<td colspan="2" class="quicklinks" markdown="1">
{% assign items = site.data.invited | sort: 'date' | reverse %}
{% for n in items %}{% unless n.list == "yes" or n.type == "talk" %}
- {% if n.url %} [{{ n.title }}]({{ n.url }}){% else %}"{{ n.title }}"{% endif %}.{% if n.descr %} {{ n.descr }}{% else %}{% endif %} {{ n.where }}; {% for date in n.when %}{{ date }}{% endfor %}{% endunless %}{% endfor %}
</td>
</tr>
</table>
