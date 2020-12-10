---
layout: default
content: true
home: true
---

# {{ site.title }}. Welcome!

## ![news](images/news.jpeg){:height="36px" width="36px"} Hiring: 2-years Post-doc position at [GSSI](www.gssi.it)
We're scouting for a postdoc funded by the [It-Matters](itmatters.imtlucca.it) project and will soon be advertised.
If interested, get in touch with [Luca Aceto](mailto:luca.aceto@gssi.it), or with [Omar Inverso](mailto:omar.inverso@gssi.it), or else with me.

<table>
  <tr>
    <th style="width:15; text-align:left"></th>
    <th style="width:85%; text-align:center"></th>
  </tr>
 <tr>
 <td>
 <div>
     <img alt="me" src="/home/images/me.jpg" width="85%" />
 </div>
 </td>
 <td>
 <table>
  <tr>
    <th style="width:40%; background:#dddddd; text-align:center">Highlights</th>
    <th style="width:40%; background:#dddddd; text-align:center">Recent talks</th>
    <th style="width:20%; background:#dddddd; text-align:left">Details</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.links %}
{% for n in items %}
- {{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}{% endfor %}
</td>
<td class="mkd" valign="top" markdown="1">
{% assign items = site.data.talks %}
{% for n in items %}
- <span class="tooltip">[{{ n.venue }}]({{ n.slides }}) {{ n.date  | date: '%B %d, %Y' }}
  <span class="tooltiptext">{% if n.descr %}{{ n.descr }}.{% endif %}</span></span>{% endfor %}
</td>
<td class="mkd" valign="top">
    <br/>Associate Professor
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Viale F. Crispi, 7
	<br/>67100 L'Aquila (Italy)
	<br/><img alt="me" src="/home/images/office.jpg" width="10%" />Office: Palazzo Mariani P1-N
	<br/><b>Office Hours</b>: always keen to meet; just drop me an email to fix a meeting.
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="me" src="/home/images/email.jpg" width="20%" />email</a> ['.'/'dot']
	<br/><img alt="me" src="/home/images/phone.png" width="10%" />+39 0862 428 0312
  </td>
  </tr>
</table>
 </td>
 </tr>
 </table>


## Ongoing teaching
- About to introduce a few core modules for next term
- Immigration course on FM: the material is on 'classroom'

<table>
  <tr>
    <th style="width:20%; text-align:left"></th>
    <th style="width:35%; text-align:left"></th>
    <th style="width:45%; text-align:left"></th>
  </tr>
  <tr>
    <td valign="top" markdown="1" style="padding-right: 50px;">
### News about eM
<div markdown="1" class="scroll">
<li>{% assign items = site.data.news %}
{% for n in items %}
{% if forloop.index <= 10 %}<b>{{ n.date | date: '%B %d, %Y' }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}<hr>
{% else %} {% break %} {% endif%}
{% endfor %}
</li>
</div>
</td>
<td valign="top" markdown="1">
### Events
<div markdown="1" class="fun">
{% assign items = site.data.events %}
{% for n in items %} * [`{{ n.name }}`{: style="font-size:8pt" }]({{ n.url }}) {% if n.deadline %}`(deadline: {{ n.deadline }})`{: style="font-size:4pt"} {% endif %}
{% endfor %}
</div>
</td>
<td valign="top" markdown="1">
### Fun & not so fun stuff
<div markdown="1" class="fun">
{% assign items = site.data.fun %}
{% for n in items %} * <span style="font-size:8pt">{{ n.item }}</span>
{% endfor %}
</div>
</td>
</tr>
</table>

[comment]: <> (Keywords: Formal methods, behavioural specifications, choreographies, models of concurrency and distributions)
