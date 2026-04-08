package calculate5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultManager {

    //필드
    private List<Double> resultList;

    //생성자
    public ResultManager(){
        resultList = new ArrayList<>();
    }

    //결과 메서드
    public void addResult(double result){
        resultList.add(result);
    }

    //합계 매서드
    public double getTotalSum() {
        return resultList.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    //평균 메서드
    public double getAverage(){
        return resultList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    //양수 필터링매서드
    public List<Double> getPositiveResults(){

        return resultList.stream()
                .filter(OperationValidator ::isPositive)
                .collect(Collectors.toList());
    }

    //최대값
    public double getMaximum(){
        return resultList.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
    }
    //최소값
    public double getMinimum() {
        return resultList.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElse(0.0);
    }

    //리스트 반환
    public  List<Double> getResultList(){
        return resultList;
    }

    //통계 출력
    public void printStatistics(){
        System.out.println("=== 통계 ===");
        System.out.println("전체 합계: " + getTotalSum());
        System.out.println("평균: " + getAverage());
        System.out.println("최댓 값:" + getMaximum());
        System.out.println("최소 값 " + getMinimum());
        System.out.println("양의 개수 " + getPositiveResults().size());
    }

}
