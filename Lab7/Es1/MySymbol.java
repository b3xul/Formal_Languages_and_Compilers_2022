
class MySymbol{
    public Integer type;
    public Integer dim;
    public Object index=null;
    
    MySymbol(Integer type, Integer dim){
        this.type = type;
        this.dim = dim;
    }

    MySymbol(Integer type, Integer dim, Object index){
        this.type = type;
        this.dim = dim;
        this.index = index;
    }
    public boolean checkType(MySymbol sym){
        if (sym.type == type)
            return true;
        else
            return false;
    }

    public boolean checkDim(MySymbol sym){
        if (sym.dim < dim)
            return true;
        else
            return false;
    }
}
