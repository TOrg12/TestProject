import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int option = 0;
        do {
            System.out.println("Enter task number:");
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:


                case 2:
                case 3:
                    System.out.println("1 dollar costs 40 hryvnias");
                    System.out.println("Enter amount of dollars:");
                    double dollars = Integer.parseInt(br.readLine());
                    double hryvnias = dollars * 40;
                    System.out.println("It is " + hryvnias + " hryvnias");
                    while (option != 3) ;
                case 4:
                    System.out.println("\nInput string: ");
                    String s = br.readLine();
                    String loudLetters = "aeiouy";
                    AtomicInteger count = new AtomicInteger();
                    Arrays.stream(s
                                    .split(""))
                            .forEach(letter -> {
                                if(loudLetters.contains(letter)){
                                    count.getAndIncrement();
                                }
                            });
                    System.out.println(count);

                    break;
                case 5:
                    String temp = parseInt(br.readLine());
                    String temp  = text.replaceAll("\\s+", "").toLowerCase();
                    return temp === IntStream.range(0, temp.length() / 2)
                            .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));

            }
        } while (option != 15);
    }
}
