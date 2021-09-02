# Automatic-Topic-Detection
In the past several years, topic models have seen a rise in their popularity due to the expeditious growth of text data. However, those texts are either in short-form or long-form. In this study, we elucidated topic models for both regular documents and short text. We explained the differences between regular documents and short text documents. The standard topic models are Latent Semantic Analysis (LSA), Probabilistic Latent Semantic Analysis (PLSA), and Latent Dirichlet Allocation (LDA). These models performed very well in extracting topics from regular documents. However, this research mainly focuses on short text topic models. Short text documents contain less information and word co-occurrence,
which leads to a data sparsity problem. Because of the sparsity problem, the standard topic models may not perform very well on short text documents. 

## 1. To solve the sparsity problems in short text data, many short text topic models have been developed, such as a 
- Gibbs sampling algorithm for Dirichlet Multinomial Mixture (GS-DMM), 
- Latent Feature Dirichlet Mixture Model (LF-DMM), 
- Generalized Polya Urn -Dirichlet Multinomial Mixture (GPU-DMM), 
- Generalized Polya Urn - Poisson-based Dirichlet Multinomial Mixture (GPU-PDMM), 
- Biterm Topic Model (BTM), 
- World Network Topic Model (WNTM), SelfAggregation Topic model (SATM), and Pseudo-document-based Topic Modeling (PTM). 

We xplained each of those models in detail. Each model is trained on five different real-world short text datasets. 

## 2. Later, we evaluated the performance of each model on each dataset 
using three different metrics, including 
1. Classification (Accuracy)
2. Topic Coherence (PMIscore)
3. Clustering (Purity and NMI) 
 
we reported the average mean of each of the metrics. 

## 3. We tested the impact of pre-processing on the datasets and the efficiency of each model. 

## 4. Finally, we investigated the influence of 
a. number of topics K 
b. number of iterations
c. number of pseudo documents for PTM and SATM 
d. impact of M and λ on GPU-PDMM
