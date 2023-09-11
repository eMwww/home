---
layout: default
content: true
home: true
---

<!-- ## ![Fully funded Ph.D. scholarship](images/news.jpeg){:height="20px" width="20px"} -->
<!-- Contact me if you're interested in doing a PhD in the Italian National school in Blockchain and Distributed Ledger Technology. To be advertised soon. -->
<!-- (MSc degree required) -->
<!-- More details at [https://cysec2022.imtlucca.it/](https://cysec2022.imtlucca.it/).  -->

<!--
Emoji stuff at
https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md
https://www.fabriziomusacchio.com/blog/2021-08-16-emojis_for_Jekyll/#github-custom-emoji 
-->

<table>
  <tr>
    <th style="width:15%; text-align:left"></th>
    <th style="width:85%; text-align:center"></th>
  </tr>
 <tr>
 <td valign="center" rowspan="2" markdown="1">
   {% for n in site.data.icons %}
[![](/home/images/{{ n.img }} "eM's {{ n.name }}"){: style="{{ n.style }}" }]({{ n.url }}){% endfor %}
 </td>
 <td>
 <table>
  <tr>
    <th style="width:25%; background:#dddddd; text-align:left">Highlights</th>
    <th style="width:60; background:#dddddd; text-align:left" markdown="1">Recent talks (full list [here](talks))</th>
    <th style="width:25%; background:#dddddd; text-align:left">Latest</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.highlights %}
{% for n in items %}
- [{{ n.name }}]({{ n.url }}) <span class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span>{{ n.pre }}</span>{{ n.post }}{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.talks %}
{% for n in items limit:4 %}
- [{{ n.venue }}]({{ n.slides }}) <span class="tooltip"><span class="tooltiptext">![](/home/slides/{{ n.cover }})</span>{% if n.descr %}{{ n.descr }}. {{ n.date | date: '%B %d, %Y' }}{% endif %}</span>{% endfor %}
</td>
<td class="latest" rowspan="2">
<div class="scroll" markdown="1">
<li>
{% assign items = site.data.news %}
{% for n in items %}
{% if forloop.index <= 10 %}<b>{{ n.date | date: '%B %d, %Y' }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}
{% else %} {% break %} {% endif%}<hr>{% endfor %}</li></div>
<p class="news" markdown="1">![news](images/news.jpeg)We are recruiting at all levels, if interested send us your [expression of interest](https://cs.gssi.it/emilio.tuosto/slides/eoi.txt)!</p>
  </td>
  </tr>
  <tr>
  <td colspan="2"> 
<table>
  <tr>
    <th style="width:25%; text-align:left; background:#dddddd;">Contact</th>
    <th style="width:30%; text-align:left; background:#dddddd;">Events</th>
    <th style="width:45%; text-align:left; background:#dddddd;">Fun & not so fun stuff</th>
  </tr>
  <tr>
    <td valign="top" style="padding-right: 50px;" markdown="1">
<div style="font-size:70%">
    Associate Professor
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Via Rendina
	<br/>67100 L'Aquila (Italy)
	<br/><img alt="office" src="/home/images/office.jpg" width="10%"  title="office"/>P2-16
	<br/><b>Office Hours</b>: always keen to meet; just drop me an email to fix a meeting.
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="mail" src="/home/images/email.jpg" width="20%"  title="mail"/>email</a> ['.'/'dot']
	<br/><img alt="phone" src="/home/images/phone.png" width="10%" title="phone"/>+39 0862 428 0312
</div>
</td>
<td valign="top">
<div class="fun" markdown="1">
{% for n in site.data.events %}
- [{{ n.name }}]({{ n.url }}) {% if n.deadline %}`(deadline: {{ n.deadline }})`{: style="font-size:6pt"}{% endif %}{% endfor %}
</div>
</td>
<td valign="top">
<div class="fun" markdown="1">
{% for n in site.data.fun %}
- <span class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span>[{{ n.name }}]({{ n.url }})</span>{% endfor %}
</div>
</td>
</tr>
</table>
  </td>
  </tr>
</table>
</td>
</tr>
</table>

[comment]: <> (Keywords: Formal methods, behavioural specifications, choreographies, models of concurrency and distributions)
