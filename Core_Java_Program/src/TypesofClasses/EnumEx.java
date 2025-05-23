package TypesofClasses;

public class EnumEx {
  // Method that takes an enum value as an argument
  public void printActivity(Priorities priority) {
    switch (priority) {
      case LOW:
        System.out.println("Resting");
        break;
      case MEDIUM:
        System.out.println("Learning");
        break;
      case HIGH:
        System.out.println("Working");
        break;
      default:
        System.out.println("Enjoying");
        break;
    }
  }

  public static void main(String[] args) {
    // Using the enum constants
    Priorities now = Priorities.MEDIUM;

    EnumEx print = new EnumEx();
    print.printActivity(now); // Output: Learning
  }
}
