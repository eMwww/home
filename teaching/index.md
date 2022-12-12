---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign items = site.data.courses %}

# Regular teaching
<p style="font-size:18pt">Below are the details of the courses I'm regularly teaching</p>

{% assign courses = items | where: "list", "yes" %}

{% for course in courses %}
## {{ course.title }}
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
{% endfor %}

