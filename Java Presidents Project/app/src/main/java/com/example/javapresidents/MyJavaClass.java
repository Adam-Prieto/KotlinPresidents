package com.example.javapresidents;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyJavaClass extends Application
{
    private static List<President> presidentList = new ArrayList<President>();
    private static int nextInt = 10;

    //****************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public static List<President> getPresidentList()
    {
        return presidentList;
    } // End getPresidentList

    //****************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public static void setPresidentList(List<President> presidentList)
    {
        MyJavaClass.presidentList = presidentList;
    } // End setPresidentList

    //****************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public static int getNextInt()
    {
        return nextInt;
    } // End getNextInt

    //************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public static void setNextInt(int nextInt)
    {
        MyJavaClass.nextInt = nextInt;
    } // End setNextInt

    //************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public MyJavaClass()
    {
        fillPresidentList();
    } // End constructor

    //************************************************************************

    /**
     * @methodName:
     * @param:
     * @return:
     * @description:
     */

    public void fillPresidentList()
    {
        // Create president objects
        President p0 = new President(0, "George Washington", 1789,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/b/b6" +
                                     "/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/240px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg");
        President p1 = new President(1, "John Adams", 1797,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/f/ff" +
                                     "/Gilbert_Stuart%2C_John_Adams%2C_c" +
                                     "._1800-1815%2C_NGA_42933" +
                                     ".jpg/330px-Gilbert_Stuart%2C_John_Adams" +
                                     "%2C_c._1800-1815%2C_NGA_42933.jpg");
        President p2 = new President(2, "Thomas Jefferson", 1801,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/b/b1" +
                                     "/Official_Presidential_portrait_of_Thomas_Jefferson_%28by_Rembrandt_Peale%2C_1800%29%28cropped%29.jpg/330px-Official_Presidential_portrait_of_Thomas_Jefferson_%28by_Rembrandt_Peale%2C_1800%29%28cropped%29.jpg");
        President p3 = new President(3, "James Madison", 1809,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/2/20" +
                                     "/James_Madison%28cropped%29%28c%29" +
                                     ".jpg/330px-James_Madison%28cropped%29" +
                                     "%28c%29.jpg");
        President p4 = new President(4, "James Monroe", 1817,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/d/d4" +
                                     "/James_Monroe_White_House_portrait_1819" +
                                     ".jpg/330px" +
                                     "-James_Monroe_White_House_portrait_1819" +
                                     ".jpg");
        President p5 = new President(5, "John Quincy Adams", 1825,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/e/e8" +
                                     "/JQA_Photo_Crop" +
                                     ".jpg/330px-JQA_Photo_Crop.jpg");
        President p6 = new President(6, "Andrew Jackson", 1829,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/4/43" +
                                     "/Andrew_jackson_head" +
                                     ".jpg/330px-Andrew_jackson_head.jpg");
        President p7 = new President(7, "Martin Van Buren", 1837,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/1/1a" +
                                     "/Martin_Van_Buren" +
                                     ".jpg/330px-Martin_Van_Buren.jpg");
        President p8 = new President(8, "William Henry Harrison", 1841,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/3/34" +
                                     "/William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg/330px-William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg");

        President p9 = new President(9, "John Tyler", 1841,
                                     "https://upload.wikimedia" +
                                     ".org/wikipedia/commons/thumb/a/ab" +
                                     "/John_Tyler_%28cropped_3x4%29" +
                                     ".png/330px-John_Tyler_%28cropped_3x4%29" +
                                     ".png");

        President p10 = new President(10, "James Polk", 1845,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/8/87" +
                                      "/Polk_crop.jpg/330px-Polk_crop.jpg");
        President p11 = new President(11, "Zachary Taylor", 1849,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/51" +
                                      "/Zachary_Taylor_restored_and_cropped" +
                                      ".jpg/330px" +
                                      "-Zachary_Taylor_restored_and_cropped" +
                                      ".jpg");
        President p12 = new President(12, "Millard Fillmore", 1850,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/4/43" +
                                      "/Millard_Fillmore_Better_Crop" +
                                      ".jpg/330px" +
                                      "-Millard_Fillmore_Better_Crop.jpg");
        President p13 = new President(13, "Franklin Pierce", 1853,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/4/46" +
                                      "/Mathew_Brady_-_Franklin_Pierce_" +
                                      "-_alternate_crop" +
                                      ".jpg/330px-Mathew_Brady_" +
                                      "-_Franklin_Pierce_-_alternate_crop.jpg");
        President p14 = new President(14, "James Buchanan", 1857,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/fd" +
                                      "/James_Buchanan" +
                                      ".jpg/330px-James_Buchanan.jpg");
        President p15 = new President(15, "Abraham Lincoln", 1861,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/a/ab" +
                                      "/Abraham_Lincoln_O" +
                                      "-77_matte_collodion_print" +
                                      ".jpg/330px-Abraham_Lincoln_O" +
                                      "-77_matte_collodion_print.jpg");
        President p16 = new President(16, "Andrew Johnson", 1865,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/e/e6" +
                                      "/Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg/330px-Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg");
        President p17 = new President(17, "Ulysses Grant", 1869,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/5c" +
                                      "/Ulysses_S._Grant_1870-1880" +
                                      ".jpg/330px-Ulysses_S._Grant_1870-1880" +
                                      ".jpg");
        President p18 = new President(18, "Rutherford B. Hayes", 1877,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/50" +
                                      "/President_Rutherford_Hayes_1870_" +
                                      "-_1880_Restored" + ".jpg/330px" +
                                      "-President_Rutherford_Hayes_1870_" +
                                      "-_1880_Restored.jpg");
        President p19 = new President(19, "Andrew Garfield", 1881,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/1/1f" +
                                      "/James_Abram_Garfield" +
                                      "%2C_photo_portrait_seated" +
                                      ".jpg/330px-James_Abram_Garfield" +
                                      "%2C_photo_portrait_seated.jpg");
        President p20 = new President(20, "Chester Alan Arthur", 1881,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/7/79" +
                                      "/Chester_Alan_Arthur" +
                                      ".jpg/330px-Chester_Alan_Arthur.jpg");
        President p21 = new President(21, "Grover Cleveland", 1885,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/f3" +
                                      "/Grover_Cleveland_-_NARA_-_518139_" +
                                      "%28cropped%29" +
                                      ".jpg/330px-Grover_Cleveland_-_NARA_" +
                                      "-_518139_%28cropped%29.jpg");
        President p22 = new President(22, "Benjamin Harrison", 1889,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/f8" +
                                      "/Benjamin_Harrison" +
                                      "%2C_head_and_shoulders_bw_photo" +
                                      "%2C_1896.jpg/330px-Benjamin_Harrison" +
                                      "%2C_head_and_shoulders_bw_photo" +
                                      "%2C_1896.jpg");
        President p23 = new President(23, "Grover Cleveland (again)", 1893,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/c/c3" +
                                      "/Eastman_Johnson_-_Grover_Cleveland_" +
                                      "-_Google_Art_Project" +
                                      ".jpg/270px-Eastman_Johnson_" +
                                      "-_Grover_Cleveland_" +
                                      "-_Google_Art_Project.jpg");
        President p24 = new President(24, "William McKinley", 1897,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/3/30" +
                                      "/McKinley_%28cropped%29" +
                                      ".jpg/330px-McKinley_%28cropped%29.jpg");
        President p25 = new President(25, "Theodore Roosevelt", 1901,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/6/64" +
                                      "/President_Roosevelt_-_Pach_Bros_" +
                                      "%28cropped%29" +
                                      ".jpg/330px-President_Roosevelt_" +
                                      "-_Pach_Bros_%28cropped%29.jpg");
        President p26 = new President(26, "William Howard Taft", 1909,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/59" +
                                      "/William_Howard_Taft_" +
                                      "-_Harris_and_Ewing" +
                                      ".jpg/330px-William_Howard_Taft_" +
                                      "-_Harris_and_Ewing.jpg");
        President p27 = new President(27, "Woodrow Wilson", 1913,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/f2" +
                                      "/Thomas_Woodrow_Wilson%2C_Harris_" +
                                      "%26_Ewing_bw_photo_portrait%2C_1919_" +
                                      "%28cropped%29" +
                                      ".jpg/330px-Thomas_Woodrow_Wilson" +
                                      "%2C_Harris_%26_Ewing_bw_photo_portrait" +
                                      "%2C_1919_%28cropped%29.jpg");
        President p28 = new President(28, "Warren Harding", 1921,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/fc" +
                                      "/Warren_G._Harding_%28cropped%29" +
                                      ".jpg/113px-Warren_G" +
                                      "._Harding_%28cropped%29.jpg");
        President p29 = new President(29, "Calvin Cooldige", 1923,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/a/a3" +
                                      "/Calvin_Coolidge_cph" +
                                      ".3g10777_%28cropped%29" +
                                      ".jpg/330px-Calvin_Coolidge_cph" +
                                      ".3g10777_%28cropped%29.jpg");

        President p30 = new President(30, "Herbert Hoover", 1929,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/f/f9" +
                                      "/Herbert_Hoover_%28cropped%29" +
                                      ".jpg/113px-Herbert_Hoover_%28cropped" +
                                      "%29.jpg");
        President p31 = new President(31, "Franklin Roosevelt", 1933,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/4/42" +
                                      "/FDR_1944_Color_Portrait" +
                                      ".jpg/330px-FDR_1944_Color_Portrait.jpg");
        President p32 = new President(32, "Harry Truman", 1945,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/0/0b" +
                                      "/TRUMAN_58-766-06_%28cropped%29" +
                                      ".jpg/330px-TRUMAN_58-766-06_%28cropped" +
                                      "%29.jpg");
        President p33 = new President(33, "Dwight Eisenhower", 1953,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/6/63" +
                                      "/Dwight_D" + "._Eisenhower" +
                                      "%2C_official_photo_portrait%2C_May_29" +
                                      "%2C_1959.jpg/330px-Dwight_D" +
                                      "._Eisenhower" +
                                      "%2C_official_photo_portrait%2C_May_29" +
                                      "%2C_1959.jpg");
        President p34 = new President(34, "John Kennedy", 1961,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/c/c3" +
                                      "/John_F" + "._Kennedy" +
                                      "%2C_White_House_color_photo_portrait" +
                                      ".jpg/330px-John_F" + "._Kennedy" +
                                      "%2C_White_House_color_photo_portrait" +
                                      ".jpg");
        President p35 = new President(35, "Lyndon Johnson", 1963,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/c/c3" +
                                      "/37_Lyndon_Johnson_3x4" +
                                      ".jpg/330px-37_Lyndon_Johnson_3x4.jpg");
        President p36 = new President(36, "Richard Nixon", 1969,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/2/2c" +
                                      "/Richard_Nixon_presidential_portrait_" +
                                      "%281%29" + ".jpg/330px" +
                                      "-Richard_Nixon_presidential_portrait_" +
                                      "%281%29.jpg");
        President p37 = new President(37, "Gerald Ford", 1974,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/3/36" +
                                      "/Gerald_Ford_presidential_portrait_" +
                                      "%28cropped%29" + ".jpg/330px" +
                                      "-Gerald_Ford_presidential_portrait_" +
                                      "%28cropped%29.jpg");
        President p38 = new President(38, "Jimmy Carter", 1977,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/5a" +
                                      "/JimmyCarterPortrait2" +
                                      ".jpg/330px-JimmyCarterPortrait2.jpg");
        President p39 = new President(39, "Ronald Reagan", 1981,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/1/16" +
                                      "/Official_Portrait_of_President_Reagan_1981.jpg/330px-Official_Portrait_of_President_Reagan_1981.jpg");
        President p40 = new President(40, "George H.W. Bush", 1989,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/e/ee" +
                                      "/George_H._W" +
                                      "._Bush_presidential_portrait_" +
                                      "%28cropped%29.jpg/330px-George_H._W" +
                                      "._Bush_presidential_portrait_" +
                                      "%28cropped%29.jpg");
        President p41 = new President(41, "Bill Clinton", 1993,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/d/d3" +
                                      "/Bill_Clinton.jpg/330px-Bill_Clinton" +
                                      ".jpg");
        President p42 = new President(42, "George W. Bush", 2001,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/d/d4" +
                                      "/George-W-Bush" +
                                      ".jpeg/330px-George-W-Bush.jpeg");
        President p43 = new President(43, "Barack Obama", 2009,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/8/8d" +
                                      "/President_Barack_Obama" +
                                      ".jpg/330px-President_Barack_Obama.jpg");
        President p44 = new President(44, "Donald Trump", 2017,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/5/56" +
                                      "/Donald_Trump_official_portrait" +
                                      ".jpg/330px" +
                                      "-Donald_Trump_official_portrait.jpg");
        President p45 = new President(45, "Joe Biden", 2021,
                                      "https://upload.wikimedia" +
                                      ".org/wikipedia/commons/thumb/6/68" +
                                      "/Joe_Biden_presidential_portrait" +
                                      ".jpg/330px" +
                                      "-Joe_Biden_presidential_portrait.jpg");

        // Add presidents to recycler view
        presidentList.addAll(
                Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
                              p12, p13, p14, p15, p16, p17, p18, p19, p20, p21,
                              p22, p23, p24, p25, p26, p27, p28, p29, p30, p31,
                              p32, p33, p34, p35, p36, p37, p38, p39, p40, p41,
                              p42, p43, p44, p45));
    } // End fillPresidentList
} // End MyJavaClass