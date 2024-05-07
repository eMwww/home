# Modelling and Validation of Concurrent systems

Concurrent and distributed software is nowadays pervasive to most computing devices. However, it is particularly difficult to design and validate. Concurrency bugs appear frequently and have a substantial impact, as not only they may affect many people, but also may cause a severe financial damage. There is thus a pressing need of using rigorous approaches and tools to specify and verify such systems. Industrial actors like Amazon, Facebook, Google, IBM, Intel, Microsoft, or NASA, just to name a few, are using tools to formally guarantee that (parts of) their software is bug-free.
This course covers basic principles, techniques, and some tools to help on the challenging task of developing concurrent software systems. This involves understanding languages to specify systems and their properties. There are various kind of key properties of concurrent systems; we will focus on basic safety and liveness properties, which are enough to express functional requirements of concurrent and distributed algorithms.
Note - all lectures have a companion list of suggested exercises (and I am available in office hours to help with them and provide feedback about your solutions).

## Lecture 1: concurrent reactive systems
- requirements to model concurrent reactive systems
- the calculus of communicating systems (syntax and operational semantics)
- motivating and illustrative examples

## Lecture 2: equivalences for CCS
- requirements for an equivalence notion
- basics on co-induction
- observational behavioural equivalence (axiomatically and co-inductively)

## Lecture 3: the pi-calculus
- why do we need a dynamic process topology?
- the pi-calculus
- early and late operational semantics
- early and late bisimulations
- motivating and illustrative examples

## Lecture 4: (mobile) modal logics
- Hennessy-Milner Logic
- the mu-calculus
- tools for reasoning about process behaviour

## Lecture 5 (optional): research topics
- static analysis
- expressiveness
- protocol soundness
