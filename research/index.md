---
layout: default
content: true
---

# My research
## Projects
I'm currently collaborating in the following projects:
- [BehAPI](https://www.um.edu.mt/projects/behapi) (EU RISE Action,
co-PI + site and WP4 leader) due to start in March 2018; I am WP and
UoL site leader
- [IT-MATTERS](http://itmatters.imtlucca.it/) (Italian PRIN project)


I have contributed several other projects

- RCADE (EU MSCA Fellowship, co-PI) Claudio Mezzina will join in
September 2018 our department as MSCA fellow collaborating with [Irek
Ulidowski](http://www.cs.le.ac.uk/people/iu3/) and me on causal
consistency reversible debuggers
- [Reversible Computation]{http://www.revcomp.eu/} (EU Cost Action)
- a Daphne Jackson project
- [Tracing Networks](http://www.cs.le.ac.uk/TracingNetworks/) (Leverhulme Trust, co-PI)
- [BETTY](http://www.behavioural-types.eu/) ()EU COST Action, RTD Framework Programme)
- [>Sensoria](http://www.sensoria-ist.eu/) (IST project funded by the EU as Integrated Project in the 6th Framework Programme (FP6) as part of the Global Computing Initiative (GC))
- HiDe4SOC ([Nuffield Foundation](http://www.nuffieldfoundation.org/) ref. NAL 32612, PI)
- PAIS (British-Italian Partnership Programme for Young Researchers, co-PI)

During my PhD I was involved in several EU-funded projects (PROFUNDIS,
and AGILE) as well as some Italian projects (COMETA, SP4 and NAPI).

## Edited volumes

{% assign items = site.editor | sort: 'date' | reverse %}

<div>
  <ul>
    {% for n in items %}
      <li>{{ n.title }} -  <a href="{{ n.url }}</li>">{{ n.ref }}</a> {% if n.img %} <img alt="{{ n.title }}" src="{{ n.img }}" width="3%" /> {% endif %}</li>
    {% endfor %}
  </ul>
</div>

## Advanced courses

{% assign items = site.courses | sort: 'date' | reverse %}

<div>
I delivered the following courses:
  <ul>
    {% for n in items %}
      <li>{{ n.when }}: {% if n.url %} <a href="{{ n.url }}">{{ n.title }}</a> {% else %} {{ n.title }} {% endif %}. {{ n.descr }}. {{ n.where }}</li>
    {% endfor %}
  </ul>
</div>


## PhD Students

{% assign items = site.phd | sort: 'date' | reverse %}

<div>
I had the privilege to supervise the following students (in year and
alphabetic order)
  <ul>
    {% for n in items %}
      <li>{{ n.name }}: VIVA passed {{ n.viva }}</li>
    {% endfor %}
  </ul>
</div>

## Other research-related activities
<ul>
	    <li>
	      I'm member of the following research themes of the department
	      <a href="http://www2.le.ac.uk/departments/computer-science/research/rthemes/valve">VALVE</a>,
	      <a href="http://www2.le.ac.uk/departments/computer-science/research/rthemes/foco">FoCo</a>,
	      and <a href="http://www2.le.ac.uk/departments/computer-science/research/rthemes/some">SOME</a>
	    </li>
	    <li>
              Visiting professor (starting April 2011) at the University of Cagliari
	      where, besides some research with Massimo Bartoletti, I though
	    </li>
	    <ul>
	      <li> I though an advanced course to PhD and MSc students on
	      <a href="http://tcs.unica.it/positions/phdcoursebisimulationprocessalgebrasandcoinduction">security protocols</a>.
	      </li>
	      <li>
		an advanced course to PhD and MSc students on
		<a href="http://tcs.unica.it/positions/phdcoursebisimulationprocessalgebrasandcoinduction">&quot;Bisimulation,
		Process Algebras, and Coinduction&quot;</a>
	      </li>
	    </ul>
	  </ul>



## Some research related stuff
<div>
  <table>
	    <tr>
	      <th align="center">Events</th>
	      <th align="center">Interests</th>
	      <th align="center">Tools</th>
	      <th align="center">Research and Fun</th>
	    </tr>
	    <tr>
	      <td valign="top">
		  <ul>
		  <li><a href="http://www.discotec.org/2019/">DISCOTEC 2019</a></li>
		  <li><a href="http://www.discotec.org/2019/coordination">COORDINATION 2019 (co-chair)</a></li>
		  </ul>
	      </td>
	      <td valign="top">
		<ul>
		  
		  <li>Formal verification</li>
		  <li><a href="http://www.di.unipi.it/~andrea/GETGRATS" target="_blank">Graph rewriting</a></li>
		  <li>Nominal calculi</li>
		  
		  <li>Distributed Coordination and contracts</li>
		  
		  
		  
		<!-- 		  <li>Symbolic Verification</li> --><!-- 		  <li>Algebras and Coalgebras</li> --><!-- 		  <li><a href="coauthors.html" target="_blank">Coauthors</a></li> --></ul>
	      </td>
	      <td valign="top">
		<ul>
		  <li>
<a href="https://bitbucket.org/emlio_tuosto/chorgram/wiki/Home">
		    ChorGram</a>: tool-chain for choreographic development
		  </li>
		  <li>
<a href="./mihda.tgz" title="Partition refinement of HD-automata">
		    MIHDA</a>
		  </li>


		  <li>
<a href="aspasya/aspasya.html">
		    ASPASYA</a>
		  </li>

		  <li>
<a href="aspasya/h-aspasya.html">
		    H-ASPASYA</a>
		  </li>

		  <li>
<a href="http://www.tao4ws.net">
		    JTWS</a> or <a href="http://merlot.di.unipi.it:8080/tao4ws">JTWS</a>
		  </li>
		</ul>
	      </td>
	      <td valign="top">
		<ul>
<li>Globalisation and research...<a href="http://www.sciencedirect.com/science/article/pii/S0140673614607972">be careful</a>
</li>
<li>Italian research is <a href="https://medium.com/@alfonsofuggetta/b5ab6eb2ecd0">not so bad</a> after all
</li>
<li>This <a href="https://www.youtube.com/watch?v=zDZFcDGpL4U">video</a> is somehow related to research
</li>
		  <li><a href="http://regexcrossword.com/">Having fun with regex</a></li>
		  <li><a href="http://eloquentscience.com/wp-content/uploads/2012/02/Frustrated_author.pdf">Frustrated authors</a></li>
		  <li><a href="http://www.sigmod.org/publications/sigmod-record/0812/p100.open.cormode.pdf">Another one about peer reviewing...</a></li>
		  <li>Lectures on Marx's <a href="https://goo.gl/TNRzO6">Capital V. 1 by David Harvey</a>
</li>
		</ul>
	      </td>


	    </tr>
	  </table>
	</div>

		  




