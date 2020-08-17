---
layout: default
content: true
home: true
---

# {{ site.title }}. Welcome!
 <table>
  <tr>
    <th style="width:15; text-align:left"></th>
    <th style="width:85%; text-align:center"></th>
  </tr>
 <tr>
 <td>
 <div>
     <img alt="me" src="/home/me.jpg" width="85%" />
 </div>
 </td>
 <td>
 <table>
  <tr>
    <th style="width:50%; background:#dddddd; text-align:center">Quick links</th>
    <th style="width:30%; background:#dddddd; text-align:center">Events</th>
    <th style="width:20%; background:#dddddd; text-align:left">Details</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.links %}
{% for n in items %}
- {{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}{% endfor %}
</td>
<td class="mkd" valign="top" markdown="1">
{% assign items = site.data.events %}
{% for n in items %}
- [{{ n.name }}](n.url){% endfor %}
</td>
<td class="mkd" valign="top">
    <br/>Associate Professor
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Viale F. Crispi, 7
	<br/>67100 L'Aquila (Italy)
	<br/><img alt="me" src="/home/images/office.jpg" width="10%" />Office: Palazzo Mariani P1-N
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="me" src="/home/images/email.jpg" width="20%" />email</a> ['.'/'dot']
	<br/><img alt="me" src="/home/images/phone.png" width="10%" />+39 0862 428 0312
  </td>
  </tr>
</table>
 </td>
 </tr>
 </table>

<table>
  <tr>
    <th style="width:38%; text-align:left"></th>
    <th style="width:62%; text-align:left"></th>
  </tr>
  <tr>
    <td valign="top" markdown="1" style="padding-right: 50px;">
## News about eM
<div markdown="1" class="scroll">
<li>{% assign items = site.data.news %}
{% for n in items %}
{% if forloop.index <= 10 %}<b>{{ n.date }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}<hr>
{% else %} {% break %} {% endif%}
{% endfor %}
</li>
</div>
</td>
<td valign="top" markdown="1">## Fun stuff
<div markdown="1" class="fun">
* Globalisation and research...[be careful](http://www.sciencedirect.com/science/article/pii/S0140673614607972)
* Italian research is [not so bad](https://medium.com/@alfonsofuggetta/b5ab6eb2ecd0) after all
* This [video](https://www.youtube.com/watch?v=zDZFcDGpL4U) is somehow related to research
* Having [fun with regex](http://regexcrossword.com)
* [Frustrated authors](http://eloquentscience.com/wp-content/uploads/2012/02/Frustrated_author.pdf)
* Another one about [peer reviewing](http://www.sigmod.org/publications/sigmod-record/0812/p100.open.cormode.pdf)...
* Lectures on Marx's [Capital V. 1](https://goo.gl/TNRzO6) by David Harvey
</div>
</td>
</tr>
</table>

[comment]: <> (Keywords: Formal methods, behavioural specifications, choreographies, models of concurrency and distributions)
