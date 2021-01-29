package io.gio.vietnampoker.Model;

public class TipsViewModel {

    String title;
    String desc;

    public TipsViewModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
