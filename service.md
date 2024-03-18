---
layout: default
content: true
docs_list_title: Service
use-site-title: false
---

{% assign items = site.data.recruitment %}

<table>
  <tr>
    <th style="width:40%; background:#dddddd; text-align:left">Remits @ GSSI</th>
    <th style="width:60%; background:#dddddd; text-align:left">Hiring service</th>
  </tr>
  <tr>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.service | where: "type", "wg" %}
{% for n in items %}
- {{ n.role }} of the {{ n.descr }}{% endfor %}
</td>
<td class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.service | where: "type", "hire" %}
{% for n in items %}
- {{ n.role }} of the recruitment panel for {{ n.name }} at {{ n.institution }} ({{ n.date }}){% endfor %}
</td>
</tr>
<tr>
<th style="width:40%; background:#dddddd; text-align:left" colspan="2">Phd Boards</th>
</tr>
<tr>
<td colspan="2" class="quicklinks" valign="top" markdown="1">
{% assign items = site.data.service | where: "type", "collegio" %}
{% for n in items %}
- {{ n.role }} of the board of {{ n.name }} (collegio dei docenti) in computer science of the {{ n.institution }} (academic year {{ n.date }}){% endfor %}
</td>
</tr>
</table>
