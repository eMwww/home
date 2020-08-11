---
layout: default
content: true
home: true
---

# {{ site.title }}. Welcome!
(under construction...bear with me)
<br/>
 <table>
  <tr>
    <th style="width:15%; text-align:left"></th>
    <th style="width:85; text-align:center"></th>
  </tr>
 <tr>
 <td>
     <img alt="me" src="/home/me.jpg" width="85%" />
 </td>
 <td>
 <table>
  <tr>
    <th style="width:35%; background:#dddddd; text-align:left">Details</th>
    <th style="width:60%; background:#dddddd; text-align:center">Quick links</th>
  </tr>
  <tr>
  <td valign="top">
    Associate Professor in <a href="http://cs.gssi.it">Computer Science</a>
	<br/><a href="https://www.gssi.it">Gran Sasso Science Institute</a>
	<br/>Viale F. Crispi, 7
	<br/>67100 L'Aquila (Italy)
	<br/>Office: Palazzo Mariani P1-N
	<br/>email: <a href="mailto:emiliodottuosto@gssi.it">email</a> (replace 'dot' with '.')
  </td>
  <td class="mkd" valign="top" markdown="1">
{% assign items = site.data.links %}
{% for n in items %}
- {{ n.pre }} [{{ n.name }}]({{ n.url }}) {{ n.post }}{% endfor %}
</td>
  </tr>
</table>
 </td>
 </tr>
 </table>

### Fun stuff
<div markdown="1" class="mkd">
* Globalisation and research...[be careful](http://www.sciencedirect.com/science/article/pii/S0140673614607972)
* Italian research is [not so bad](https://medium.com/@alfonsofuggetta/b5ab6eb2ecd0) after all
* This [video](https://www.youtube.com/watch?v=zDZFcDGpL4U) is somehow related to research
* Having [fun with regex](http://regexcrossword.com)
* [Frustrated authors](http://eloquentscience.com/wp-content/uploads/2012/02/Frustrated_author.pdf)
* Another one about [peer reviewing](http://www.sigmod.org/publications/sigmod-record/0812/p100.open.cormode.pdf)...
* Lectures on Marx's [Capital V. 1](https://goo.gl/TNRzO6) by David Harvey
</div>
