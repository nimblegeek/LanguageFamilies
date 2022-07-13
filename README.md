# Language Families

Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, we’ll focus on something that often varies between language families: word order — where the subject, verb, and object would go in a sentence.

For example, in English, you would use subject-verb-object order:

| Subject     | Verb        | Object  |
| ----------- | ----------- | ------- |
| She         | Eats        | Noodles |

But in Japanese, you would use subject-object-verb order:

| Subject     | Verb        | Object  |
| ----------- | ----------- | ------- |
| 彼女は       | 麺を         |  食べる |
| (she)	      | (noodles)   |	(eats) |

# Scope
Build a Java package with the following three classes to model real-world language families.

- Language.java: for the ```Language``` parent class, which serves as the template for all languages.
- Mayan.java: for ```Mayan```, a child class of Language modeled after the [Mayan language family](https://en.wikipedia.org/wiki/Mayan_languages).
- SinoTibetan.java: for ```SinoTibetan```, a child class of Language modeled after the [Sino-Tibetan language family] (https://en.wikipedia.org/wiki/Sino-Tibetan_languages).

This project was built as part of the [Create REST APIs](https://www.codecademy.com/learn/paths/create-rest-apis-with-spring-and-java) with Spring course on CodeAcademy.
