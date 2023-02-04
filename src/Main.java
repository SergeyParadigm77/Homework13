public class Main {
    public static void main(String[] args) {
        Author coelho = new Author("Паоло", "Коэльо");
        Book alchemist = new Book("Алхимик", 1988, coelho);
        alchemist.setYearPublication(1995);
        Author aitmatov = new Author("Чингиз", "Айтматов");
        Book scaffold = new Book("Плаха", 1986, aitmatov);

        Book alchemist1 = new Book("Алхимик",1988, coelho); //добавлено для проверки работы переопределенного метода equals
        Author coelho1 = new Author("Паоло", "Коэльо"); //добавлено для проверки работы переопределенного метода equals

        System.out.println(coelho);
        System.out.println(aitmatov);

        System.out.println(alchemist);
        System.out.println(scaffold);

        System.out.println(coelho.equals(aitmatov));
        System.out.println(coelho.equals(coelho1));
        System.out.println(alchemist.equals(scaffold));
        System.out.println(alchemist.equals(alchemist1));

        System.out.println(alchemist.hashCode());
        System.out.println(alchemist1.hashCode());
        System.out.println(scaffold.hashCode());

        System.out.println(coelho.hashCode());
        System.out.println(coelho1.hashCode());
        System.out.println(aitmatov.hashCode());

    }
}