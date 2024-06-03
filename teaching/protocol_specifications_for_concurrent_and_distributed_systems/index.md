---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign courses = site.data.courses | where: "title", "Protocol Specifications for Concurrent and Distributed Systems" %}
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
<div>

Join Zoom Meeting
</br>

<a>https://us02web.zoom.us/j/88128490586?pwd=M3RuK1ZWWS85TzhLc1FYY2g4YmdFZz09</a>
</br>

Meeting ID: 881 2849 0586
</br>
Passcode: 909330
</br>

---



One tap mobile

+3902124128823,,88128490586#,,,,*909330# Italy

+390694806488,,88128490586#,,,,*909330# Italy



---



Dial by your location

• +39 021 241 28 823 Italy

• +39 069 480 6488 Italy

• +39 020 066 7245 Italy



Meeting ID: 881 2849 0586

Passcode: 909330



Find your local number: https://us02web.zoom.us/u/kee21yil3g
</div>
{% endif %}
{% endfor %}
