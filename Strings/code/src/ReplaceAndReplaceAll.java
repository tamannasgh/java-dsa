public class ReplaceAndReplaceAll {
    public static void main(String[] args) {
        String name = "a.a";
//        String newString = name.replaceAll(".", "o");  // isse poora o hi ho jaega "ooo" agr regex ko replace krna hota hai to \\<regex> krke kro nhi to replace se

//        String newString = name.replaceAll("\\.", "o");  //this will work
        String newString = name.replace(".", "o");
        System.out.println(newString);

    }
}
