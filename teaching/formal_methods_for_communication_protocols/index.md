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

All the slides in a single [file](all.pdf)

Further readings:

- [BTBS26] Khalid Bourr, Francesco Tiezzi, Lorenzo Bettini, and Stefano Seriani. Translating bpmn models into x-klaim programs for developing multi-robot missions. International Journal on Software Tools for Technology Transfer, pages 1433–2787, January 2026.
- [CG89] Nicholas Carriero and David Gelernter. Linda in context. Communications of the ACM, 32(4):444–458, April 1989.
- [Eck02]Bruce Eckel. Thinking in Java, 4rd Edition. Prentice-Hall, December 2002. Chapter 13. The beta version of the 3rd edition is available at [http://www.javaclue.org/pub/java/ebooks/tij/tij-3rd-ed.pdf](http://www.javaclue.org/pub/java/ebooks/tij/tij-3rd-ed.pdf).
- [FG96] Cedric Fournet and George Gonthier. The reflexive CHAM and the join-calculus. In Conference Record of POPL ’96: The 23rd ACM SIGPLAN-SIGACT Symposium on Principles of Programming Languages, pages 372–385, St. Petersburg Beach, Florida, January 1996.
- [HHM+ 24a] Philipp Haller, Ayman Hussein, Hernán C. Melgratti, Alceste Scalas, and Emilio Tuosto. Fair join pattern matching for actors. 35 / 35In Jonathan Aldrich and Guido Salvaneschi, editors, 38th European Conference on Object-Oriented Programming, ECOOP 2024, Vienna, Austria, September 16-20, 2024, volume 313 of LIPIcs, pages 17:1–17:28. Schloss Dagstuhl - Leibniz-Zentrum für Informatik, 2024.
- [HHM+ 24b] Philipp Haller, Ayman Hussein, Hernán C. Melgratti, Alceste Scalas, and Emilio Tuosto. Fair join pattern matching for actors (artifact). Dagstuhl Artifacts Ser., 10(2):8:1–8:3, 2024.
- [Tro94] John A. Trono. A new exercise in concurrency. SIGCSE Bull., 26(3):8–10, September 1994.

### Zoom recordings:
- 21/01/2026: [1st class](https://www.dropbox.com/scl/fi/a165ue2kv4ekso7xz8p35/zoom_1.mp4?rlkey=5szv1zpqfsuzvzzh4aynclyy3&dl=0)
- 22/01/2026: [2nd class](https://www.dropbox.com/scl/fi/0v3r7jka8ph4bqrv4fk0s/zoom_2.mp4?rlkey=k74pkysittxwgju7wf60jektl&dl=0)
- 26/01/2026: [3rd class](https://www.dropbox.com/scl/fi/0v3r7jka8ph4bqrv4fk0s/zoom_2.mp4?rlkey=k74pkysittxwgju7wf60jektl&dl=0)
- 27/01/2026: [4th class](https://www.dropbox.com/scl/fi/ph8xsp56ovglgx9gmkjgp/zoom_4.mp4?rlkey=843ds1fkoupume053uqx866bg&dl=0)
- 28/01/2026: [5th class](https://www.dropbox.com/scl/fi/glbkpf6bio8om2ja0e05d/zoom_5.mp4?rlkey=ilpq2xppy5bo8n37zbzy5u7iq&dl=0)
- 29/01/2026: [6th class](https://www.dropbox.com/scl/fi/ltneivppuf1nhza3wid4g/zoom_6.mp4?rlkey=w3y4pf2tqyh9hgcsks71pr1ed&dl=0)
- 30/01/2026: [7th class](https://www.dropbox.com/scl/fi/91dzoj5cq8a1q4px50cam/zoom_7.mp4?rlkey=ezmpuues5t5zhr0dfbdbntq8g&dl=0)

### Programming examples
#### The "promotion" example
- [PromotionConcurrent](code/java/promotion/PromotionConcurrent.java)
- [Report](code/java/promotion/Report.java)
- [Print](code/java/promotion/print.java)
- [StaffMember](code/java/promotion/StaffMember.java)


### Projects

#### Project 1: 
In [1,2] the smart house scenario described in [3] has been used as a case study for the analysis of the fair join pattern mechanism implemented in the Scala library described in the course. 
Give a realisation of the smart house scenario in XKlaim and one in Erlang, compare your solutions with the one described in [1], and analyse how the different models of distribution and concurrency compare with each other.

Explore the possibility of letting XKlaim processes and Erlang's actor interact with each other.

[1] [Philipp Haller, Ayman Hussein, Hernán Melgratti, Alceste Scalas, Emilio Tuosto. Fair Join Pattern Matching for Actors. ECOOP 2024. ](https://drops.dagstuhl.de/entities/document/10.4230/LIPIcs.ECOOP.2024.17)

[2] [Philipp Haller, Ayman Hussein, Hernán Melgratti, Alceste Scalas, Emilio Tuosto. Fair Join Pattern Matching for Actors. Artefact at ECOOP 2024](https://drops.dagstuhl.de/entities/document/10.4230/DARTS.10.2.8)

[3] Humberto Rodríguez-Avila, Joeri De Koster, and Wolfgang De Meuter. Advanced join patterns for the actor model based on CEP techniques. Art Sci. Eng. Program., 5(2):10, 2021. doi:10.22152/programming-journal.org/2021/5/10.




#### Project 2:
Implement in XKlaim and in Erlang the following features of Go:

- synchronous and asynchronous communication
- channel mobility
- close operation

You can assume that only basic types such numerals, strings, booleans, etc. and channels can be exchanged in the communication of your encoding.
 


#### Guidelines, instructions, and deadlines
- Form two groups according to your preferences (groups' size should be at least 2) and chose one of the projects below
- The groups should work on different projects 
- Besides the addressing the assignement, you can include aspects of your interest (e.g., testing your solution)
- The exam consists of 
  - a short report (2-3 pages) discussing salient aspects of your solutions and explaining the approach you followed
  - a presentation
- You can use LLMs; if you do so, the report should describe how LLMs were used and give a critical assessment of their adoption
- Deadlines:
  - report: April 28, 2026 (email emilio.tuosto@gssi.it and rocco.denicola@imtlucca.it)
  - presentation: April 29, 2026 (venue and times will  be communicated in due course)

{% endif %}
{% endfor %}
 guidelines and instructions for the
