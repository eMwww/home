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
<th style="width:60%; text-align:center"></th>
<th style="width:25%; text-align:center"></th>
</tr>
<tr>
 <td valign="top">
 <table><tr><td markdown="1">
   {% for n in site.data.icons %}[![](/home/images/{{ n.img }} "eM's {{ n.name }}"){: style="{{ n.style }}" }]({{ n.url }})
   {% endfor %}</td></tr>
   <tr><th style="width:25%; font-size:80%; text-align:left; background:#dddddd;">Contact</th></tr>
<tr>
<td valign="top" markdown="1">
<div style="font-size:70%; text-align:left;">
    Associate Professor
	<br/><a href="https://www.gssi.it">GSSI</a>
	<br/>67100 L'Aquila (Italy)
	<br/><img alt="office" src="/home/images/office.jpg" width="10%"  title="office"/>Viale Rendina, 28 Room P2-16
	<br/><b>Office Hours</b>: always keen to meet; just drop me an email to fix a meeting.
	<br/><a href="mailto:emiliodottuosto@gssi.it"><img alt="mail" src="/home/images/email.jpg" width="15%"  title="mail"/>email</a> ['.'/'dot']
	<br/><img alt="phone" src="/home/images/phone.png" width="10%" title="phone"/>+39 0862 428 0312
</div>
</td>
</tr>
</table>
 </td>
 <td valign="top">
 <table>
 <tr>
    <th class="ctx" width="80%" markdown="1">Recent talks (full list [here](https://emwww.github.io/home/talks))</th>
    <th class="ctx" width="20%">Highlights</th>
 </tr>
  <tr>
<td class="quicklinks" markdown="1">
{% assign items = site.data.talks %}
{% for n in items limit:4 %}
- [{{ n.venue }}]({{ n.slides }}) <span class="tooltip"><span class="tooltiptext">![](/home/slides/{{ n.cover }})</span>{% if n.descr %}{{ n.descr }}. {{ n.date | date: '%B %d, %Y' }}{% endif %}</span>{% endfor %}
</td>
<td class="quicklinks" markdown="1" valign="top">
{% assign items = site.data.highlights %}
{% for n in items %}
- [{{ n.name }}]({{ n.url }}) <span class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span>{{ n.pre }}</span>{{ n.post }}{% endfor %}
</td>
</tr>
<tr>
  <td colspan="2">
  <table>
<tr>
<th class="ctx" width="40%">Recent stuff</th>
<th class="ctx" width="35%">Projects</th>
<th class="ctx" width="30%">Tools</th>
</tr>
<tr>
<td class="quicklinks" valign="top" markdown="1"><!-- Recent stuff -->
{% assign items = site.data.current %}
{% for n in items %}
- <span class="tooltip"><span class="tooltiptext" style="margin-left:60%;">{% if n.authors %} with {{ n.authors }}{% endif %}{{ n.descr }}</span>{{ n.topic }}</span>{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1"><!-- Projects -->
- [DeLiCE: Decentralised Ledgers in Circular Economy]() <span class="tooltip"><span class="tooltiptext">PRIN PNRR</span></span>
- [BehAPI - Behavioural Application Program Interfaces](https://www.um.edu.mt/projects/behapi)<span class="tooltip"><span class="tooltiptext">Site leader and Work package leader (Marie Skłodowska-Curie Actions RISE, agreement No 778233, €742,500.00)</span> (1/3/2018 to-date)</span>
- [ASTRA - Advanced Space Technologies and Research Alliance]() <span class="tooltip"><span class="tooltiptext">SPOKE GSSI of the Innovation, digitalization and sustainability for the diffused economy in Central Italy - VITALITY. Task leader of the WP2, PNRR ECS_00000041 (Missione 4 Componente 2 Investimento 1.5, €~10M of which ~2M for WP2)</span> (11/10/2022 to-date)</span>
- Involvement in [past projects](old_projects)
</td>
<td class="quicklinks" valign="top" markdown="1"><!-- Tools -->
- <span class="tooltip"><span class="tooltiptext">Tool-chain for choreographic development</span>[ChorGram](https://bitbucket.org/eMgssi/stable_chorgram/wiki/Home)</span>
- <span class="tooltip"><span class="tooltiptext">An extension of [ChorGram](https://bitbucket.org/eMgssi/stable_chorgram/wiki/Home) for QoS analysis</span><span>[MoCheQoS](https://bitbucket.org/aemartinez/chorgram/src/mocheqos-tacas2024/wiki/Home.md)</span>
- <span class="tooltip"><span class="tooltiptext">Partition refinement for history-dependent automata</span>[MIHDA](tools/mihda.tgz)</span>
- <span class="tooltip"><span class="tooltiptext">An ad-hoc model checker for security protocols </span>[ASPASYA](tools/aspasya.html) and [H-ASPASYA](tools/h-aspasya.html)</span>
</td>
</tr>
</table>
</td>
</tr>
<tr>
 <th class="ctx" style="width:30%;">Events</th>
 <th class="ctx" style="width:35%;">Fun & not so fun stuff</th>
</tr>
<tr>
<td valign="top"> <!-- Events -->
<div class="fun" markdown="1">
{% assign sorted = site.data.events | sort: 'deadline' | reverse %}
{% for n in sorted %}
- [{{ n.name }}]({{ n.url }}) {% if n.deadline %}`(deadline: {{ n.deadline }})`{: style="font-size:6pt"}{% endif %}{% endfor %}
</div>
</td>
<td valign="top"> <!-- Fun stuff -->
<div class="fun" markdown="1">
{% for n in site.data.fun %}
- <span class="tooltip"><span class="tooltiptext">{{ n.tooltip }}</span>[{{ n.name }}]({{ n.url }}) </span>{% endfor %}
</div>
</td>
</tr>
</table>
</td>
<td class="latest" valign="top">
<table>
<tr><th class="ctx">Latest from eM</th></tr>
<tr><td><div class="scroll" markdown="1">
<li style="opacity:.5;">
{% assign items = site.data.news %}
{% for n in items %}
{% if forloop.index <= 10 %}<b>{{ n.date | date: '%B %d, %Y' }}</b>: {{ n.descr }} {% if n.url %} see [{{ n.url }}](here) {% endif %}
{% else %} {% break %} {% endif%}<hr>{% endfor %}
</li>
</div></td></tr>
</table>
</td>
</tr>
</table>

[comment]: <> (Keywords: Formal methods, behavioural specifications, choreographies, models of concurrency and distributions)
