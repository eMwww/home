---
layout: default
content: true
---

# Recent stuff

Here is a list of recent topics I am playing with:
{% assign items = site.data.current %}
{% for n in items %}
- *{{ n.topic }}*{: style="color:  #117a65; opacity: 0.80;" }
  {% if n.authors %}(joint work with {{ n.authors }}){% endif %}  
  <span markdown="1" style="color:#888888">{{ n.descr }} {% if n.url %} Check out [{{ n.url }}](here) {% endif %}{% endfor %}</span>

Of course, I always try to advance
[ChorGram](https://bitbucket.org/emlio_tuosto/chorgram/wiki/Home)...with
the help of Alex Coto we should speed up on this.


## Some tools
* [ChorGram](https://bitbucket.org/emlio_tuosto/chorgram/wiki/Home): tool-chain for choreographic development
* [MIHDA](./mihda.tgz): partition refinement for history-dependent automata
* [ASPASYA](aspasya/aspasya.html) and [H-ASPASYA](aspasya/h-aspasya.html): an ad-hoc model checker for security protolols


## Projects
I'm currently collaborating in the following projects:
- [BehAPI](https://www.um.edu.mt/projects/behapi) (EU RISE Action, co-PI + site and WP4 leader at UoL)
started in March 2018; I am WP and UoL site leader
- [IT-Matters](http://itmatters.imtlucca.it) (Italian PRIN project led by Rocco de Nicola)


## Recent past projects
Recently a few projects ended

- RCADE (EU MSCA Fellowship, co-PI) Claudio Mezzina joined in
September 2018 our department as MSCA fellow collaborating with [Irek
Ulidowski](http://www.cs.le.ac.uk/people/iu3) and me on causal
consistency reversible debuggers; shortly after the start Claudio got a permanent job in Italy
- [Reversible Computation](http://www.revcomp.eu) (EU Cost Action)
- [BETTY](http://www.behavioural-types.eu) EU COST Action (RTD Framework Programme).


## Old projects
I have contributed several the Leverhulme project
- [Tracing Networks](http://www.cs.le.ac.uk/TracingNetworks) [Levehulme Trust](http://www.leverhulme.ac.uk/grants_awards) co-PI
- [Sensoria](http://www.sensoria-ist.eu) (IST project funded by the EU as Integrated Project in the 6th Framework Programme (FP6) as part of the Global Computing Initiative (GC))
- HiDe4SOC [Nuffield Foundation](http://www.nuffieldfoundation.org) ref. NAL 32612, PI
- [PAIS](http://www.cs.le.ac.uk/projects.html#pais) Process Algebras for Interaction and Spatiality. British-Italian Partnership Programme for Young Researchers [British Council](http://www.britishcouncil.org) and [CRUI](http://www.crui.it). Co-PI
- Several EU-funded projects (PROFUNDIS, AGILE, and DEGAS)
- Italian projects (COMETA, SP4 and NAPI)


## My PhD students

### In reverse time order

{% assign items = site.data.phd %}
{% for n in items %} - {{ n.name }} {% if n.viva %} _(viva held in {{ n.viva }})_{: style="font-size:12pt" } {% else %} _(current student)_{: style="font-size:10pt" } {% endif %}
{% endfor %}



