package model;

/**
 * Created by User on 22.09.2018.
 */


public class Classyficator {
    private String phylum;
    private String aClass;
    private String order;
    private String family;
    private String genus;
    private String speices;

    private Classyficator(Builder builder){
        this.phylum = builder.phylum;
        this.aClass = builder.aClass;
        this.order = builder.order;
        this.family = builder.family;
        this.genus = builder.genus;
        this.speices = builder.speices;
    }

    public String getPhylum() {
        return phylum;
    }

    public String getaClass() {
        return aClass;
    }

    public String getOrder() {
        return order;
    }

    public String getFamily() {
        return family;
    }

    public String getGenus() {
        return genus;
    }

    public String getSpeices() {
        return speices;
    }

    @Override
    public String toString() {
        return phylum + " " + aClass + " " + order
                 + " " + family + " " + genus + " " + speices;
    }

    public static class Builder{
        private String phylum;
        private String aClass;
        private String order;
        private String family;
        private String genus;
        private String speices;

        public Builder(){

        }

        public Builder setPhylum(String phylum) {
            this.phylum = phylum;
            return this;
        }

        public Builder setaClass(String aClass) {
            this.aClass = aClass;
            return this;
        }

        public Builder setOrder(String order) {
            this.order = order;
            return this;
        }

        public Builder setFamily(String family){
            this.family = family;
            return this;
        }

        public Builder setGenum(String genum){
            this.genus = genum;
            return this;
        }

        public Builder setSpeices(String speices){
            this.speices = speices;
            return this;
        }

        public Classyficator build(){
            return new Classyficator(this);
        }
    }
}
