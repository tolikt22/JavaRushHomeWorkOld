package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String zerg1 = new Zerg().name="sdsdf";
        String zerg2 = new Zerg().name="sassfdsdf";
        String zerg3 = new Zerg().name="sasvdfdsdf";
        String zerg4 = new Zerg().name="sassddsdf";
        String zerg5 = new Zerg().name="sasrwedsdf";
        String zerg6 = new Zerg().name="sasdgsdfgsdf";
        String zerg7 = new Zerg().name="sasdrtusdf";
        String zerg8 = new Zerg().name="sasdfkfsdf";
        String zerg9 = new Zerg().name="sasfgkfdsdf";
        String zerg10 = new Zerg().name="sasdsvbmvdf";

        String protos1 = new Protos().name="protq";
        String protos2 = new Protos().name="protqwe";
        String protos3 = new Protos().name="protqdf";
        String protos4 = new Protos().name="protqgf";
        String protos5 = new Protos().name="protqhg";

        String terr1 = new Terran().name="terr";
        String terr2 = new Terran().name="terrer";
        String terr3 = new Terran().name="terrgy";
        String terr4 = new Terran().name="terrjuj";
        String terr5 = new Terran().name="terrjh";
        String terr6 = new Terran().name="terrijh";
        String terr7 = new Terran().name="terrki";
        String terr8 = new Terran().name="terruhrf";
        String terr9 = new Terran().name="terrjhg";
        String terr10 = new Terran().name="terrrtg";
        String terr11 = new Terran().name="terruygt";
        String terr12 = new Terran().name="terryhbuj";

    }



    public static class Zerg
    {
        public String name;


    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}