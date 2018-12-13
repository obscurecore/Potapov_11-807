
import java.util.*;

public class SearchEngineImpl implements SearchEngine {
    /*

    public void sort(TextProvider target, List<TextProvider> sources) {
        int size = sources.size();
        List LS = new ArrayList<>();
        System.out.println("List"+LS);

        TextAnalyzer b = new Cos();
        Map<Double, List<String>> hashMap = new HashMap<Double, List<String>>();
        for (int i = 0; i < sources.size(); i++) {
            double coef1 =  b.analyze(target, sources.get(i));
            System.out.println(coef1);

            if (hashMap.containsKey(coef1)) {
                hashMap.get(coef1).add(String.valueOf(sources.get(i)));
                System.out.println("CHECK");
                System.out.println("Hash" +hashMap);
            }
            else
                //LS.clear();
                LS.add(sources.get(i));
                System.out.println("LS"+LS);
                hashMap.put(coef1, LS);

                //System.out.println((double) (coef1^(coef1>>>32)));

            //int coef2 = (int)(coef1 ^ (coef1 >>> 32));
            //System.out.println(coef1);
            //List<TextProvider> current = hashMap.get(coef1);
            //hashMap.computeIfAbsent(coef1,V -> new ArrayList<>()).add(sources.get(i));
            //hashMap.computeIfAbsent(coef1, k -> new ArrayList<>()).add(sources.get(i));
            //hashMap.put((int) (coef1 ^ (coef1 >>> 32)), sources.get(i));
            System.out.println(hashMap);
        }
        //hashMap.entrySet().stream()
               // .sorted(Map.Entry.<Integer, TextProvider>comparingByKey().reversed())
                //.forEach(System.out::println);

        }
        */


    //Collections.sort( List<TextProvider> sources, TextProvider);
    @Override

    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        TextAnalyzer analyzer = new Cos();
        for (int i = 0; i < sources.size(); i++) {
            for (int j = sources.size()-1; j > i; j--) {
                double coef1 = analyzer.analyze(target, sources.get(j-1));
                double coef2 = analyzer.analyze(target, sources.get(j));
                if (coef1 < coef2) {
                    TextProvider t = sources.remove(j-1);
                    sources.add(j, t);
                }
            }
        }
        return sources;
    }
}

