public class te_node {
	public static final int TEBASETYPE = 1;
	public static final int TEARRAY = 3;
	public static final int TEPOINTER = 6;
    
    public static te_node te_make_base(int code, String typeName){
        te_node p = new te_node();
		p.tag = TEBASETYPE;
		p.code = code;
		p.typeName = typeName;
		return p;
    };
    public static te_node te_make_pointer(te_node base){
        te_node p = new te_node();
		p.tag = TEPOINTER;
		p.innerType=base;
		return p;
    };
    public static te_node te_make_array(int size, te_node base){
        te_node p = new te_node();
		p.tag = TEARRAY;
        p.size=size;
		p.innerType=base;
		return p;
    };
    
    
    public int tag; // BASE 1, ARRAY 3, POINTER 6, ...
    public int code; // Base type: 1,2,3,4, ...
    public String typeName; // Base type: INT, CHAR, FLOAT
    public int size; // Number of elements in array

    private te_node innerType;
    
    String te_print(te_node p) {
        switch(p.tag){
            case TEBASETYPE:
                return ("["+p.typeName+"]");
            case TEARRAY:
                return ("array("+p.size+","+p.innerType+")");
            case TEPOINTER:
                return ("pointer("+p.innerType+")");
        }
        return "";
    }
    
    public String toString(){
		return te_print(this);
	}
/*    // Left and right children
    private te_node left, right;
    

     // Only for structs
    public String name;// Struct name
    // Only for structs and functions
    public static te_node te_make_product(te_node l, te_node r);
    public static te_node te_make_name(String name);
    public static void te_cons_struct(te_node str, te_node flds);
    public static te_node te_make_fwdstruct(String name);
    public static te_node te_make_struct(te_node flds, String n);
    public static te_node te_make_function(te_node d, te_node r); */
}