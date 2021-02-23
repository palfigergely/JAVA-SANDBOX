package GFA.Interview.Lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1: 45 - 2 matches
1 : 1 231 - 3 matches
1 : 103 410 - 4 matches
1 : 43 949 265 - 5 matches
 */

public class Lotto {
  public static void main(String[] args) {
    Map<Integer, Integer> result = new HashMap<>();
    for(int i=0; i<=5; i++){
      result.put(i, 0);
    }
    int numberOfMatches = 0;
    long numberOfWeeks = 0;

    while(result.get(5) < 1){
      numberOfMatches = 0;    //reset the counter
      numberOfWeeks++;    //incr. the num. of weeks
      List<Integer> winner = makeAList();    // create the random winner unique numbers
      List<Integer> trial = makeAList();    //create the random trial unique numbers

      for(int i=0; i<trial.size(); i++){    //check the matches
        if(winner.contains(trial.get(i))){
          numberOfMatches++;
        }
      }
      if(numberOfMatches == 4){
        System.out.println("4 matches on week "+numberOfWeeks);
      }
      result.put(numberOfMatches, result.get(numberOfMatches)+1);

    }

    //print statistics
    System.out.println("Played over "+numberOfWeeks+" weeks... -> "+numberOfWeeks/52+" yrs");
    for(int i=0; i<result.size(); i++){
      double rate = (double)result.get(i) / (double)numberOfWeeks;
      System.out.println(i+" match(es): "+result.get(i)+" time(s) -> "+String.format("%.6f",rate*100)+" % -> 1:"+String.format("%.1f",1/rate));
    }

  }

  public static List<Integer> makeAList(){
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<5; i++){
      int number = (int) Math.round(Math.random()*90) + 1;
      if(!list.contains(number)){
        list.add(number);
      }
    }
    return list;
  }
}
