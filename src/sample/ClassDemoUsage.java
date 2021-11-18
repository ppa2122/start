package sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import sample.ClassDemo.DynamicDemoSubclass;
import sample.ClassDemo.StaticDemoSubclass;
import sample.ClassDemo.StaticDemoSubclass.EvenMoreInnerSubclass;

/**
 * Created by pwilkin on 18.11.2021.
 */
public class ClassDemoUsage {

    public static void main(String[] args) {
        StaticDemoSubclass sds = new StaticDemoSubclass();
        EvenMoreInnerSubclass eis = new EvenMoreInnerSubclass();
        ClassDemo cd = new ClassDemo();
        cd.setParameter("pomidor");
        DynamicDemoSubclass dds1 = cd.new DynamicDemoSubclass();
        DynamicDemoSubclass dds2 = cd.new DynamicDemoSubclass();
        dds1.setParameterEnhancement(" pierwszy");
        dds2.setParameterEnhancement(" drugi");
        System.out.println(dds1.getFullParameterValue());
        System.out.println(dds2.getFullParameterValue());
        cd.setParameter("ogorek");
        System.out.println(dds1.getFullParameterValue());
        System.out.println(dds2.getFullParameterValue());
        ClassDemo cd2 = new ClassDemo() {
            @Override
            public void setParameter(String parameter) {
                super.setParameter(parameter + " akuku!");
            }
        };
        cd2.setParameter("pomidor");
        DynamicDemoSubclass dds3 = cd2.new DynamicDemoSubclass();
        dds3.setParameterEnhancement("ha!");
        System.out.println(dds3.getFullParameterValue());
        Function<String, Integer> countAs = s -> {
            if (s == null) {
                return null;
            } else {
                int cnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                        cnt++;
                    }
                }
                return cnt;
            }
        };
        Function<String, Integer> len = s -> s == null ? null : s.length();
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x == null || y == null ? null : x + y;
        EventHandler<ActionEvent> eh = Event::consume;
        EventHandler<ActionEvent> eh2 = cd2::handleEvent;
    }

}
