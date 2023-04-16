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
 <td valign="top">
 <div>
     <img alt="me" src="/home/images/me.jpg" width="85%" title="eM"/>
 </div>
 </td>
 <td>
 <table>
  <tr>
    <th style="width:25%; background:#dddddd; text-align:left">Highlights</th>
    <th style="width:60; background:#dddddd; text-align:left">Recent talks</th>
    <th style="width:25%; background:#dddddd; text-align:left">Latest</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.highlights %}
{% for n in items %}
- <span class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span>{{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}</span>{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.talks %}
{% for n in items limit:5 %}
- <span class="tooltip"><span class="tooltiptext">![](/home/slides/{{ n.cover }})</span>
[{{ n.venue }}]({{ n.slides }}) {% if n.descr %}{{ n.descr }}. {{ n.date  | date: '%B %d, %Y' }}
{% endif %}</span>{% endfor %}
</td>
<td class="latest" valign="top" rowspan="2" markdown="1">
<p class="news" markdown="1">![news](images/news.jpeg)We started to recruit at all levels, if interested send us your [expression of interest](https://cs.gssi.it/emilio.tuosto/slides/eoi.txt)!</p>
<p class="news" markdown="1">![news](images/news.jpeg)10 (ten!) PhD Scholarships in Computer Science + benefits! [Details here](https://www.gssi.it/albo-ufficiale-online-gssi/item/download/4164_c550280ade939db61570a29ef700f63e)</p>
<div class="scroll" markdown="1">
<li>{% assign items = site.data.news %}
{% for n in items %}
{% if forloop.index <= 10 %}<b>{{ n.date | date: '%B %d, %Y' }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}<hr>
{% else %} {% break %} {% endif%}
{% endfor %}
</li>
</div>
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
<div style="font-size:80%">
    Associate Professor
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Viale F. Crispi, 7
	<br/>67100 L'Aquila (Italy)
	<br/><img alt="office" src="/home/images/office.jpg" width="10%"  title="office"/>Palazzo Mariani P1-N
	<br/><b>Office Hours</b>: always keen to meet; just drop me an email to fix a meeting.
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="mail" src="/home/images/email.jpg" width="20%"  title="mail"/>email</a> ['.'/'dot']
	<br/><img alt="phone" src="/home/images/phone.png" width="10%" title="phone"/>+39 0862 428 0312
</div>
</td>
<td valign="top" markdown="1">
<div class="fun" markdown="1">
{% assign items = site.data.events %}
{% for n in items %}
- [{{ n.name }}]({{ n.url }}) {% if n.deadline %}`(deadline: {{ n.deadline }})`{: style="font-size:6pt"}{% endif %}<br/>{% endfor %}
</div>
</td>
<td valign="top" markdown="1">
<div class="fun" markdown="1">
{% assign items = site.data.fun %}
{% for n in items %}
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
