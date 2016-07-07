public class Main {

    public static void main(String[] args) {
       String[] worldListOne = {
               "Круглосуточный", "трех-звенный", "взаимный"
       };
        String[] wordListTwo = {
                "уполномоченный", "трудный", "чистый продукт"
        };
        String[] wordListThree = {
                "процесс", "пункт разгрузки", "выход из положения"
        };

        int oneLength = worldListOne.length;
        int wtoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*wtoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = worldListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
