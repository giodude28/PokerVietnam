package io.gio.vietnampoker.Data;

import io.gio.vietnampoker.R;

public class CardData {
    public static String[] title={"Bài cao","Một đôi","Hai đôi","Sám","Sảnh","Thùng","Cù lũ","Tứ quý","Thùng phá sảnh","Thùng chúa","Ngũ quý"};
    public static String[] desc={"Không có liên kết nào ở dưới",
    "Hai lá bài đồng số",
    "Hai đôi",
    "Ba lá bài đồng số",
    "Năm lá bài trong một chuỗi số (nhưng không đồng chất)",
    "Năm lá bài cùng màu, đồng chất (nhưng không cùng một chuỗi số)",
    "Một bộ ba và một bộ đôi",
    "Bốn lá đồng số",
    "Dây đồng chất",
    "Dây đồng chất với Xì là lá bài cao nhất",
    "Bốn lá đồng số với một lá Joker"};

    public static String[] condition={"Xét lá bài cao nhất, sau đó xét các lá bài cao tiếp theo",
    "Xét đôi cao thấp, tiếp đến là các lá bài lẻ cao nhất",
    "Xét đôi cao thấp, tiếp đến là đôi thấp hơn và sau cùng là (các) lá bài lẻ",
    "Xét cao thấp của bộ ba.",
    "Xét cao thấp của lá bài cao nhất của chuỗi",
    "Xét lá bài cao nhất, sau đó các lá bài cao tiếp theo",
    "Xét cao thấp của bộ ba",
    "Xét cao thấp lá bài của tứ quý",
    "Xét lá bài cao nhất",
    "Chia gà",
    "\tXét cao thấp lá bài của ngũ quý"};

    public static Integer[] image={R.drawable.highcard,R.drawable.onepair,R.drawable.twopair,R.drawable.three_of_a_kind,R.drawable.straight,R.drawable.flush,R.drawable.full_house,R.drawable.four_of_a_kind,R.drawable.straight_flush,R.drawable.royal_flush,R.drawable.five_of_a_kind};
}
