
class SymbolType{
    private int type;
    private int dim;

    SymbolType(int type, int dim){
        this.type = type;
        this.dim = dim;
        //System.out.println("SYMB: "+type+" "+dim);
    }


    public int getType(){
        return type;
    }
    public int getDim(){
        return dim;
    }

    public boolean checkType(SymbolType sym){
        if (sym.type == type)
            return true;
        else
            return false;
    }

    public boolean checkDim(SymbolType sym){
        if (sym.dim < dim)
            return true;
        else
            return false;
    }
}
