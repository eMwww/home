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
    <th style="width:30%; background:#dddddd; text-align:center">Some news about me</th>
    <th style="width:20%; background:#dddddd; text-align:left">Details</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.links %}
{% for n in items %}
- {{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}{% endfor %}
</td>
<td class="mkd" valign="top" markdown="1">
{% assign items = site.data.news | reverse %}
<!-- <marquee behavior="scroll" direction="up" width="100%" height="150px" vspace="0px" scrolldelay="180" SCROLLAMOUNT="6"> -->
{% for n in items %}
<b>{{ n.date }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}
<hr>{% endfor %}
<!-- </marquee> -->
</td>
<td class="mkd" valign="top">
    Associate Professor
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Viale F. Crispi, 7
	<br/>67100 L'Aquila (Italy)
	<br/>Office: Palazzo Mariani P1-N
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="me" src="/home/email.jpg" width="25%" /></a> (replace 'dot' with '.')
  </td>
  </tr>
</table>
 </td>
 </tr>
 </table>

<!-- <marquee behavior="scroll" direction="left" width="100%" height="150px" vspace="0px" scrolldelay="200" SCROLLAMOUNT="10"> -->
### Fun stuff
<div markdown="1" class="fun">
* Globalisation and research...[be careful](http://www.sciencedirect.com/science/article/pii/S0140673614607972)
* Italian research is [not so bad](https://medium.com/@alfonsofuggetta/b5ab6eb2ecd0) after all
* This [video](https://www.youtube.com/watch?v=zDZFcDGpL4U) is somehow related to research
* Having [fun with regex](http://regexcrossword.com)
* [Frustrated authors](http://eloquentscience.com/wp-content/uploads/2012/02/Frustrated_author.pdf)
* Another one about [peer reviewing](http://www.sigmod.org/publications/sigmod-record/0812/p100.open.cormode.pdf)...
* Lectures on Marx's [Capital V. 1](https://goo.gl/TNRzO6) by David Harvey
</div>
<!-- </marquee> -->
