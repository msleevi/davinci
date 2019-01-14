package io.breakfastcoders.davinci.utils.codecs;

import java.util.List;
import java.util.Map;

public class ComplexTestModel {
    private List<ComplexTestSubClass> subClassList;
    private Map<String, String> parameters;

    public ComplexTestModel() {
    }

    public List<ComplexTestSubClass> getSubClassList() {
        return this.subClassList;
    }

    public void setSubClassList(List<ComplexTestSubClass> subClassList) {
        this.subClassList = subClassList;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public static class ComplexTestSubClass {
        private AnotherSubClass deeper;

        public ComplexTestSubClass() {
        }

        public AnotherSubClass getDeeper() {
            return this.deeper;
        }

        public void setDeeper(AnotherSubClass deeper) {
            this.deeper = deeper;
        }
    }

    public static class AnotherSubClass {
        private String value;

        public AnotherSubClass() {
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
