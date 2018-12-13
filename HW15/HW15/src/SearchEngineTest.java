
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngineTest {
    public static void main(String[] args) throws IOException {
        List<TextProvider> providers = new ArrayList<>();

        SearchEngine se = new SearchEngineImpl();
        String s1 = "Мама мыла раму, а я ничего не делал";
        File f1 = createFile("f1.txt", s1);
        File file = new File("D:\\example\\input.txt");
        List ls = new ArrayList();
        ls=(Files.walk(Paths.get("C:\\Peppa Pig")).filter(Files::isRegularFile).collect(Collectors.toList()));
        TextProvider[] array = new FileTextProvider[ls.size()];
        //String[] OWO = (String[]) ls.toArray(new String[ls.size()]);
        List<String[]> LS = new ArrayList<String[]>(ls);
        int size = ls.size();
        String[] POP = new String[size];
        for (int i = 0; i <size ; i++) {
            POP[i] = String.valueOf(LS.get(i));
        }
        //String[] myArray = LS.toArray(new String[0]);
        File[] arr = new File[ls.size()];
        String way;
        for (int y = 0; y<ls.size() ; y++) {
            //System.out.println(POP[y]);
            way = POP[y];
            arr[y] = new File(way);
            array[y] = new FileTextProvider(arr[y]);
            providers.add(array[y]);
        }



        TextProvider ki = new FileTextProvider(f1);
        TextProvider query = new SimpleTextProvider("Мама мыла");//Main
        TextProvider tp1 = new SimpleTextProvider("Мамддлодлодлодлоа мыдддддддддддддддддла раму");
        TextProvider tp2 = new SimpleTextProvider("Мама раму мыла");
        TextProvider tp3 = new SimpleTextProvider("Мама помыла раму");
        TextProvider tp4 = new SimpleTextProvider("Мама и рама");
        providers.add(tp1);
        providers.add(tp2);
        providers.add(tp3);
        providers.add(tp4);
        //providers.add(ki);
        //System.out.println(providers);


        // List<TextProvider> results = se.getSortedByRelevanceList(query, providers);
        ((SearchEngineImpl) se).sort(query,providers);
       // for (TextProvider tp : results) {
       //     System.out.println(tp);
       // }

    }

    private static File createFile(String fileName, String content) throws FileNotFoundException {
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
        pw.print(content);
        pw.close();
        return f;
    }

}
