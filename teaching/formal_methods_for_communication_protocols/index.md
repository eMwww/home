---
layout: default
content: true
docs_list_title: Teaching
use-site-title: false
---

{% assign courses = site.data.courses | where: "title", "Formal Methods for Communication Protocols" %}
{% for course in courses %}

## <a id='{{ course.title }}'></a>{{ course.title }}

<p style="font-size:12pt">{{ course.syllabus }}</p>


### References and material
<div markdown="1">
{% for m in course.material %}
- {% if m.url %}[Click here](https://emwww.github.io/home/teaching/{{ course.path}}/{{ m.url }}) for {% endif %}{{ m.descr }} {% endfor %}
<br/>Besides the papers [2,3] below, these lectures are based on:<br/>
- [4] Roberto Guanciale and Emilio Tuosto. Realisability of pomsets.
Journal of Logic and Algebraic Methods in Programming, 108:69–89, 2019.

<br/>
The slides of the seminar
for the joint seminar series
MISANU & Centre for Mathematics and Statistics FTN, UNS
held on March 9, 2026 
are [here](seminar.pdf).
</div>

{% if course.notes %}

### Lecture notes:
<div markdown="1">
{% for l in course.notes %}
- {{ l.date }}: {% for i in l.items %}[{{ i.name }}]({{ i.url }}){% if i.last %}{% else %}, {% endif %}{% endfor %}[{{ l.name }}](https://emwww.github.io/home/teaching/{{ course.path}}/{{ l.url }}){% if l.video %}<br/>Last year's [recording]({{ l.video }}){% endif %}{% endfor %}
</div>
{% endif %}
{% endfor %}


Further readings:

- [1] K. Honda, N. Yoshida and M. Carbone. Multiparty Asynchronous Session Types. JACM 63(1), 2016.
- [2] R. Kuhn, H. C. Melgratti and E. Tuosto. Behavioural Types for Local-First Software. ECOOP 2023
- [3] R. Kuhn, H. C. Melgratti and E. Tuosto. Behavioural Types for Local-First Software (Artifact). Dagstuhl Artifacts Ser. 2023
- [4] C. Fournet and G. Gonthier. The Reflexive CHAM and the Join-Calculus. POPL'96
- [5] A. J. Turon, C. V. Russo. Scalable join patterns. SPLASH 2011
- [6] Gul Agha. Actors: A Model of Concurrent Computation in Distributed Systems.
MIT Press, Cambridge, MA, USA, 1986.
- [7] D. Brand and P. Zafiropulo. On Communicating Finite-State Machines.
JACM, 30(2):323–342, 1983.
- [8] P. Deniélou and N. Yoshida. Multiparty session types meet communicating automata. In ESOP 2012.
- [9] C. Hewitt, P. B. Bishop, and R. Steiger. A Universal Modular ACTOR Formalism for Artificial Intelligence. IJCAI, 1973.
- [6] N. Kavantzas, D. Burdett, G. Ritzinger, T. Fletcher, and Y. Lafon. Web services choreography description language version 1.0.
http://www.w3.org/TR/2004/WD-ws-cdl-10-20041217. Working Draft 17 December 2004.

<!--

  author       = {Philipp Haller and
                  Ayman Hussein and
                  Hern{\'{a}}n C. Melgratti and
                  Alceste Scalas and
                  Emilio Tuosto},
  editor       = {Jonathan Aldrich and
                  Guido Salvaneschi},
  title        = {Fair Join Pattern Matching for Actors},
  booktitle    = {38th European Conference on Object-Oriented Programming, {ECOOP} 2024,
                  Vienna, Austria, September 16-20, 2024},

  author       = {Philipp Haller and
                  Ayman Hussein and
                  Melgratti,{Hern{\'{a}}n C.} and
                  Alceste Scalas and
                  Emilio Tuosto},
  title        = {Fair Join Pattern Matching for Actors (Artifact)},
  journal      = {Dagstuhl Artifacts Ser.},
  volume       = {10},
  number       = {2},
  pages        = {8:1--8:3},
  year         = {2024},


@incollection{fg02,
	abstract = {In these notes, we give an overview of the join calculus, its semantics, and its equational theory. The join calculus is a language that models distributed and mobile programming. It is characterized by an explicit notion of locality, a strict adherence to local synchronization, and a direct embedding of the ML programming language. The join calculus is used as the basis for several distributed languages and implementations, such as JoCaml and functional nets. Local synchronization means that messages always travel to a set destination, and can interact only after they reach that destination; this is required for an efficient implementation. Specifically, the join calculus uses ML’s function bindings and pattern-matching on messages to program these synchronizations in a declarative manner. Formally, the language owes much to concurrency theory, which provides a strong basis for stating and proving the properties of asynchronous programs. Because of several remarkable identities, the theory of process equivalences admits simplifications when applied to the join calculus. We prove several of these identities, and argue that equivalences for the join calculus can be rationally organized into a five-tiered hierarchy, with some trade-off between expressiveness and proof techniques. We describe the mobility extensions of the core calculus, which allow the programming of agent creation and migration. We briefly present how the calculus has been extended to model distributed failures on the one hand, and cryptographic protocols on the other.},
	author = {Fournet, C\'{e}dric   and Gonthier, Georges  },
	doi = {10.1007/3-540-45699-6\_6},
	journal = {Applied Semantics},
	pages = {268--332},
	title = {The Join Calculus: A Language for Distributed Mobile Programming},
	url = {http://dx.doi.org/10.1007/3-540-45699-6\_6},
	year = {2002}
}



All the slides in a single [file](all.pdf) -->
