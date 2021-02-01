public enum Operation {
    PLUS("+"){
        @Override
        public double compute(double d1,double d2){
            return d1+d2;
        }
    },
    MOIN("-"){
        @Override
        public double compute(double d1,double d2){
            return d1-d2;
        }
    },
    FOIS("*"){
        @Override
        public double compute(double d1,double d2){
            return d1*d2;
        }
    },
    "DIV"("/"){
        @Override
        public double compute(double d1,double d2){
            return d1/d2;
        }
    };

    private String abreviation ;

    private Operation(String abreviation) {
        this.abreviation = abreviation ;
    }
    public String toString(){
        return this.abreviation
    }
    public abstract double compute(double d1,double d2);
}