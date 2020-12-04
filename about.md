---
layout: default
content: true
---

# About me
My main research interests are in theoretical and applied aspects of
distributed and mobile systems. Recently I've been working on
automata- and type-based models of distributed choreographies,
contract- and graph-based models of distributed interactions, and on
nominal automata.


## A brief CV

I am an associate professor at the [Gran Sasso Science
Institute](http://www.gssi.it).  Before joining the GSSI I have been
associate professor of the [School of
Informatics](https://cs.le.ac.uk/) of [University of
Leicester](https://www.le.ac.uk), which I joined in October 2005 as a
lecturer of the (at that time) Department of Computer Science.  

Before joining Leicester, I have been a research associate (2003-2005)
at the Dipartimento di Informatica (University of Pisa).

I graduated (1998) and got my PhD degree in Computer Science (2003) at
the department of Computer Science, University of Pisa.  

## Membership of scientific committees and boards
{% assign items = site.data.pc %}
<div markdown="1" style="font-size:6pt">
{% for n in items %}
- Member of the {% if n.eb %} editorial board of {% if n.url %} <a href="{{ n.url }}">{{ n.eb }}</a>{% else %} {{ n.eb }} {% endif %} ({{ n.from }} --- {{ n.to }}) {% endif %} {% if n.pc %} program committee of {% if n.url %} <a href="{{ n.url }}">{{ n.acr }}</a>{% endif %} {{ n.pc }}{% endif %} {% if n.sc %} steering committee of {{ n.sc }} ({{ n.from }} --- {{ n.to }}){% endif %} {% if n.oc %} organising committee of {{ n.oc }}{% endif %}{% endfor %}
</div>

## Recruiting and hiring service
I have served on the following panels for recruiting staff and students:
{% assign items = site.data.recruitment %}
<div markdown="1" style="font-size:6pt">
{% for n in items %}
 - {{ n.date }}: {{ n.role }} of the committee for {% if n.viva %} PhD viva defense of {{ n.viva }} - {{ n.institution }} {% else %} {{ n.event }} at the {{ n.institution }} {% endif %} {% endfor %}
</div>

## PhD examination
<div markdown="1" style="font-size:6pt">
I have been the internal examiner of more than 5 PhD students at the University of Leicester
and I have been the external examiner or chair of the following viva:
{% assign items = site.data.examiner %}
{% for n in items %}- {{ n.date }}: {% if n.viva %}{{ n.role }} of the committee for the PhD viva defense of **{{ n.viva }}** {% else %} external examiner of **{{ n.name }}** {% endif %} *{{ n.title }}*, {{ n.institution }}
{% endfor %}
</div>


