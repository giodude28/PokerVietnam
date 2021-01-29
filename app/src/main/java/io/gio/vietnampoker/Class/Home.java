package io.gio.vietnampoker.Class;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.gio.vietnampoker.R;

public class Home extends Fragment {
View root;
CardView c1,c2,c3,c4;
TextView title,desc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_home,container,false);

        c1 = root.findViewById(R.id.card1);
        c2 = root.findViewById(R.id.card2);
        c3 = root.findViewById(R.id.card3);
        c4 = root.findViewById(R.id.card4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog;
                myDialog = new Dialog(getContext());
                myDialog.setContentView(R.layout.homedetail);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                title = myDialog.findViewById(R.id.homename);
                desc = myDialog.findViewById(R.id.homedesc);
                title.setText("Xì tố");
                desc.setText("Xì tố là một trò chơi bài trong đó một phần hoặc tất cả các con bài không được mở và người chơi có thể tố vào gà. Vì thế xì phé kiểu Hồng Kông trong ngôn ngữ miền Nam cũng gọi là bài tố và thấy hay gọi \"cây bài\" là \"pé bài\" Ai có liên kết bài tốt nhất sẽ được ăn gà, trường hợp khác là người tố được ăn nếu mọi người chơi khác bỏ bà i");
                myDialog.show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog;
                myDialog = new Dialog(getContext());
                myDialog.setContentView(R.layout.homedetail);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                title = myDialog.findViewById(R.id.homename);
                desc = myDialog.findViewById(R.id.homedesc);
                title.setText("Lịch sử phát triển");
                desc.setText("Xì tố bắt đầu được phát triển từ đầu thế kỷ 19 tại mỹ. Ngay từ những ngày đầu nó đã rất phổ biến và nhanh chóng lan ra toàn thế giới. Năm 1937đã có những bài viết về trò chơi này\n" +
                        "\n"
                        +"Thập niên 1970 là giai đoạn hoàng kim của Xì tố tại mỹ khi nó trở nên phổ biến và có sức ảnh hưởng rất lớn tới đời sống, cũng như văn hóa chơi bài. Các giải đấu hiện đại bắt đầu trở nên phổ biến tại các sòng bạc ở Hoa Kỳ sau khi 1 giải đấu lớn được tổ chức thành công vào những năm 1970\n" +
                        "\n"
                        +"Xì tố tiếp tục được phổ biến rộng rãi hơn nữa khi bắt đầu xuất hiện trên truyền hình vào đầu những năm 2000. Nó trở thành một cơn sốt gây ảnh hưởng toàn cầu trong giai đoạn 2003-2006.\n");
                myDialog.show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog;
                myDialog = new Dialog(getContext());
                myDialog.setContentView(R.layout.homedetail);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                title = myDialog.findViewById(R.id.homename);
                desc = myDialog.findViewById(R.id.homedesc);
                title.setText("Hình thức poker");
                desc.setText("ĐỔI BÀI\n" +
                        "Mỗi người chơi được nhận 5 lá hoặc nhiều hơn, và tất cả đều không được mở. Họ có thể đổi từ một hoặc nhiều lá với một số lần nhất định, ví dụ với bài 5 lá người chơi có thể đổi duy nhất một lần, số lá được đổi trong lần này là từ 1 cho đến 5 lá.\n" +
                        "\n"
                        +"LÁ BÀI ĐẦU\n" +
                        "Mỗi người chơi nhận một số lá bài trong lần đầu, một số được mở ra cho mọi người cùng xem. Sự khác biệt quan trọng nhất giữa stud poker và draw poker là người chơi không được tráo hoặc đổi bài.\n" +
                        "\n"
                        +"LÁ BÀI CHUNG\n" +
                        "Mỗi người chơi được kết hợp các bài được chia và các con bài chung được lật ra và chung cho tất cả mọi người. Người chơi sẽ cố tạo ra liên kết tốt nhất giữa các con bài của mình và các con bài chung để tạo ra 5 lá \n");
                myDialog.show();
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aw = new Intent(getContext(),Category.class);
                startActivity(aw);
            }
        });
        return root;
    }
}