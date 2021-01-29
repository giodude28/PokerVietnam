package io.gio.vietnampoker.Data;

public class CategoryData {

    public static String[] title={"Tố","Theo","Tố tất","Úp bỏ"};
    public static String[] desc={"Là tố theo số tiền đặt cược ban đầu của mình. Ví dụ: Số tiền đặt cược người 1 và người số 2 tổng là 100, vậy mỗi người cược 50. nếu tố thì người tố cược thêm 50, tổng lên 150.",
    "Là tố theo người phía trước đã tố. Ví dụ: Nếu số 2 theo số 1 thì 2 cũng cược thêm 50, tổng lên 200.",
    "Là tố theo số tiền tổng của tất cả người chơi đã tố. Ví dụ: Nếu người số1 tố tất thì cược thêm 200 (do tổng là 200), tổng lên 400.",
    "Là bỏ đi lá bài mình trên tay và mình phải mất đi số tiền đã cược trước đó.\n" +
            "\n"
            +"•\tTrong vòng tố đầu tiên (lá bài thứ 3), người chơi tố đầu tiên ra lệnh tố thì người kế không được ra lệnh tố nữa, mà phải Theo hoặc Tố tất cả. Vòng lượt tố đầu sẽ hoàn thành khi tất cả người chơi đều Theo. nhớ trong lượt tố đầu chỉ có 2 vòng tố (nghĩa là vòng 1 mỗi người chơi có thể Tố tất cả, nhưng vòng 2 (vòng này xảy ra khi có 1 hoặc nhiều người ra lệnh khác cách tố của người đầu tiên) thì các người tiếp theo bắt buộc phải  Theo (trừ người ra lệnh tố khác cuối cùng).\n" +
            "\n"
            +"•\tTương tự, nhưng lượt tố thứ 2 (lá bài thứ 4) sẽ có 3 vòng tố ; lượt tố cuối (lá bài thứ 5) sẽ có số lần tố không giới hạn\n" +
            "\n"
            + "•\tNgười chơi có thể ra lệnh Úp bỏ để bỏ ván bài đó do bài của mình quá yếu để bảo toàn tiền của mình\n" +
            "\n"
            +"•\tCách xét kết quả tương tự ở bảng tính  Nếu bài lớn bằng nhau thì chia tiền.\n" +
            "\n"
            +"•\tNếu thắng sẽ nhận tất cả số tiền tổng (đủ tiền cược). Trường hợp mà thiếu tiền cược (cược hết số tiền đang có của mình) thì chỉ nhận số tổng của các lượt trước + một phần số tiền mình đã cược ở vòng cuối cùng\n"};
}
