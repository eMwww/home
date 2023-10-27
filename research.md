---
layout: default
content: true
---

<table style="font-size:80%">
<tr>
<th style="width:20%; background:#dddddd; text-align:left">In brief</th>
<th style="width:50%; background:#dddddd; text-align:left">Editorial activities</th>
<th style="width:0%3; background:#dddddd; text-align:left">eM's PhD students</th>
</tr>
<tr>
<td valign="top" markdown="1"><!-- Projects -->
My key scientific contributions are in the area of formal abstractions for distributed systems where, in the past years, I have developed formal frameworks based on choreographic approaches. In this area, I have contributed fundamental results in the directions listed below:

- Design-by-contract for message passing systems
- Bottom-up approaches
- Abstract semantics model
- Choreographic support to local-first software
<table>
<tr>
<th style="background:#dddddd; text-align:left" markdown="1">Some papers (full list at [![dblp](images/dblp.png "DBLP"){: style="width:15%"}](http://www.informatik.uni-trier.de/~ley/pers/hd/t/Tuosto:Emilio.html))</th>
</tr>
<tr>
<td colspan="3" valign="top" markdown="1"><!-- Papers -->
{% assign items = site.data.drafts %}
{% for n in items limit:5 %}
- <span class="tooltip"><span class="tooltiptext">with {{ n.author }}.<br/>{{ n.descr }}</span>{{ n.title }}</span>
<span style="font-size:75%; markdown=1;">{% if n.venue %}{{ n.venue }}.{% endif %}{% if n.printed %}{{ n.printed }}.{% endif %}
{% if n.draft %}Submitted at {{ n.draft }}.{% endif %}{% if n.url %} Available [here]({{ n.url }}) {% endif %}</span>{% endfor %}
- More stuff [here](publications)
</td>
</tr>
</table>
</td>
<td valign="top" markdown="1">
Editorial boards

- [Journal of Logical and Algebraic Methods in Computer Science](https://www.journals.elsevier.com/journal-of-logical-and-algebraic-methods-in-programming)  
  [Special Issue Editor and member of the editorial board](https://www.sciencedirect.com/journal/journal-of-logical-and-algebraic-methods-in-programming/about/editorial-board)
  from 15/09/2021 to-date
- [Frontiers in Computer Science](https://www.frontiersin.org/journals/computer-science)  
  [Associate editor (Theoretical Computer Science)](https://www.frontiersin.org/journals/computer-science/sections/theoretical-computer-science#editorial-board)
  from 25/11/2020 "to-date"


Edited volumes:
{% assign items = site.data.volumes | sort: 'date' | reverse %}
{% for n in items %}
- [{{ n.vol }}{{ n.year }}]({{ n.url }}) {{ n.descr }}
{% endfor %}
</td>
<td valign="top" markdown="1"><!-- phd students -->
{% for n in site.data.phd %}
- {{ n.name }} {% if n.viva %} _(viva held in {{ n.viva }})_{: style="font-size:10pt" } {% else %} _(current student)_{: style="font-size:10pt" }{% endif %}{% if n.note %}<br/>{{ n.note }}{% endif %}{% endfor %}
<table>
<tr>
<th style="background:#dddddd; text-align:left">Suggested readings for MSc/PhD students</th>
</tr>
<tr>
<td valign="top" markdown="1"><!-- Readings -->
- Alfred Tarski. *Introduction to logic and to the methodology of deductive sciences*. OUP.
- Graham Priest. *Logic: A Very Short Introduction*. OUP.
- Douglas R. Hofstadter. *Gödel, Escher, Bach: An Eternal Golden Braid*. Basic Books 1999 (First published in 1979).
- Strunk & White. *The Elements of Style*. Allyn & Bacon (1999)
</td>
</tr>
</table>
</td>
</tr>
<tr>
<th style="background:#dddddd; text-align:left">Steereing Committes</th>
<th style="background:#dddddd; text-align:left" markdown="1">Programme Committees (recent ones; the full list is [here](pc))</th>
<th style="background:#dddddd; text-align:left">Recruiting and hiring panels</th>
</tr>
<tr>
<td valign="top" span markdown="1">
{% assign items = site.data.sc | sort: 'date' | reverse %}
{% for n in items %}
- {{ n.sc }}
  ({% if n.url %}[{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}]({{ n.url }}), {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}
</td>
<td markdown="1">
{% assign items = site.data.pc | sort: 'date' | reverse %}
{% for n in items limit:10 %}
- {% if n.pc %} {{ n.pc }} {% endif %}{% if n.oc %}
  organising committee {{ n.oc }}
  {% endif %}({% if n.url %}[{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}]({{ n.url }}), {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}
</td>
<td valign="top" markdown="1">
{% assign items = site.data.recruitment %}
{% for n in items %}
- {{ n.date }}: {{ n.role }} of the committee for {% if n.viva %} PhD viva defense of {{ n.viva }} - {{ n.institution }} {% else %} {{ n.event }} at the {{ n.institution }} {% endif %}{% endfor %}
</td>
</tr>
<tr>
<th colspan="3" style="background:#dddddd; text-align:left">PhD examination</th>
</tr>
<tr>
<td colspan="3" valign="top" markdown="1">
I have been the internal examiner of more than 5 PhD students at the University of Leicester and I have been the external examiner or on the evaluation committees of the following viva:
{% assign items = site.data.examiner %}
{% for n in items %}
- **{% if n.viva %}{{ n.viva }}{% else %}{{ n.name }}{% endif %}** _{{ n.title }}_, {{ n.institution }}
({{ n.date }}, {% if n.viva %}{{ n.role }} of the committee{% else %} external examiner{% endif %}){% endfor %}
</td>
</tr>
</table>










