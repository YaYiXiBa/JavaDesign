package com.xp.javadesign.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    public void add(Component component) {
        children.add(component);
    }
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Integer execute(){
        System.out.println("打开盒子");
        int summed = children.stream().mapToInt(Component::execute).sum();
        System.out.println("关闭盒子");
        return summed;
    }


}
