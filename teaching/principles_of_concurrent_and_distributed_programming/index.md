---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign courses = site.data.courses | where: "title", "Principles of Concurrent and Distributed Programming" %}
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
- {{ l.date }}: {% for i in l.items %}[{{ i.name }}]({{ i.url }}){% if i.last %}{% else %}, {% endif %}{% endfor %}[{{ l.name }}](https://emwww.github.io/home/teaching/{{ course.path}}/{{ l.url }}){% if l.video %}<br/>Last year's [recording]({{ l.video }}){% endif %}{% endfor %}
</div>


### Zoom recordings:
- 21/01/2026: [1st class](https://www.dropbox.com/scl/fi/a165ue2kv4ekso7xz8p35/zoom_1.mp4?rlkey=5szv1zpqfsuzvzzh4aynclyy3&dl=0)
- 22/01/2026: [2nd class](https://www.dropbox.com/scl/fi/0v3r7jka8ph4bqrv4fk0s/zoom_2.mp4?rlkey=k74pkysittxwgju7wf60jektl&dl=0)
- 26/01/2026: [3rd class](https://www.dropbox.com/scl/fi/0v3r7jka8ph4bqrv4fk0s/zoom_2.mp4?rlkey=k74pkysittxwgju7wf60jektl&dl=0)
- 27/01/2026: [4th class](https://www.dropbox.com/scl/fi/ph8xsp56ovglgx9gmkjgp/zoom_4.mp4?rlkey=843ds1fkoupume053uqx866bg&dl=0)
- 28/01/2026: [5th class](https://www.dropbox.com/scl/fi/glbkpf6bio8om2ja0e05d/zoom_5.mp4?rlkey=ilpq2xppy5bo8n37zbzy5u7iq&dl=0)
- 29/01/2026: [6th class](https://www.dropbox.com/scl/fi/ltneivppuf1nhza3wid4g/zoom_6.mp4?rlkey=w3y4pf2tqyh9hgcsks71pr1ed&dl=0)
- 30/01/2026: [7th class]()

### Programming examples
#### The "promotion" example
- [PromotionConcurrent](code/java/promotion/PromotionConcurrent.java)
- [Report](code/java/promotion/Report.java)
- [Print](code/java/promotion/print.java)
- [StaffMember](code/java/promotion/StaffMember.java)


{% endif %}
{% endfor %}
