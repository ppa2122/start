package sample;

import javafx.event.ActionEvent;

/**
 * Created by pwilkin on 18.11.2021.
 */
public class ClassDemo {

    public static enum SomeEnum {
        ONE,
        TWO,
        THREE
    }

    protected String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public void handleEvent(ActionEvent event) {
        event.consume();
    }

    public static class StaticDemoSubclass {

        public static class EvenMoreInnerSubclass {

        }

    }

    public class DynamicDemoSubclass {

        protected String parameterEnhancement;

        public String getParameterEnhancement() {
            return parameterEnhancement;
        }

        public void setParameterEnhancement(String parameterEnhancement) {
            this.parameterEnhancement = parameterEnhancement;
        }

        public String getFullParameterValue() {
            return parameter + parameterEnhancement;
        }

    }

}
