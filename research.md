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


## Some tools
* [ChorGram](https://bitbucket.org/emlio_tuosto/chorgram/wiki/Home): tool-chain for choreographic development
* [MIHDA](./mihda.tgz): partition refinement for history-dependent automata
* [ASPASYA](aspasya/aspasya.html) and [H-ASPASYA](aspasya/h-aspasya.html): an ad-hoc model checker for security protolols


## Ongoing Projects
- 2018: Site leader and Work package leader of [BehAPI](https://www.um.edu.mt/projects/behapi) "Behavioural Application Program Interfaces". (Marie Skłodowska-Curie Actions RISE, agreement No 778233, €742,500.00, 1/3/2018 to-date)
- 2019: Member of [IT-Matters](http://itmatters.imtlucca.it) (Italian PRIN project led by Rocco de Nicola)


## My PhD students
{% assign items = site.data.phd %}
{% for n in items %} - {{ n.name }} {% if n.viva %} _(viva held in {{ n.viva }})_{: style="font-size:12pt" } {% else %} _(current student)_{: style="font-size:10pt" } {% endif %}
{% endfor %}


## Old projects
- 2018: co-PI **RCADE** (EU MSCA Fellowship) [Claudio Mezzina](https://www.uniurb.it/persone/claudio-mezzina) joined in September 2018 our department as MSCA fellow collaborating with [Irek Ulidowski](http://www.cs.le.ac.uk/people/iu3) and me on causal consistency reversible debuggers; the project is discontinued since, shortly after the start, Claudio got a permanent job in Italy
- 2015-2019: [RC](http://www.revcomp.eu) "Reversible Computation. Extending Horizons of Computing" (EU Cost Action 1405, 01/07/2015-30/04/2019)
- 2012-2016: [BETTY](http://www.dcs.gla.ac.uk/research/betty/www.behavioural-types.eu) "Behavioural Types for Reliable Large-Scale Software Systems". Member of the management committee (EU Cost Action IC1201 - RTD Framework Programme, 26-01-2012 al 07-10-2016)
- 2010-2014: [ASCENS](http://www.ascens-ist.eu/home.html) "Autonomic Service-Component Ensembles", EU Integrated Project - 7th Framework Programme (FP7) and part of Future Emerging Technologies initiative Contract 257414 
- 2009: Co-PI [PAIS](http://www.cs.le.ac.uk/projects.html#pais) Process Algebras for Interaction and Spatiality. British-Italian Partnership Programme for Young Researchers [British Council](http://www.britishcouncil.org) and [CRUI](http://www.crui.it), 1/1/2009-31/12/2009, GPB 3,000.
- 2008-2013: Co-PI [Tracing Networks](http://www.cs.le.ac.uk/TracingNetworks) "Craft Traditions in the Ancient Mediterranean and Beyond" (overall GBP 1,729,180 of which GBP 277,674 to the Department of Computer Science funded by [Levehulme Trust](http://www.leverhulme.ac.uk/grants_awards), 01-10-2008 al 30-09-2013)
- 2005-2009: [Sensoria](http://www.sensoria-ist.eu) "Software Engineering for Service-Oriented Overlay Computers" (project funded by the EU as Integrated Project in the 6th Framework Programme (FP6) as part of the Global Computing Initiative (GC) IST-2005-16004)
- 2006-2008: PI [HiDe4SOC](https://www.cs.le.ac.uk/people/et52/grants/hidea4soc.html). History-Dependent Automata for SOC. Awarded by [Nuffield Foundation](http://www.nuffieldfoundation.org) for newly appointed lectures (ref. NAL 32612, £5,000, 01-05-2006 al 30-04-2008)
- 2002-2005: [AGILE](https://cordis.europa.eu/project/id/IST-2001-32747) "Architectures for Mobility" (EC FET: Global Computing, IST-2001-32747, 1/1/2002-30/4/2005)
- 2002-2005: [DEGAS](https://cordis.europa.eu/project/id/IST-2001-32072/es) "Design Environments for Global Applications" (EC FET: Global Computing, IST-2001-32072 1/1/2002-30/4/2005)
- 2002-2005: [PROFUNDIS](https://cordis.europa.eu/project/id/IST-2001-33100). Proofs of Functionality for Mobile Distributed Systems (EC FET: Global Computing IST-2001-33100, 1/1/2002-30/4/2005)
- 2001-2003: **NAPOLI**. Models, Calculi and Languages for Network Aware Programming, Italian PRIN project
- 2001-2002: **NAPI**. Network Aware Programming Interoperability (Microsoft Research Cambridge)
- 2001: **COMETA**. Computational Metamodels (MIUR COFIN 2001)
- 1999-2001: **TOSCA** (COFIN)
- 1996-1999: [CONFER2](https://cordis.europa.eu/project/id/FP4_21836) "Concurrency and Functions: Evaluation and Reduction" (FP4_21836, 1/11/1996-31/10/1999, 01/01/1999-30/12/2019)



## PhD examination
I have been the internal examiner of more than 5 PhD students at the University of Leicester
and I have been the external examiner of the following doctors:
{% assign items = site.data.examiner %}
{% for n in items %} - {{ n.date }}: **{{ n.name }}** *{{ n.title }}*, {{ n.institution }}
{% endfor %}



