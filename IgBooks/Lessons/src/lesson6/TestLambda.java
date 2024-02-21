package lesson6;

public class TestLambda {
    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
        for(String currentStr:strList){
            if (analyzer.analyze(currentStr, searchStr)){
                System.out.println("Match: " + currentStr);
            }
        }
    }

    public static void main(String[] args) {
        String[] strList01 =
                {"tomorrow","toto","to","timbukto","the","hello","heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        // Call concrete class that implments StringAnalyzer
//    ContainsAnalyzer contains = new ContainsAnalyzer();

        System.out.println("===Contains===");
        TestInnerClassFunctionalInterface.searchArr(strList01, searchStr,
                (String target, String search) -> target.startsWith("h"));


    }
}
