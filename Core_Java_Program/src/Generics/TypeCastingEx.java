package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingEx {

  public static void main(String[] args) {
    // Without generics
    List list = new ArrayList();
    list.add("Hello");
    String str = (String) list.get(0); // Needs explicit cast

    // With generics
    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    String str1 = stringList.get(0); // No cast needed
  }
}
