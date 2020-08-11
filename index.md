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
    <th style="width:30; background:#dddddd; text-align:left">Details</th>
    <th style="width:50%; background:#dddddd; text-align:center">Quick links</th>
    <th style="width:20%; text-align:center"></th>
  </tr>
  <tr>
  <td valign="top">
    Associate Professor
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
<td>
</td>
  </tr>
</table>
 </td>
 </tr>
 </table>

### Fun stuff
<table>
  <tr>
    <th style="width:50%; text-align:center"></th>
    <th style="width:30%; text-align:center"></th>
  </tr>
  <tr>
    <td>
<marquee behavior="scroll" direction="left" width="100%" height="150px" vspace="0px" scrolldelay="2" SCROLLAMOUNT="2">
<div markdown="1" class="mkd">
* Globalisation and research...[be careful](http://www.sciencedirect.com/science/article/pii/S0140673614607972)
* Italian research is [not so bad](https://medium.com/@alfonsofuggetta/b5ab6eb2ecd0) after all
* This [video](https://www.youtube.com/watch?v=zDZFcDGpL4U) is somehow related to research
* Having [fun with regex](http://regexcrossword.com)
* [Frustrated authors](http://eloquentscience.com/wp-content/uploads/2012/02/Frustrated_author.pdf)
* Another one about [peer reviewing](http://www.sigmod.org/publications/sigmod-record/0812/p100.open.cormode.pdf)...
* Lectures on Marx's [Capital V. 1](https://goo.gl/TNRzO6) by David Harvey
</div>
</marquee>
    </td>
    <td>
<div>
<marquee behavior="scroll" direction="up" width="100%" height="50px" vspace="0px" scrolldelay="2" SCROLLAMOUNT="2">
	    August 2020:
		  <br/>
		  Deserved break; if you email me, I may not answer.
		  If your live depends on my reply, you should seriuosly
		  revise your life-style.
		  <hr>
		  <!-- Tuesday 30 September 2014: -->
		  <!-- <br/> -->
		  <!-- enjoying popl 2015's notification :) -->
		  <!-- <hr> -->
</marquee>
</div>
    </td>
    </tr>
</table>
