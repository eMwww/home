---
layout: default
content: true
home: true
---


## ![Fully funded Ph.D. scholarship](images/news.jpeg){:height="20px" width="20px"}
Contact me if you're interested in doing a PhD in the Italian National school in Blockchain and Distributed Ledger Technology. To be advertised soon.
(MSc degree required)
<!-- More details at [https://cysec2022.imtlucca.it/](https://cysec2022.imtlucca.it/).  -->
<!-- ## ![news](images/news.jpeg){:height="20px" width="20px"} Covid-19: please sign [this petition](https://noprofitonpandemic.eu/) -->

<table>
  <tr>
    <th style="width:15%; text-align:left"></th>
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
    <th style="width:20%; background:#dddddd; text-align:left">Highlights</th>
    <th style="width:65; background:#dddddd; text-align:left">Recent talks</th>
    <th style="width:15%; background:#dddddd; text-align:left">Contact</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.links %}
{% for n in items %}
- {{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.talks %}
{% for n in items limit:5 %}
- [{{ n.venue }}]({{ n.slides }}) {% if n.descr %}{{ n.descr }}. {{ n.date  | date: '%B %d, %Y' }}.{% endif %}{% endfor %}
</td>
<td class="details" valign="top">
    Associate Professor
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

<!-- ## Teaching -->
<!-- I usually teach -->
<!-- - Modelling and Verification of Reactive Systems -->
<!-- - Formal Behavioural Specifications -->

<table>
  <tr>
    <th style="width:20%; text-align:left"></th>
    <th style="width:35%; text-align:left"></th>
    <th style="width:45%; text-align:left"></th>
  </tr>
  <tr>
    <td valign="top" style="padding-right: 50px;" markdown="1">
### Latest
<div class="scroll" markdown="1">
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
<div class="fun" style="font-size:.8em;" markdown="1">
{% assign items = site.data.events %}
{% for n in items %}
[{{ n.name }}]({{ n.url }}) {% if n.deadline %}`(deadline: {{ n.deadline }})`{: style="font-size:4pt"}{% endif %}<br/>{% endfor %}
</div>
</td>
<td valign="top" markdown="1">
### Fun & not so fun stuff
<div class="fun" style="font-size:.8em;" markdown="1">
{% assign items = site.data.fun %}
{% for n in items %}
{{ n.item }}
{% endfor %}
</div>
</td>
</tr>
</table>

[comment]: <> (Keywords: Formal methods, behavioural specifications, choreographies, models of concurrency and distributions)
