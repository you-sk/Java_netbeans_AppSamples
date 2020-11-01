package fizzbuzz;

public class FizzBuzz {

    public static String answer(int no) {
        //3でも5でも割れるときはFizzBuzz
        if (no % 3 == 0 && no % 5 == 0) {
            return "FizzBuzz";
        }
        //3で割れるときはFizz
        if (no % 3 == 0) {
            return "Fizz";
        }
        //5で割れるときはBuzz
        if (no % 5 == 0) {
            return "Buzz";
        }
        //どれにも当てはまらないときは数値そのまま
        return String.valueOf(no);
    }

}
