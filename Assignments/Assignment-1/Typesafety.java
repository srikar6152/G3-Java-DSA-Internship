package week1.assignment;

public class Typesafety<T> {
 private T data;

 public Typesafety(T data) {
     this.data = data;
 }

 public T getData() {
     return data;
 }

 public static void main(String[] args) {
     Typesafety<String> ts = new Typesafety<>("Hello, Generics!");
     System.out.println("Data: " + ts.getData());

 }
}
