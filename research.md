---
layout: default
content: true
---

<table>
<tr>
<th style="width:35%; background:#dddddd; text-align:left">Recent stuff</th>
<th style="width:45%; background:#dddddd; text-align:left" markdown="1">Papers (full list at [![dblp](images/dblp.png "DBLP"){: style="width:10%"}](http://www.informatik.uni-trier.de/~ley/pers/hd/t/Tuosto:Emilio.html))</th>
<th style="width:20%; background:#dddddd; text-align:left">Tools</th>
</tr>
<tr>
<td valign="top"  markdown="1"><!-- Recent stuff -->
{% assign items = site.data.current %}
{% for n in items %}
- <span class="tooltip"><span class="tooltiptext">{% if n.authors %} With {{ n.authors }}  
{% endif %}{{ n.descr }}</span>{{ n.topic }}</span>{% endfor %}
</td>
<td valign="top" markdown="1"><!-- Papers -->
{% assign items = site.data.drafts %}
{% for n in items limit:5 %}
- <span class="tooltip"><span class="tooltiptext">with {{ n.author }}.<br/>{{ n.descr }}</span>{{ n.title }}</span>
{% if n.venue %}Accepted at {{ n.venue }}.{% endif %}{% if n.printed %}{{ n.printed }}.{% endif %}
  {% if n.draft %}Submitted at {{ n.draft }}.{% endif %} <span markdown="1">{% if n.url %} Available [here]({{ n.url }}) {% endif %}</span>{% endfor %}
- More stuff [here](publications)
</td>
<td valign="top" markdown="1"><!-- Tools -->
- <span class="tooltip"><span class="tooltiptext">Tool-chain for choreographic development</span>[ChorGram](https://bitbucket.org/eMgssi/stable_chorgram/wiki/Home)</span>
- <span class="tooltip"><span class="tooltiptext">Partition refinement for history-dependent automata</span>[MIHDA](./mihda.tgz)</span>
- <span class="tooltip"><span class="tooltiptext">An ad-hoc model checker for security protocols </span>[ASPASYA](aspasya/aspasya.html) and [H-ASPASYA](aspasya/h-aspasya.html)</span>
</td>
</tr>
<tr>
<th style="background:#dddddd; text-align:left">Projects</th>
<th colspan="2" style="background:#dddddd; text-align:left" markdown="1">Some recent talks (full list [here](talks))</th>
</tr>
<tr>
<td valign="top" markdown="1"><!-- Projects -->
- [ASTRA - Advanced Space Technologies and Research Alliance]() <span class="tooltip"><span class="tooltiptext">SPOKE GSSI of the Innovation, digitalization and sustainability for the diffused economy in Central Italy - VITALITY. Task leader of the WP2, PNRR ECS_00000041 (Missione 4 Componente 2 Investimento 1.5, €~10M of which ~2M for WP2)</span>(11/10/2022 to-date)</span>
- [BehAPI - Behavioural Application Program Interfaces](https://www.um.edu.mt/projects/behapi)<span class="tooltip"><span class="tooltiptext">Site leader and Work package leader (Marie Skłodowska-Curie Actions RISE, agreement No 778233, €742,500.00)</span>(1/3/2018 to-date)</span>
- [IT-Matters](http://itmatters.imtlucca.it) <span class="tooltip"><span class="tooltiptext"> Italian PRIN project led by Rocco de Nicola; member</span>(1/9/2019 - 28/8/2023)</span>
- Involvement in [past projects](old_projects)
</td>
<td colspan="2" valign="top" markdown="1"><!-- Talks -->
{% assign items = site.data.talks %}
{% for n in items limit:5 %}
- **_{{ n.title }}_**.  
{% if n.descr %}{{ n.descr }}.{% endif %} {{ n.date  | date: '%B %d, %Y' }}. <span class="tooltip"><span class="tooltiptext">![](/home/slides/{{ n.cover }})</span>[Slides]({{ n.slides }})</span>{% endfor %}
</td>
</tr>
<th style="background:#dddddd; text-align:left">eM's PhD students</th>
<th colspan="2" style="background:#dddddd; text-align:left">Suggested readings for MSc/PhD students</th>
<tr>
<td valign="top" markdown="1"><!-- phd students -->
{% for n in site.data.phd %}
- {{ n.name }} {% if n.viva %} _(viva held in {{ n.viva }})_{: style="font-size:10pt" } {% else %} _(current student)_{: style="font-size:10pt" }{% endif %}{% if n.note %}<br/>{{ n.note }}{% endif %}{% endfor %}
</td>
<td colspan="2" valign="top" markdown="1"><!-- Readings -->
- Alfred Tarski. *Introduction to logic and to the methodology of deductive sciences*. OUP.
- Graham Priest. *Logic: A Very Short Introduction*. OUP.
- Douglas R. Hofstadter. *Gödel, Escher, Bach: An Eternal Golden Braid*. Basic Books 1999 (First published in 1979).
- Strunk & White. *The Elements of Style*. Allyn & Bacon (1999)
</td>
</tr>
</table>




