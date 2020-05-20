Status: Under Development (code can change)

Anti-pattern Extractor and KBgenerator
======
This github repository hosts the code for extracting anti-patterns from inconsistent knowledge graphs.

The knowledge base generator is an all encompassing piece of software designed for extracting anti-patterns from inconsistent knowledge graphs.

The code has been made available for reproducing the results we show in our papers. To make sure that it is possible we would refer to the [branch](https://github.com/anonymousUser303/submission303/commit/09383e50dcab1ca07b6ffd32afb48c35c949d8fc). Though the code is still in active development, it is possible that the software will improve over time. On the website <https://anonymoususer303.github.io/submission303/> you can find more information about the anti-patterns.

Overview of the Algorithm
-------
The algorithm consists out of three phases.
 - Subgraph retrieval, creating the set of subgraphs from the inconsistent knowledge graph.
 - justification retrieval, for each subgraph we retrieve the inconsistencies from the subgraph.
 - justification generalisation, now we convert each inconsistency to anti-pattern that we did not find previously.

<img src="docs/Writing/knowledgegraphToAntiPatterns.png"></img>
A schematic diagram that shows the pipeline used to extract subgraphs, find justifications and their anti-patterns.

Features
--------

The list of key features:

 - Retrieve contradictions as justifications from an knowledge graph.
 - Convert to the justifications to anti-patterns.
 - Create a list of distinct anti-patterns per knowledge graph.
 - Calculate statistics about the knowledge graph.
 - Calculate statistics about the anti-patterns in the knowledge graph.

Requirements
-------
To install the Anti-pattern Extractor and KBgenerator, the rdfhdt library needs to be installed.
This library is used to store and read the high compression documents with the knowledge graph in it.
Mainly used to quickly read through the documents and create the subgraphs.

When using it you'll need to add the newest version of the rdfhdt.
At the moment the best method of installing is by hand.

Download the files here:
https://github.com/rdfhdt/hdt-java
Extract the package in the directory and then run on the extracted package:

 - Linux: `mvn install`
 - Windows `mvn.cmd install`

Installation
------------
To install the software for use. Open a command window in the `code` directory and run for the other necessary packages:
- Linux: `mvn install`
- Windows `mvn.cmd install`

Useage
---------
To use, create a location where you store the HDTs. e.g. In the `code/resources` create a folder `HDTs` where you'll be storing the HDTs for anti-pattern extraction.


Support
-------

If you are having issues, please let us know via github.

License
-------

The project is licensed under the MIT license.

Credits
-------
 - OWLAPI: https://owlcs.github.io/owlapi
 - RDFHDT: https://github.com/rdfhdt/hdt-java
 - Openllet: https://github.com/Galigator/openllet
 - Jena: https://jena.apache.org
