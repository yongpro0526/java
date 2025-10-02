package api.ramda.basic2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int a = 1; a <= 100; a++){
            list.add(new Random().nextInt(100) + 1);
        }
        System.out.println(list.toString());
        System.out.println("---");

        // 중복제거 distinct
        System.out.print("[");
        list.stream().distinct().forEach(s -> System.out.print(s + ", "));
        System.out.println("]");
        System.out.println("---");

        // 정렬 sort
        System.out.print("[");
        list.stream().sorted().forEach(s -> System.out.print(s + ", "));
        System.out.println("]");
        System.out.println("---");

        // 필터 filter
        System.out.print("[");
        list.stream().filter(x -> x >= 50).sorted().forEach(s -> System.out.print(s + ", "));
        System.out.println("]");
        System.out.println("---");

        // map 새로운 리스트로 반환
        System.out.print("[");
        list.stream().map(s -> s % 2 == 0 ? "짝" : "홀").forEach(s -> System.out.print(s + ", "));
        System.out.println("]");
        System.out.println("---");

        // mapTo~~~~
        long x = list.stream().mapToDouble(s -> s * s).count();
        System.out.println("리스트 개수: " + x);
        System.out.println("---");

        // 집계함수
        int sum = list.stream().mapToInt(s -> s).sum();
        System.out.println("리스트 합계: " + sum);
        OptionalDouble result = list.stream().mapToInt(s -> s).average();
        double avg = result.getAsDouble();
        System.out.println("리스트 평균: " + avg);
        Optional<Integer> result2 = list.stream().max((a, b) -> a.compareTo(b));
        int max = result2.get();
        System.out.println("리스트 안에서 가장 큰 값: " + max);
        System.out.println("---");

        // collect() - 새로운 타입의 컬렉션으로 집계할 때 사용함
        List<Integer> newList = list.stream().filter(i -> i >= 80).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println("---");

        String[] arr = {"hong", "lee", "kim", "choi", "park", "kim"};
        // 이 배열을 이름 순으로 정렬하고, 중복되는 데이터를 제거하고 싶음.
        List<String> result3 = Arrays.asList(arr).stream().sorted().distinct().collect(Collectors.toList());
        System.out.print(result3 + ", ");


    }
}
