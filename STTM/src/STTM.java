import eval.CoherenceEval;
import models.*;
import models.inf.DMM_Inf;
import models.inf.LDA_Inf;
import models.inf.LFDMM_Inf;
import models.inf.LFLDA;
import models.inf.LFLDA_Inf;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import utility.CmdArgs;
import eval.ClusteringEval;
import eval.ClassificationEval;

/**
 * STTM: A Java package for the short text topic models including DMM, BTM, WNTM, PTM, SATM, LDA, LFDMM, LFLDA, etc.
 *
 * 
 * @author: Jipeng Qiang
 * 
 * @version: 1.0
 * 
 */
public class STTM
{
	public static void main(String[] args)
	{

		CmdArgs cmdArgs = new CmdArgs();
		CmdLineParser parser = new CmdLineParser(cmdArgs);
		try {
		
//		Infer topics 
			
			
			
			
			
//		  String []aargs="-model ClusteringEval -label dataset/StackOverflow_label.txt -dir results -prob StackOverflow-GS-DMM.theta".split(" ");
//		  String []aargs="-model DMM -corpus dataset/StackOverflow.txt -alpha 0.1 -beta 0.1 -niters 1500 -name StackOverflow-GS-DMM".split(" ");
			
			
		 
//	      BTM
//	      String []aargs="-model BTM -corpus dataset/GoogleNews.txt -ntopics 152 -alpha a/K -beta 0.01 -name GoogleNews-BTM".split(" ");

//	      WNTM
//	      String []aargs="-model WNTM -corpus dataset/GoogleNews.txt -ntopics 152 -alpha 0.1 -beta 0.1 -name GoogleNews-WNTM".split(" ");
//		  String []aargs="-model ClassificationEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-WNTM.theta".split(" ");
//		  String []aargs="-model ClusteringEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-WNTM.theta".split(" ");
//		  String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords GoogleNews-WNTM.topWords".split(" ");
		  
//	      LF-DMM
//	      String []aargs="-model LFDMM -corpus dataset/GoogleNews.txt -vectors dataset/glove.6B.200d.txt -ntopics 152 -alpha 0.1 -beta 0.01 -lambda 0.6 -niters 1000 -name GoogleNews-LF-DMM".split(" ");
	      
//	      GPU-DMM
//	      String []aargs="-model GPUDMM -corpus dataset/GoogleNews.txt -vectors dataset/glove.6B.200d.txt -ntopics 152 -alpha a/K -beta 0.01 -name GoogleNews-GPU-DMM".split(" ");
//	      String []aargs="-model ClassificationEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-GPU-DMM.theta".split(" ");
//	      String []aargs="-model ClusteringEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-GPU-DMM.theta".split(" ");
//	      String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords GoogleNews-GPU-DMM.topWords".split(" ");

	      
	      
//	      GPU-PDMM
//	      String []aargs="-model GPU_PDMM -corpus dataset/GoogleNews.txt -vectors dataset/glove.6B.200d.txt -ntopics 152 -alpha a/K -beta 0.01 -lambda 1.5 -maxTd 2 -name GoogleNews-GPU-PDMM".split(" ");
//		  String []aargs="-model ClassificationEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-GPU-PDMM.theta".split(" ");
//	      String []aargs="-model ClusteringEval -label dataset/GoogleNews_LABEL.txt -dir results -prob GoogleNews-GPU-PDMM.theta".split(" ");
//	      String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords GoogleNews-GPU-PDMM.topWords".split(" ");
//	      SATM
//	      String []aargs="-model SATM -corpus dataset/GoogleNews.txt -ntopics 152 -alpha 0.328 -beta 0.1 -nlongdoc 300 -name GoogleNews-SATM".split(" ");
	      
//	      PTM
//	      String []aargs="-model PTM -corpus dataset/GoogleNews.txt -ntopics 152 -alpha 0.1 -beta 0.01 -nlongdoc 1000 -name GoogleNews-PTM".split(" ");
			
			
			
//			_________________ Biomedical ________________________
//			LDA
//			String []aargs="-model LDA -corpus dataset/Biomedical.txt -alpha 0.05 -beta 0.01 -name BiomediLDA ".split(" ");
//			String []aargs="-model LDA -corpus dataset/Tweet.txt -ntopics 89 -alpha 0.05 -beta 0.01 -name Tweet_LDA".split(" ");

			
//			GS-DMM
//			String []aargs="-model DMM -corpus dataset/Biomedical.txt -alpha 0.1 -beta 0.1 -name Biomedi_GS-DMM".split(" ");
			
//			BTM
//			String []aargs="-model BTM -corpus dataset/Biomedical.txt -alpha a/K -beta 0.01 -name Biomedi_BTM".split(" ");
			
//			WNTM
//			String []aargs="-model WNTM -corpus dataset/Biomedical.txt -ntopics 100 -alpha 0.1 -beta 0.1 -name Biomedi_WNTM".split(" ");

//			SATM
//			String []aargs="-model SATM -corpus dataset/Biomedical.txt -alpha 2.5 -beta 0.1 -nlongdoc 300 -name Biomedi_SATM".split(" ");
			
//			PTM
//			String []aargs="-model PTM -corpus dataset/Biomedical.txt -alpha 0.1 -beta 0.01 -nlongdoc 1000 -name Biomedi_PTM".split(" ");

//			LF-DMM
//			String []aargs="-model LFDMM -corpus dataset/Biomedical.txt -vectors dataset/glove.6B.200d.txt -alpha 0.1 -beta 0.01 -lambda 0.6 -niters 1000 -name Biomedi_LF-DMM".split(" ");
			
//			GPU-DMM
//			String []aargs="-model GPUDMM -corpus dataset/Biomedical.txt -vectors dataset/glove.6B.200d.txt -alpha a/K -beta 0.01 -name Biomedi_GPU-DMM".split(" ");
			
//			GPU-PDMM
//			String []aargs="-model GPU_PDMM -corpus dataset/Biomedical.txt -vectors dataset/glove.6B.200d.txt -alpha a/K -beta 0.01 -lambda 1.5 -maxTd 2 -name Biomedi_GPU-PDMM".split(" ");
			
			
			
//			>> Evaluation
			
//			------------------------Classification-------------------------------
			
//			LDA
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob BiomediLDA.theta".split(" ");
//			GS-DMM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GS-DMM.theta".split(" ");
			
//			BTM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_BTM.theta".split(" ");
			
//			WNTM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_WNTM.theta".split(" ");
			

//			SATM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_SATM.theta".split(" ");
			
//			PTM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_PTM.theta".split(" ");
			
//			LF-DMM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_LF-DMM.theta".split(" ");
			
//			GPU-DMM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GPU-DMM.theta".split(" ");
			
//			GPU-PDMM
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GPU-PDMM.theta".split(" ");
			
//			--------------------------Clustering --------------------------------
//			LDA
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob BiomediLDA.theta".split(" ");	
//			String []aargs="-model ClusteringEval -label dataset/Tweet_LABEL.txt -dir results -prob Tweet_LDA.theta".split(" ");
			
//			GS-DMM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GS-DMM.theta".split(" ");
			
//			BTM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_BTM.theta".split(" ");
			
//			WNTM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_WNTM.theta".split(" ");
			
//			SATM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_SATM.theta".split(" ");
			
//			PTM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_PTM.theta".split(" ");
			
//			LF-DMM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_LF-DMM.theta".split(" ");
			
//			GPU-DMM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GPU-DMM.theta".split(" ");
			
//			GPU-PDMM
//			String []aargs="-model ClusteringEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GPU-PDMM.theta".split(" ");
			
			
//			-------------------------- Coherence --------------------------------
			
//			LDA
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords BiomediLDA.topWords".split(" ");
			
//			GS_DMM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_GS-DMM.topWords".split(" ");
			
//			BTM
//			String []aargs="-model CoherenceEval -label dataset/wiki.txt -dir results -topWords Biomedi_BTM.topWords".split(" ");
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_BTM.topWords".split(" ");
			
//			WNTM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_WNTM.topWords".split(" ");
			
			
//			SATM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_SATM.topWords".split(" ");
			
//			PTM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_PTM.topWords".split(" ");
			
			
//			LF-DMM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_LF-DMM.topWords".split(" ");
			
			
//			GPU-DMM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_GPU-DMM.topWords".split(" ");
			
//			GPU-PDMM
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords Biomedi_GPU-PDMM.topWords".split(" ");
			
			
//			---------------- Unseen -------------------
			
//			String []aargs="-model DMM -corpus dataset/Tweet.txt -name SearchSnippets-unseen".split(" ");	
			String []aargs="-model DMM -paras results/SearchSnippets-unseen.paras -corpus dataset/Tweet.txt -ntopics 20 -niters 500 -name corpus-unseen2corpus".split(" ");	
//			String []aargs="-model ClassificationEval -label dataset/Biomedical_label.txt -dir results -prob Biomedi_GPU-PDMM.theta".split(" ");
//			String []aargs="-model CoherenceEval -label dataset/wiki2.en.text -dir results -topWords SOF-unseen.topWords".split(" ");

			
//			String []aargs="-model LDA -corpus dataset/SearchSnippets.txt -name corpusLDA".split(" ");			
//			String []aargs="-model ClusteringEval -label dataset/SearchSnippets_label.txt -dir results -prob corpusLDA.theta".split(" ");		
			
			parser.parseArgument(aargs);

//			parser.parseArgument(args);

			if (cmdArgs.model.equals("LDA")) {
				LDA lda = new LDA(cmdArgs.corpus,
					cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
					cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName);
				lda.inference();
			}
			else if (cmdArgs.model.equals("DMM")) {
				DMM dmm = new DMM(cmdArgs.corpus,
					cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
					cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName);
				dmm.inference();
			}
			else if (cmdArgs.model.equals("BTM")) {
				BTM btm = new BTM(cmdArgs.corpus,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				btm.inference();
			}
			else if (cmdArgs.model.equals("WNTM")) {
				WNTM wntm = new WNTM(cmdArgs.corpus,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.window, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				wntm.inference();
			}
			else if (cmdArgs.model.equals("SATM")) {
				SATM satm = new SATM(cmdArgs.corpus,
						cmdArgs.ntopics, cmdArgs.nLongDoc, cmdArgs.threshold, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				satm.inference();
			}else if (cmdArgs.model.equals("PTM")) {
				PTM ptm = new PTM(cmdArgs.corpus, cmdArgs.ntopics, cmdArgs.nLongDoc, cmdArgs.alpha, cmdArgs.beta, cmdArgs.gamma,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				ptm.inference();
			}
			else if (cmdArgs.model.equals("GPUDMM")) {
				GPUDMM gpudmm = new GPUDMM(cmdArgs.corpus, cmdArgs.vectors,cmdArgs.weight,cmdArgs.GPUthreshold,cmdArgs.filterSize,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				gpudmm.inference();
			}else if (cmdArgs.model.equals("GPU_PDMM")) {
				GPU_PDMM gpupdmm = new GPU_PDMM(cmdArgs.corpus, cmdArgs.vectors,cmdArgs.weight,cmdArgs.GPUthreshold,cmdArgs.filterSize,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta, cmdArgs.lambda,
						cmdArgs.niters, cmdArgs.twords, cmdArgs.maxTd, cmdArgs.searchTopK, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				gpupdmm.inference();
			}
			else if (cmdArgs.model.equals("LDAinf")) {
				LDA_Inf lda = new LDA_Inf(
					cmdArgs.paras, cmdArgs.corpus, cmdArgs.niters,
					cmdArgs.twords, cmdArgs.expModelName, cmdArgs.savestep);
				lda.inference();
			}
			else if (cmdArgs.model.equals("DMMinf")) {
				DMM_Inf dmm = new DMM_Inf(
					cmdArgs.paras, cmdArgs.corpus, cmdArgs.niters,
					cmdArgs.twords, cmdArgs.expModelName, cmdArgs.savestep);
				dmm.inference();
			}
			else if (cmdArgs.model.equals("LFLDA")) {
				LFLDA lflda = new LFLDA(cmdArgs.corpus, cmdArgs.vectors,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.lambda, cmdArgs.niters, cmdArgs.niters,
						cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				lflda.inference();
			}
			else if (cmdArgs.model.equals("LFDMM")) {
				LFDMM lfdmm = new LFDMM(cmdArgs.corpus, cmdArgs.vectors,
						cmdArgs.ntopics, cmdArgs.alpha, cmdArgs.beta,
						cmdArgs.lambda, cmdArgs.niters, cmdArgs.niters,
						cmdArgs.twords, cmdArgs.expModelName,
						cmdArgs.initTopicAssgns, cmdArgs.savestep);
				lfdmm.inference();
			}
			else if (cmdArgs.model.equals("LFLDAinf")) {
				LFLDA_Inf lfldaInf = new LFLDA_Inf(cmdArgs.paras,
						cmdArgs.corpus, cmdArgs.niters, cmdArgs.niters,
						cmdArgs.twords, cmdArgs.expModelName, cmdArgs.savestep);
				lfldaInf.inference();
			}
			else if (cmdArgs.model.equals("LFDMMinf")) {
				LFDMM_Inf lfdmmInf = new LFDMM_Inf(cmdArgs.paras,
						cmdArgs.corpus, cmdArgs.niters, cmdArgs.niters,
						cmdArgs.twords, cmdArgs.expModelName, cmdArgs.savestep);
				lfdmmInf.inference();
			}
			else if (cmdArgs.model.equals("ClusteringEval")) {
				ClusteringEval.evaluate(cmdArgs.labelFile, cmdArgs.dir,
					cmdArgs.prob);
			}else if (cmdArgs.model.equals("ClassificationEval")) {
				ClassificationEval.evaluate(cmdArgs.labelFile, cmdArgs.dir,
						cmdArgs.prob);
			}else if (cmdArgs.model.equals("CoherenceEval")) {
					CoherenceEval ce = new CoherenceEval();
				    ce.evaluate(cmdArgs.labelFile, cmdArgs.dir,
							cmdArgs.topWords);
				}
			else {
				System.out
					.println("Error: Option \"-model\" must get \"LDA\" or \"DMM\" or \"BTM\" or \"WNTM\" or \"SATM\" or \"GPUDMM\" or \"GPU_PDMM\" or \"LDALDA\" or \"LFDMM\" or \"Eval\"");
				System.out
					.println("\tLDA: Specify the Latent Dirichlet Allocation topic model");
				System.out
					.println("\tDMM: Specify the one-topic-per-document Dirichlet Multinomial Mixture model");
				System.out
						.println("\tBTM: Infer topics for Biterm");
				System.out
						.println("\tWNTM: Infer topics for WNTM");
				System.out
						.println("\tSATM: Infer topics using SATM");
				System.out
						.println("\tPTM: Infer topics using PTM");
				System.out
						.println("\tGPUDMM: Infer topics using GPUDMM");
				System.out
						.println("\tGPU_PDMM: Infer topics using GPU_PDMM");
				System.out
						.println("\tLFLDA: Infer topics using LFLDA");
				System.out
						.println("\tLFDMM: Infer topics using LFDMM");
				System.out
					.println("\tLDAinf: Infer topics for unseen corpus using a pre-trained LDA model");
				System.out
					.println("\tDMMinf: Infer topics for unseen corpus using a pre-trained DMM model");
				System.out
					.println("\tEval: Specify the document clustering evaluation");
				help(parser);
				return;
			}
		}
		catch (CmdLineException cle) {
			System.out.println("Error: " + cle.getMessage());
			help(parser);
			return;
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("end!!!!!!!");
	}

	public static void help(CmdLineParser parser)
	{
		System.out
			.println("java -jar jSTTM.jar [options ...] [arguments...]");
		parser.printUsage(System.out);
	}
}



