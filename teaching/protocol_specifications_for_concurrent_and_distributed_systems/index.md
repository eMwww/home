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

Topic: Protocol Specifications for Concurrent and Distributed Systems (Prof. Nobuko Yoshida) (N. Yoshida)

Time: Jun 3, 2024 10:00 AM Rome

        Every day, until Jun 9, 2024, 7 occurrence(s)

        Jun 3, 2024 10:00 AM

        Jun 4, 2024 10:00 AM

        Jun 5, 2024 10:00 AM

        Jun 6, 2024 10:00 AM

        Jun 7, 2024 10:00 AM

        Jun 8, 2024 10:00 AM

        Jun 9, 2024 10:00 AM

Please download and import the following iCalendar (.ics) files to your calendar system.

Daily: https://us02web.zoom.us/meeting/tZwsdeGspzsvEtLv7iS6vmFBh8tYmGfD9dh1/ics?icsToken=98tyKuGgrzkiHt2VtRGBRpw-BYjoWejxmGJYj7dxikjsMHZFbyXUPrpWC79YFvyJ



Join Zoom Meeting

https://us02web.zoom.us/j/88128490586?pwd=M3RuK1ZWWS85TzhLc1FYY2g4YmdFZz09



Meeting ID: 881 2849 0586

Passcode: 909330



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
