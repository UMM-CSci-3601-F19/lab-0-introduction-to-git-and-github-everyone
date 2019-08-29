/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static final String WELCOME_LINE = "Hello, folks!";

  public static void main(String[] args) {
    String output = generateOutput();
    System.out.println(output);
  }

  public static String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(WELCOME_LINE + "\n");
    builder.append(davidSaysHello());
    builder.append(kkSaysHello());
    builder.append(michaelSaysHello());
    builder.append(matthewSaysHello());
    builder.append(machiSaysHello());
    builder.append(nicSaysHello());
    builder.append(zangSaysHello());
    builder.append(tylerSaysHello());
    builder.append(kaiSaysHello());


    return builder.toString();
  }

  private static String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private static String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private static String tylerSaysHello() {return "Tyler says 'Good Morning!'\n";}

  private static String davidSaysHello() {return "David says 'Hellö!'\n";}

  private static String machiSaysHello() {
    return "Machi says 'Howdy!'\n";
  }

  private static String matthewSaysHello() {
    return "Matthew says 'hi!'\n";
  }

  private static String michaelSaysHello() {
    return "Michael says 'Hey!'\n";
  }

  private static String zangSaysHello() {
    return "Zang says 'Hello!'\n";
  }

}
