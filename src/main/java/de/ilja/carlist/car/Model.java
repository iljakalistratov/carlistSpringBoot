package de.ilja.carlist.car;

import java.util.List;

public class Model {

    private String marke;
    private String modelname;
    private List<String> characteristics;

    public Model(String marke, String modelname, List<String> characteristics) {
        this.marke = marke;
        this.modelname = modelname;
        this.characteristics = characteristics;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public List<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }
}


