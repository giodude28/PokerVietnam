package io.gio.vietnampoker.Model;

public class CardViewModel {

    String name;
    String desc;
    String condition;
    Integer image;

    public CardViewModel(String name, String desc, String condition, Integer image) {
        this.name = name;
        this.desc = desc;
        this.condition = condition;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getCondition() {
        return condition;
    }

    public Integer getImage() {
        return image;
    }
}
