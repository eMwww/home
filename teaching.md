---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

<span style="font-size:.8em;">
I try to keep this page updated as much as I can. However, for some courses of past academic years the information could be incomplete or outdated.
</span>

{% assign items = site.data.courses %}

<table>
  <tr>
    <th style="width:20%; background:#dddddd; text-align:left">Regular courses @ GSSI</th>
    <th style="width:40%; background:#dddddd; text-align:left">Invited Lectures/tutorials</th>
    <th style="width:40%; background:#dddddd; text-align:left">Other lectures/tutorials</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign courses = items | where: "where", "GSSI" %}- <span style="font-size:.75em">Current courses</span>
{% for course in courses %}{% unless course.list == "past" %}
	- [{{ course.title }}]({{ course.path }}){% endunless %}{% endfor %}
- <span style="font-size:.75em">Past courses</span>
{% assign past = courses | where: "list", "past" %}
{% for course in past %}
	- [{{ course.title }}]({{ course.path }}){% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.invited %}
{% for n in items %}{% unless n.list == "yes" or n.type == "talk" %}
- {% if n.url %} [{{ n.title }}]({{ n.url }}){% else %}"{{ n.title }}"{% endif %}{% if n.descr %}. {{ n.descr }}.{% else %}.{% endif %} {{ n.where }}; {% for date in n.when %}{{ date }}{% endfor %}{% endunless %}{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.courses %}
{% for n in items %}{%  unless n.list == "yes" or n.where == "GSSI" %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }} ({% for date in n.when %}{{ date }} {% endfor %}){% endunless %}{% endfor %}
</td>
</tr>
</table>
