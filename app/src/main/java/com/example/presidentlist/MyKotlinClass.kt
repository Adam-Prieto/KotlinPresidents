package com.example.presidentlist

import android.app.Application
import java.util.*

class MyKotlinClass
{
    init
    {
        fillPresidentList()
    } // End constructor
    
    //************************************************************************
    
    fun getPresidentList(): MutableList<President>
    {
        return presidentList
    }
    
    companion object
    {
        private var presidentList: MutableList<President> = ArrayList()
        
        var nextInt = 10
        
        //****************************************************************************
        
        fun getPresidentList(): MutableList<President>
        {
            if (presidentList.size < 1) fillPresidentList()
            return presidentList
        } // End getPresidentList
        
        //********************************************************************
        /**
         * @methodName:
         * @param:
         * @return:
         * @description:
         */
        fun setPresidentList(presidentList: MutableList<President>)
        {
            Companion.presidentList = presidentList
        } // End setPresidentList
        
        /**
         * @methodName:
         * @param:
         * @return:
         * @description:
         */
        fun fillPresidentList()
        {
            // Create president objects
            val p0 = President(0, "George Washington", 1789,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/240px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg")
            val p1 = President(1, "John Adams", 1797,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/ff" + "/Gilbert_Stuart%2C_John_Adams%2C_c" + "._1800-1815%2C_NGA_42933" + ".jpg/330px-Gilbert_Stuart%2C_John_Adams" + "%2C_c._1800-1815%2C_NGA_42933.jpg"))
            val p2 = President(2, "Thomas Jefferson", 1801,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/b/b1" + "/Official_Presidential_portrait_of_Thomas_Jefferson_%28by_Rembrandt_Peale%2C_1800%29%28cropped%29.jpg/330px-Official_Presidential_portrait_of_Thomas_Jefferson_%28by_Rembrandt_Peale%2C_1800%29%28cropped%29.jpg"))
            val p3 = President(3, "James Madison", 1809,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/2/20" + "/James_Madison%28cropped%29%28c%29" + ".jpg/330px-James_Madison%28cropped%29" + "%28c%29.jpg"))
            val p4 = President(4, "James Monroe", 1817,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/d/d4" + "/James_Monroe_White_House_portrait_1819" + ".jpg/330px" + "-James_Monroe_White_House_portrait_1819" + ".jpg"))
            val p5 = President(5, "John Quincy Adams", 1825,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/e/e8" + "/JQA_Photo_Crop" + ".jpg/330px-JQA_Photo_Crop.jpg"))
            val p6 = President(6, "Andrew Jackson", 1829,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/4/43" + "/Andrew_jackson_head" + ".jpg/330px-Andrew_jackson_head.jpg"))
            val p7 = President(7, "Martin Van Buren", 1837,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/1/1a" + "/Martin_Van_Buren" + ".jpg/330px-Martin_Van_Buren.jpg"))
            val p8 = President(8, "William Henry Harrison", 1841,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/3/34" + "/William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg/330px-William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg"))
            val p9 = President(9, "John Tyler", 1841,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/a/ab" + "/John_Tyler_%28cropped_3x4%29" + ".png/330px-John_Tyler_%28cropped_3x4%29" + ".png"))
            val p10 = President(10, "James Polk", 1845,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/8/87" + "/Polk_crop.jpg/330px-Polk_crop.jpg"))
            val p11 = President(11, "Zachary Taylor", 1849,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/51" + "/Zachary_Taylor_restored_and_cropped" + ".jpg/330px" + "-Zachary_Taylor_restored_and_cropped" + ".jpg"))
            val p12 = President(12, "Millard Fillmore", 1850,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/4/43" + "/Millard_Fillmore_Better_Crop" + ".jpg/330px" + "-Millard_Fillmore_Better_Crop.jpg"))
            val p13 = President(13, "Franklin Pierce", 1853,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/4/46" + "/Mathew_Brady_-_Franklin_Pierce_" + "-_alternate_crop" + ".jpg/330px-Mathew_Brady_" + "-_Franklin_Pierce_-_alternate_crop.jpg"))
            val p14 = President(14, "James Buchanan", 1857,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/fd" + "/James_Buchanan" + ".jpg/330px-James_Buchanan.jpg"))
            val p15 = President(15, "Abraham Lincoln", 1861,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/a/ab" + "/Abraham_Lincoln_O" + "-77_matte_collodion_print" + ".jpg/330px-Abraham_Lincoln_O" + "-77_matte_collodion_print.jpg"))
            val p16 = President(16, "Andrew Johnson", 1865,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/e/e6" + "/Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg/330px-Andrew_Johnson_photo_portrait_head_and_shoulders%2C_c1870-1880-Edit1.jpg"))
            val p17 = President(17, "Ulysses Grant", 1869,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/5c" + "/Ulysses_S._Grant_1870-1880" + ".jpg/330px-Ulysses_S._Grant_1870-1880" + ".jpg"))
            val p18 = President(18, "Rutherford B. Hayes", 1877,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/50" + "/President_Rutherford_Hayes_1870_" + "-_1880_Restored" + ".jpg/330px" + "-President_Rutherford_Hayes_1870_" + "-_1880_Restored.jpg"))
            val p19 = President(19, "Andrew Garfield", 1881,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/1/1f" + "/James_Abram_Garfield" + "%2C_photo_portrait_seated" + ".jpg/330px-James_Abram_Garfield" + "%2C_photo_portrait_seated.jpg"))
            val p20 = President(20, "Chester Alan Arthur", 1881,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/7/79" + "/Chester_Alan_Arthur" + ".jpg/330px-Chester_Alan_Arthur.jpg"))
            val p21 = President(21, "Grover Cleveland", 1885,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/f3" + "/Grover_Cleveland_-_NARA_-_518139_" + "%28cropped%29" + ".jpg/330px-Grover_Cleveland_-_NARA_" + "-_518139_%28cropped%29.jpg"))
            val p22 = President(22, "Benjamin Harrison", 1889,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/f8" + "/Benjamin_Harrison" + "%2C_head_and_shoulders_bw_photo" + "%2C_1896.jpg/330px-Benjamin_Harrison" + "%2C_head_and_shoulders_bw_photo" + "%2C_1896.jpg"))
            val p23 = President(23, "Grover Cleveland (again)", 1893,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/c/c3" + "/Eastman_Johnson_-_Grover_Cleveland_" + "-_Google_Art_Project" + ".jpg/270px-Eastman_Johnson_" + "-_Grover_Cleveland_" + "-_Google_Art_Project.jpg"))
            val p24 = President(24, "William McKinley", 1897,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/3/30" + "/McKinley_%28cropped%29" + ".jpg/330px-McKinley_%28cropped%29.jpg"))
            val p25 = President(25, "Theodore Roosevelt", 1901,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/6/64" + "/President_Roosevelt_-_Pach_Bros_" + "%28cropped%29" + ".jpg/330px-President_Roosevelt_" + "-_Pach_Bros_%28cropped%29.jpg"))
            val p26 = President(26, "William Howard Taft", 1909,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/59" + "/William_Howard_Taft_" + "-_Harris_and_Ewing" + ".jpg/330px-William_Howard_Taft_" + "-_Harris_and_Ewing.jpg"))
            val p27 = President(27, "Woodrow Wilson", 1913,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/f2" + "/Thomas_Woodrow_Wilson%2C_Harris_" + "%26_Ewing_bw_photo_portrait%2C_1919_" + "%28cropped%29" + ".jpg/330px-Thomas_Woodrow_Wilson" + "%2C_Harris_%26_Ewing_bw_photo_portrait" + "%2C_1919_%28cropped%29.jpg"))
            val p28 = President(28, "Warren Harding", 1921,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/fc" + "/Warren_G._Harding_%28cropped%29" + ".jpg/113px-Warren_G" + "._Harding_%28cropped%29.jpg"))
            val p29 = President(29, "Calvin Cooldige", 1923,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/a/a3" + "/Calvin_Coolidge_cph" + ".3g10777_%28cropped%29" + ".jpg/330px-Calvin_Coolidge_cph" + ".3g10777_%28cropped%29.jpg"))
            val p30 = President(30, "Herbert Hoover", 1929,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/f/f9" + "/Herbert_Hoover_%28cropped%29" + ".jpg/113px-Herbert_Hoover_%28cropped" + "%29.jpg"))
            val p31 = President(31, "Franklin Roosevelt", 1933,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/4/42" + "/FDR_1944_Color_Portrait" + ".jpg/330px-FDR_1944_Color_Portrait.jpg"))
            val p32 = President(32, "Harry Truman", 1945,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/0/0b" + "/TRUMAN_58-766-06_%28cropped%29" + ".jpg/330px-TRUMAN_58-766-06_%28cropped" + "%29.jpg"))
            val p33 = President(33, "Dwight Eisenhower", 1953,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/6/63" + "/Dwight_D" + "._Eisenhower" + "%2C_official_photo_portrait%2C_May_29" + "%2C_1959.jpg/330px-Dwight_D" + "._Eisenhower" + "%2C_official_photo_portrait%2C_May_29" + "%2C_1959.jpg"))
            val p34 = President(34, "John Kennedy", 1961,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/c/c3" + "/John_F" + "._Kennedy" + "%2C_White_House_color_photo_portrait" + ".jpg/330px-John_F" + "._Kennedy" + "%2C_White_House_color_photo_portrait" + ".jpg"))
            val p35 = President(35, "Lyndon Johnson", 1963,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/c/c3" + "/37_Lyndon_Johnson_3x4" + ".jpg/330px-37_Lyndon_Johnson_3x4.jpg"))
            val p36 = President(36, "Richard Nixon", 1969,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/2/2c" + "/Richard_Nixon_presidential_portrait_" + "%281%29" + ".jpg/330px" + "-Richard_Nixon_presidential_portrait_" + "%281%29.jpg"))
            val p37 = President(37, "Gerald Ford", 1974,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/3/36" + "/Gerald_Ford_presidential_portrait_" + "%28cropped%29" + ".jpg/330px" + "-Gerald_Ford_presidential_portrait_" + "%28cropped%29.jpg"))
            val p38 = President(38, "Jimmy Carter", 1977,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/5a" + "/JimmyCarterPortrait2" + ".jpg/330px-JimmyCarterPortrait2.jpg"))
            val p39 = President(39, "Ronald Reagan", 1981,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/1/16" + "/Official_Portrait_of_President_Reagan_1981.jpg/330px-Official_Portrait_of_President_Reagan_1981.jpg"))
            val p40 = President(40, "George H.W. Bush", 1989,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/e/ee" + "/George_H._W" + "._Bush_presidential_portrait_" + "%28cropped%29.jpg/330px-George_H._W" + "._Bush_presidential_portrait_" + "%28cropped%29.jpg"))
            val p41 = President(41, "Bill Clinton", 1993,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/d/d3" + "/Bill_Clinton.jpg/330px-Bill_Clinton" + ".jpg"))
            val p42 = President(42, "George W. Bush", 2001,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/d/d4" + "/George-W-Bush" + ".jpeg/330px-George-W-Bush.jpeg"))
            val p43 = President(43, "Barack Obama", 2009,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/8/8d" + "/President_Barack_Obama" + ".jpg/330px-President_Barack_Obama.jpg"))
            val p44 = President(44, "Donald Trump", 2017,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/5/56" + "/Donald_Trump_official_portrait" + ".jpg/330px" + "-Donald_Trump_official_portrait.jpg"))
            val p45 = President(45, "Joe Biden", 2021,
                ("https://upload.wikimedia" + ".org/wikipedia/commons/thumb/6/68" + "/Joe_Biden_presidential_portrait" + ".jpg/330px" + "-Joe_Biden_presidential_portrait.jpg"))
            
            // Add presidents to recycler view
            presidentList.addAll(
                Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11,
                    p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23,
                    p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35,
                    p36, p37, p38, p39, p40, p41, p42, p43, p44, p45))
        } // End fillPresidentList
    } // End companion object
}