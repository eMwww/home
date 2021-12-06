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
Institute](http://www.gssi.it).
Before joining the GSSI I have been associate professor of the [School
of Informatics](https://cs.le.ac.uk/) of [University of Leicester](https://www.le.ac.uk),
which I joined in October 2005 as a lecturer of the (at that time) Department of Computer Science.  
Before joining Leicester, I have been a research associate (2003-2005)
at the Dipartimento di Informatica (University of Pisa).
I graduated (1998) and got my PhD degree in Computer Science (2003) at
the department of Computer Science, University of Pisa.

## Editorial boards
{% assign items = site.data.eb | sort: 'date' | reverse %}
{% for n in items %}
- {{ n.eb }}
  <br/>{{ n.role }}
  ({% if n.url %}<a href="{{ n.url }}">{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}</a>, {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}

## Steereing Committes
{% assign items = site.data.sc | sort: 'date' | reverse %}
{% for n in items %}
- {{ n.sc }}
  ({% if n.url %}<a href="{{ n.url }}">{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}</a>, {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}


## Membership of programme committees
{% assign items = site.data.pc | sort: 'date' | reverse %}
{% for n in items %}
- {% if n.pc %} {{ n.pc }} {% endif %}{% if n.oc %}
  organising committee {{ n.oc }}
  {% endif %}({% if n.url %}<a href="{{ n.url }}">{% if n.acr %}{{ n.acr }}{% else %}{{ n.url }}{% endif %}</a>, {% else %}
  {% if n.acr %}{{ n.acr }}, {% endif %}{% endif %}
  {{ n.from }} --- {{ n.to }}){% endfor %}


## Recruiting and hiring service
I have served on the following panels for recruiting staff and students:
{% assign items = site.data.recruitment %}
<div markdown="1">
{% for n in items %}
 - {{ n.date }}: {{ n.role }} of the committee for {% if n.viva %} PhD viva defense of {{ n.viva }} - {{ n.institution }} {% else %} {{ n.event }} at the {{ n.institution }} {% endif %} {% endfor %}
</div>

## PhD examination
<div markdown="1">
I have been the internal examiner of more than 5 PhD students at the University of Leicester
and I have been the external examiner or chair of the following viva:
{% assign items = site.data.examiner %}
{% for n in items %}- {{ n.date }}: {% if n.viva %}{{ n.role }} of the committee for the PhD viva defense of **{{ n.viva }}** {% else %} external examiner of **{{ n.name }}** {% endif %} *{{ n.title }}*, {{ n.institution }}
{% endfor %}
</div>


