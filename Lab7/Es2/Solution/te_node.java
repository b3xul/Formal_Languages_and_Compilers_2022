import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class te_node {
	public static final int TEBASETYPE = 1;
	public static final int TEARRAY = 3;
	public static final int TEPOINTER = 6;

	/* Attivare solo per struct e typedef
 	public static final int TENAME = 2;
	public static final int TEPRODUCT = 4;
	public static final int TESTRUCT = 5;
	public static final int TEFUNCTION = 7;
	public static final int TEFWDSTRUCT = 8; // incomplete structure

	public static final int IS_VAR = 1;
	public static final int IS_FIELD = 2;
	public static final int IS_TYPEDEF = 3;
      */
	

	//Definizione delle informazioni associate ad ogni nodo
    private int tag;
	private int size;
	private int code;

      /* Attivare solo per struct e typedef
	private String name;
	public int ival;
      */

	//Figli dell'albero binario
	private te_node left, right;


	public static te_node te_make_base(int code) {
		te_node p = new te_node();
		p.tag = TEBASETYPE;
		p.code = code;
		return p;
	}


	public static te_node te_make_pointer(te_node base) {
		te_node p = new te_node();
		p.tag = TEPOINTER;
		p.left = base;
		return p;
	}

	public static te_node te_make_array(int size, te_node base) {
		te_node p;
		p = new te_node();
		p.tag = TEARRAY;
		p.left = base;
		p.size = size;
		return p;
	}

	/* Attivare solo per struct e typedef
	public static te_node te_make_name(String name) {
		te_node p;
		p = new te_node();
		p.tag = TENAME;
		p.name = name;
		return p;
	}

	public static te_node te_make_product(te_node left, te_node right) {
		te_node p;
		p = new te_node();
		p.tag = TEPRODUCT;
		p.left = left;
		p.right = right;
		return p;
	}

	public static te_node te_make_fwdstruct(String name) {
		te_node p;
		p = te_make_struct(null, name);
		p.tag = TEFWDSTRUCT; // incomplete structure
		return p;
	}

	public static boolean te_is_fwd(te_node str) {
		return str.tag == TEFWDSTRUCT;
	}

	public static void te_cons_struct(te_node str, te_node fields) {
		str.tag = TESTRUCT;
		str.left = fields;
	}

	public static te_node te_make_struct(te_node fields, String name) {
		te_node p;
		p = new te_node();
		p.tag = TESTRUCT;
		p.left = fields;
		p.name = name;
		return p;
	}

	public static te_node te_make_function(te_node domain, te_node range) {
		te_node p;
		p = new te_node();
		p.tag = TEFUNCTION;
		p.left = domain;
		p.right = range;
		return p;
	}
	*/






	public static void te_print(te_node node) {
		int i;
		
		switch (node.tag) {
			case TEBASETYPE :
				System.out.print("[" + node.code + "]");
				break;
			case TEARRAY :
				System.out.print("array(" + node.size + ",");
				te_print(node.left);
				System.out.print(")");
				break;
			case TEPOINTER :
				System.out.print("pointer(");
				te_print(node.left);
				System.out.print(")");
				break;

			/* Attrivare solo per struct e typedef
			case TENAME :
				System.out.print("\"" + node.name + "\"");
				break;
			case TEPRODUCT :
				System.out.print("(");
				te_print(node.left);
				System.out.print(" X ");
				te_print(node.right);
				System.out.print(")");
				break;
			case TESTRUCT :
				i = node.tag; // evita la ricorsione 
				node.tag = -1;
				System.out.print("struct " + node.name + "(");
				te_print(node.left);
				System.out.print(")");
				node.tag = i;
				break;
			case TEFUNCTION :
				System.out.print("(");
				te_print(node.left);
				System.out.print(" . ");
				te_print(node.right);
				System.out.print(")");
				break;
			case -1 :
				System.out.print("struct " + node.name);
				break;
			*/
		}
	}

	public String toString(){
		te_print(this);
		return "";
	}

}
