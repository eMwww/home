---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign items = site.data.courses %}

# <a id='courses'>Regular teaching</a>
<p style="font-size:18pt">Below are the details of the courses I'm regularly teaching
</p>

{% assign courses = items | where: "list", "yes" %}



{% for course in courses %}
- [{{ course.title }}](#{{ course.title }}){% endfor %}

I try to keep this page updated as much as I can. However, for some courses of past academic years the information could be incomplete or outdated.

{% for course in courses %}
## <a id='{{ course.title }}'>{{ course.title }}</a>
Academic year {{ course.ay }}
<p style="font-size:12pt">{{ course.syllabus }}</p>

{% if course.material %}
### References and material
<div markdown="1" style="font-size:8pt">
{% for m in course.material %}
- {% if m.url %}[Click here]({{ m.url }}) for {% endif %}{{ m.descr }} {% endfor %}
</div>
{% endif %}

{% if course.notes %}
### Lecture notes:
<div markdown="1" style="font-size:8pt">
{% for l in course.notes %}
- {{ l.date }}: [Notes]({{ l.url }}){% endfor %}
</div>
{% endif %}
[Top](#courses)
{% endfor %}

