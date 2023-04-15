---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign items = site.data.courses %}

# <a id='courses'></a>Regular teaching
Below are the details of the courses I'm regularly teaching

{% assign courses = items | where: "list", "yes" %}
{% for course in courses %}
- [{{ course.title }}](#{{ course.title }}){% endfor %}

Click [here](#other) for advanced lectures or tutorials.

I try to keep this page updated as much as I can. However, for some courses of past academic years the information could be incomplete or outdated.

{% for course in courses %}
## <a id='{{ course.title }}'></a>{{ course.title }}
Academic year {{ course.ay }}
<p style="font-size:12pt">{{ course.syllabus }}</p>

{% if course.material %}
### References and material
<div markdown="1">
{% for m in course.material %}
- {% if m.url %}[Click here]({{ m.url }}) for {% endif %}{{ m.descr }} {% endfor %}
</div>
{% endif %}

{% if course.notes %}
### Lecture notes:
<div markdown="1">
{% for l in course.notes %}
- {{ l.date }}: {% for i in l.items %}[{{ i.name }}]({{ i.url }}){% if i.last %}{% else %}, {% endif %}{% endfor %}[{{ l.name }}]({{ l.url }}){% endfor %}
</div>
{% endif %}
[Top](#courses)
{% endfor %}

## <a id='other'></a>Other courses / tutorials
{% assign items = site.data.courses %}
<div markdown="1">
{% for n in items %}
{%  unless n.list == "yes" %}
- {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a>{% else %} {{ n.title }}{% endif %}. {{ n.descr }}:  {{ n.where }}<br/>
<ul><ul> {% for date in n.when %} <li>{{ date }}</li> {% endfor %}</ul></ul>
{% endunless %}
 {% endfor %}
</div>
[Top](#courses)

## <a id='invited'></a>Invited lectures / tutorials
{% assign items = site.data.invited %}
<div markdown="1">
{% for n in items %}
- {{ n.when }}: *{{ n.title }}* {{ n.where }}{% endfor %}
</div>
[Top](#courses)
