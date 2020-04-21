package first_chapter.radomstring;

public class RandomString {
    String[] wordListOne = {"sfsdf", "sdf", "erte", "yuty"};
    String[] wordListTwo = {"34", "57687", "67"};
    String[] wordListThree = {"*&('", "&^*'", "&^$#%"};

    int oneLenth = wordListOne.length;
    int twoLenth = wordListTwo.length;
    int threeLenth = wordListThree.length;

    public void printRandomString(){
        int rand1 = (int) Math.random() * oneLenth;
        int rand2 = (int) Math.random() * twoLenth;
        int rand3 = (int) Math.random() * threeLenth;

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is " + phrase);
    }
}
