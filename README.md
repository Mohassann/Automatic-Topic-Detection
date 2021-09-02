# Automatic-Topic-Detection
In the past several years, topic models have seen a rise in their popularity due to the expeditious growth of text data. However, those texts are either in short-form or long-form. In this study, we elucidated topic models for both regular documents and short text. We explained the differences between regular documents and short text documents. The standard topic models are Latent Semantic Analysis (LSA), Probabilistic Latent Semantic Analysis (PLSA), and Latent Dirichlet Allocation (LDA). These models performed very well in extracting topics from regular documents. However, this research mainly focuses on short text topic models. Short text documents contain less information and word co-occurrence,
which leads to a data sparsity problem. Because of the sparsity problem, the standard topic models may not perform very well on short text documents. 

## 1. To solve the sparsity problems in short text data, many short text topic models have been developed, such as a 


1. #### DMM based
  - Gibbs sampling algorithm for Dirichlet Multinomial Mixture (GS-DMM)


2. #### Word Embedding (DMM based)
- Latent Feature Dirichlet Mixture Model (LF-DMM)
- Generalized Polya Urn -Dirichlet Multinomial Mixture (GPU-DMM)
- Generalized Polya Urn - Poisson-based Dirichlet Multinomial Mixture (GPU-PDMM)
- 
**"Note" If users train these models based word embeddings, users need to download the Pre-trained word embedding [Global Vectors](https://nlp.stanford.edu/projects/glove/).**

3. #### Global word co-occurrences
- Biterm Topic Model (BTM), 
- World Network Topic Model (WNTM)


4. #### Self-Aggregation
- SelfAggregation Topic model (SATM)
- Pseudo-document-based Topic Modeling (PTM).


#### We used all these models, and each model is trained on five different real-world short text datasets. 
We used the STTM open-source java Library

**Short Text Topic Model** [STTM Library](https://github.com/qiang2100/STTM)

## 2. Later, we evaluated the performance of each model on each dataset 
using three different metrics, including 
1. Classification (Accuracy)
2. Topic Coherence (PMIscore)
3. Clustering (Purity and NMI) 
 
we reported the average mean of each of the metrics.

**It is important to note for the evaluation we also need to read a golden label file for each dataset, each line is the class label of one document.**
**Golden Labels of all the dataset can be found [here](https://github.com/Mohassann/Automatic-Topic-Detection/tree/main/STTM/Datasets/Golden%20Labels)**

**For Computing topic coherence, Wikipedia dump dataset is needed to score word pairs using term co-occurrence in the paper [Automatic Evaluation of Topic Coherence](https://dl.acm.org/doi/10.5555/1857999.1858011). Here, we calculate the pointwise mutual information (PMI) of each word pair, estimated from the entire corpus of over 1M English Wikipedia articles. Using a sliding window of 10-words to identify co-occurrence, we computed the PMI of all a given word pairs. [Wikipedia dataset](https://dumps.wikimedia.org/enwiki/latest/enwiki-latest-pages-articles.xml.bz2) [Pre processing of the Wikipedia dataset](https://github.com/Mohassann/Automatic-Topic-Detection/blob/main/STTM/Wikipedia%20Pre-Processing/process_wiki.py) which was provided by [qiang](https://github.com/qiang2100/STTM/)**

you can easily convert the Wikipedia dataset from HTML to Text using the above code and executing:
```python
python process_wiki.py enwiki-latest-pages-articles.xml.bz2 wiki.en.text
```
- python 2.7
- Gensim 3.8.3 

### The output files of Accuracy + Purity & NMI + PMI-scoreare are in Results -- Accuracy+Purity & NMI + PMI-score folder
- modelX.accuracy
- modelX.PurityNMI
- modelX.coherence


### The output files of Top Words and Topic Assignmnets are in Results -- Top Words + Topic Assignmnets folder
- modelX.theta (document-to-topic distributions)
- modelX.phi (topic-to-word distributions)
- modelX.topicassignmnets (assigning words in the documents to topics)

## 3. We tested the impact of pre-processing on the datasets and the efficiency of each model. 
To investigate the impact of pre-processing on the performance of the topic modeling, we train the GS-DMM on the StackOverflow datase

## 4. Finally, we investigated the influence of 
1. Number of topics K 
2. Number of iterations
3. Number of pseudo documents for PTM and SATM 
4. Impact of M and λ on GPU-PDMM

***

## How it works?
We have [STTM.java](https://github.com/Mohassann/Automatic-Topic-Detection/blob/main/STTM/src/STTM.java) source-code file, you can complie the code using Exclipse or IDEA.

We used Exclipse; therefore, the command lines should be inside the main class. we added the commands to the STTM.java file, user need to update the name of the model and the evaluation metrics.

### 1. For training any of the models, use the following line of code.
```java
String []aargs="-model DMM -corpus dataset/Biomedical.txt -alpha 0.1 -beta 0.1 -niters xxx -name Biomedi_GS-DMM".split(" ");
```

#### For training the models that uses the word embedding:
```java
String []aargs="-model GPUDMM -corpus dataset/Biomedical.txt -vectors dataset/glove.6B.200d.txt -alpha a/K -beta 0.01 -niters xxx -name Biomedi_GPU-DMM".split(" ");
```

### 2. For Evaluating the Models using:
- #### Classification (Accuracy):
```java
String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GS-DMM.theta".split(" ");
```

- #### Topic Coherence (PMI-Score):
```java
String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_GS-DMM.topWords".split(" ");
```

- #### Clustering (Purity + NMI)
```java
String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GS-DMM.theta".split(" ");
```

***

### Impact of pre-processing

StackOverflow dataset filled with symbols and computer terminology, lowercase letters, and uppercase letters are all critical; after pre-processing, most of these symbols and computer terminologies become meaningless or will be removed. We used the StackOverflow dataset without any pre-processing, trained the GS-DMM, and reported the mean Accuracy, Purity, and NMI.

The Stackoverflow dataset without pre-processing can be found [here](https://github.com/Mohassann/Automatic-Topic-Detection/tree/main/STTM/StackOverflow%20without%20pre-processing/Dataset)

The Results can be found [here](https://github.com/Mohassann/Automatic-Topic-Detection/tree/main/STTM/StackOverflow%20without%20pre-processing/Results)
