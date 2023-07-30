package lab1;

import java.util.*;


public class TacticalStringBuilder {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> wordFrequencyMap = new LinkedHashMap<>();

        // 단어 입력받기
        System.out.println("여러 단어를 입력하세요 (빈 줄 입력 시 종료):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            String[] words = input.split("\\s+"); // 공백을 기준으로 단어 분리
            for (String word : words) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        scanner.close();

        // 단어들을 중복 없이 오름차순으로 정렬하여 StringBuilder에 추가
        StringBuilder stringBuilder = new StringBuilder();
        Set<String> sortedWords = new TreeSet<>(wordFrequencyMap.keySet());
        for (String word : sortedWords) {
            int frequency = wordFrequencyMap.get(word);
            stringBuilder.append(word).append(" (").append(frequency).append(" times)").append("\n");
        }

        // 결과 출력
        System.out.println("단어들의 오름차순 정렬 및 빈도수 출력:");
        System.out.println(stringBuilder.toString());


        
    }
}
