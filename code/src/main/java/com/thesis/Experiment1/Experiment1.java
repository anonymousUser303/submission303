package com.thesis.Experiment1;


import com.thesis.kbInconsistencyLocator.InconsistencyLocator;


/**
 Testsuite holds a simple implementation of the functionality of the knowledge base generator.

 CREATED by:
anonymoussubmittor@gmail.com
 */
public class Experiment1 {

    public static void main(String[] args) throws Exception {
        //String AbsoluteName = "code/resources/";

        String hdt;
        String hdtName;

        hdt = AbsoluteName + "HDTs/pizza.hdt";
        hdtName = "pizza.hdt";


        String rdf = AbsoluteName + "RDFs/";
        String samples = AbsoluteName + "Samples/";
        String inconsistencyJSON = AbsoluteName + "StatResults/" + hdtName.replace(".hdt", "") + "/";
        String temp = AbsoluteName + "extraFiles/temp/" + hdtName.replace(".hdt", "") + "/";

        System.out.println("AbsoluteName: " + AbsoluteName);
        System.out.println("rdf: " + rdf);
        System.out.println("hdt: " + hdt);
        System.out.println("samples: " + samples + "Sample-" + hdtName);
        System.out.println("inconsistencyJSON: " + inconsistencyJSON);
        System.out.println("temp: " + temp);

        // Inconsistency Locator
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Starting Locating Inconsistencies");
        String[] argsInconsistency = {hdt, rdf, "1", "true", "false", "0", "3000", "true"};
        InconsistencyLocator.main(argsInconsistency);
        int size3000 = InconsistencyLocator.GeneralGraphNumber;
        long time3000 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph3000 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions3000 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns3000 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs3000 = InconsistencyLocator.subgraphs;
        double avgSubgraph3000 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 3000 Subgraph: "+size3000 + " Time Needed: "+ time3000 + "Subgraphs: " + ProcessTimeCreateSubgraph3000+ "Contradictions: " + ProcessTimeFindContradictions3000+"AntiPatterns: " + ProcessTimeCreateAntiPatterns3000);
        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "2000"};
        InconsistencyLocator.main(argsInconsistency);
        int size2000 = InconsistencyLocator.GeneralGraphNumber;
        long time2000 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph2000 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions2000 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns2000 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs2000 = InconsistencyLocator.subgraphs;
        double avgSubgraph2000 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 2000 Subgraph: "+size2000 + " Time Needed: "+ time2000 + "Subgraphs: " + ProcessTimeCreateSubgraph2000+ "Contradictions: " + ProcessTimeFindContradictions2000+"AntiPatterns: " + ProcessTimeCreateAntiPatterns2000);
        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "1000"};
        InconsistencyLocator.main(argsInconsistency);
        int size1000 = InconsistencyLocator.GeneralGraphNumber;
        long time1000 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph1000 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions1000 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns1000 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs1000 = InconsistencyLocator.subgraphs;
        double avgSubgraph1000 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 1000 Subgraph: "+size1000 + " Time Needed: "+ time1000 + "Subgraphs: " + ProcessTimeCreateSubgraph1000+ "Contradictions: " + ProcessTimeFindContradictions1000+"AntiPatterns: " + ProcessTimeCreateAntiPatterns1000);
        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "750"};
        InconsistencyLocator.main(argsInconsistency);
        int size750 = InconsistencyLocator.GeneralGraphNumber;
        long time750 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph750 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions750 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns750 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs750 = InconsistencyLocator.subgraphs;
        double avgSubgraph750 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 750 Subgraph: "+size750 + " Time Needed: "+ time750 + "Subgraphs: " + ProcessTimeCreateSubgraph750+  "Contradictions: " + ProcessTimeFindContradictions750+"AntiPatterns: " + ProcessTimeCreateAntiPatterns750);

        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "500"};
        InconsistencyLocator.main(argsInconsistency);
        int size500 = InconsistencyLocator.GeneralGraphNumber;
        long time500 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph500 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions500 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns500 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs500 = InconsistencyLocator.subgraphs;
        double avgSubgraph500 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 500 Subgraph: "+size500 + " Time Needed: "+ time500 + "Subgraphs: " + ProcessTimeCreateSubgraph500+ "Contradictions: " + ProcessTimeFindContradictions500+"AntiPatterns: " + ProcessTimeCreateAntiPatterns500);

        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "250"};
        InconsistencyLocator.main(argsInconsistency);
        int size250 = InconsistencyLocator.GeneralGraphNumber;
        long time250 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph250 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions250 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns250 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs250 = InconsistencyLocator.subgraphs;
        double avgSubgraph250 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 250 Subgraph: "+size250 + " Time Needed: "+ time250 + "Subgraphs: " + ProcessTimeCreateSubgraph250+  "Contradictions: " + ProcessTimeFindContradictions250+"AntiPatterns: " + ProcessTimeCreateAntiPatterns250);
        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "100"};
        InconsistencyLocator.main(argsInconsistency);
        int size100 = InconsistencyLocator.GeneralGraphNumber;
        long time100 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph100 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions100 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns100 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs100 = InconsistencyLocator.subgraphs;
        double avgSubgraph100 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 100 Subgraph: "+size100 + " Time Needed: "+ time100 + "Subgraphs: " + ProcessTimeCreateSubgraph100+ "Contradictions: " + ProcessTimeFindContradictions100+"AntiPatterns: " + ProcessTimeCreateAntiPatterns100);
        argsInconsistency = new String[]{hdt, rdf, "500", "true", "false", "0", "50"};
        InconsistencyLocator.main(argsInconsistency);
        int size50 = InconsistencyLocator.GeneralGraphNumber;
        long time50 = InconsistencyLocator.timePassed;
        long ProcessTimeCreateSubgraph50 = InconsistencyLocator.ProcessTimeCreateSubgraphTotal;
        long ProcessTimeFindContradictions50 = InconsistencyLocator.ProcessTimeFindContradictionsTotal;
        long ProcessTimeCreateAntiPatterns50 = InconsistencyLocator.ProcessTimeCreateAntiPatternsTotal;
        long subgraphs50 = InconsistencyLocator.subgraphs;
        double avgSubgraph50 = InconsistencyLocator.avgSubgraph;
        System.out.println("size 50 Subgraph: "+size50 + ", Time Needed: "+ time50 + ", Subgraphs: " + ProcessTimeCreateSubgraph50+ ", Contradictions: " + ProcessTimeFindContradictions50+", AntiPatterns: " + ProcessTimeCreateAntiPatterns50 + ", Subgraphs: "+subgraphs50+ ", avgSubgraph: "+avgSubgraph50);
        System.out.println("size 100 Subgraph: "+size100 + ", Time Needed: "+ time100 + ", Subgraphs: " + ProcessTimeCreateSubgraph100+ ", Contradictions: " + ProcessTimeFindContradictions100+", AntiPatterns: " + ProcessTimeCreateAntiPatterns100+ ", Subgraphs: "+subgraphs100+ ", avgSubgraph: "+avgSubgraph100);
        System.out.println("size 250 Subgraph: "+size250 + ", Time Needed: "+ time250 + ", Subgraphs: " + ProcessTimeCreateSubgraph250+  ", Contradictions: " + ProcessTimeFindContradictions250+", AntiPatterns: " + ProcessTimeCreateAntiPatterns250+ ", Subgraphs: "+subgraphs250+ ", avgSubgraph: "+avgSubgraph250);
        System.out.println("size 500 Subgraph: "+size500 + ", Time Needed: "+ time500 + ", Subgraphs: " + ProcessTimeCreateSubgraph500+ ", Contradictions: " + ProcessTimeFindContradictions500+", AntiPatterns: " + ProcessTimeCreateAntiPatterns500+ ", Subgraphs: "+subgraphs500+ ", avgSubgraph: "+avgSubgraph500);
        System.out.println("size 750 Subgraph: "+size750 + ", Time Needed: "+ time750 + ", Subgraphs: " + ProcessTimeCreateSubgraph750+  ", Contradictions: " + ProcessTimeFindContradictions750+ ", AntiPatterns: " + ProcessTimeCreateAntiPatterns750+ ", Subgraphs: "+subgraphs750+ ", avgSubgraph: "+avgSubgraph750);
        System.out.println("size 1000 Subgraph: "+size1000 + ", Time Needed: "+ time1000 + ", Subgraphs: " + ProcessTimeCreateSubgraph1000+ ", Contradictions: " + ProcessTimeFindContradictions1000+", AntiPatterns: " + ProcessTimeCreateAntiPatterns1000+ ", Subgraphs: "+subgraphs1000+ ", avgSubgraph: "+avgSubgraph1000);
        System.out.println("size 2000 Subgraph: "+size2000 + ", Time Needed: "+ time2000 + ", Subgraphs: " + ProcessTimeCreateSubgraph2000+ ", Contradictions: " + ProcessTimeFindContradictions2000+", AntiPatterns: " + ProcessTimeCreateAntiPatterns2000+ ", Subgraphs: "+subgraphs2000+ ", avgSubgraph: "+avgSubgraph2000);
        System.out.println("No Limit Subgraph: "+size3000 + ", Time Needed: "+ time3000 + ", Subgraphs: " + ProcessTimeCreateSubgraph3000+ ", Contradictions: " + ProcessTimeFindContradictions3000+", AntiPatterns: " + ProcessTimeCreateAntiPatterns3000+ ", Subgraphs: "+subgraphs3000+ ", avgSubgraph: "+avgSubgraph3000);
    }

}
