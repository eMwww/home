---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign courses = site.data.courses | where: "title", "Introduction to Formal Methods" %}
{% for course in courses %}

## <a id='{{ course.title }}'></a>{{ course.title }}
Academic year {{ course.ay }}
<p style="font-size:12pt">{{ course.syllabus }}</p>

{% if course.material %}
### References and material
<div markdown="1">
{% for m in course.material %}
- {% if m.url %}[Click here](https://emwww.github.io/home/teaching/{{ course.path}}/{{ m.url }}) for {% endif %}{{ m.descr }} {% endfor %}
</div>
{% endif %}

{% if course.notes %}
### Lecture notes:
<div markdown="1">
{% for l in course.notes %}
- {{ l.date }}: {% for i in l.items %}[{{ i.name }}]({{ i.url }}){% if i.last %}{% else %}, {% endif %}{% endfor %}[https://emwww.github.io/home/teaching/{{ course.path}}/{{ l.name }}]({{ l.url }}){% if l.video %}<br/>Last year's [recording]({{ l.video }}){% endif %}{% endfor %}
</div>
{% endif %}
{% endfor %}
