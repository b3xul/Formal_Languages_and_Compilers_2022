
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\002\000\002\003\005\000\002\003\004\000\002\004\004" +
    "\000\002\007\003\000\002\005\003\000\002\005\006\000" +
    "\002\012\002\000\002\006\005\000\002\010\002\000\002" +
    "\010\004\000\002\011\002\000\002\011\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\010\002\uffff\003\uffff\013\uffff\001\002\000" +
    "\004\002\027\001\002\000\010\002\000\003\007\013\011" +
    "\001\002\000\006\004\ufff6\012\ufff6\001\002\000\010\002" +
    "\ufffd\003\ufffd\013\ufffd\001\002\000\004\007\012\001\002" +
    "\000\006\004\ufffb\012\ufffb\001\002\000\010\002\ufffe\003" +
    "\ufffe\013\ufffe\001\002\000\006\007\ufffa\010\ufffa\001\002" +
    "\000\006\004\022\012\021\001\002\000\006\007\ufffc\010" +
    "\016\001\002\000\006\004\ufff8\012\ufff8\001\002\000\006" +
    "\004\ufff6\012\ufff6\001\002\000\006\007\ufff9\010\ufff9\001" +
    "\002\000\010\005\ufff4\007\ufff4\010\ufff4\001\002\000\006" +
    "\004\ufff5\012\ufff5\001\002\000\010\005\024\007\ufff7\010" +
    "\ufff7\001\002\000\004\011\025\001\002\000\004\006\026" +
    "\001\002\000\010\005\ufff3\007\ufff3\010\ufff3\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\006\004\007\007\005\001\001\000\010\005\014" +
    "\006\012\010\013\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\016\001" +
    "\001\000\006\006\017\010\013\001\001\000\002\001\001" +
    "\000\004\011\022\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    type_table = new HashMap<String,te_node>();
    symbol_table = new HashMap<String,te_node>();
    type_table.put ("int", te_node.te_make_base(1,"INT"));
    type_table.put ("float", te_node.te_make_base(2,"FLOAT"));
    type_table.put ("char", te_node.te_make_base(3,"CHAR"));
    type_table.put ("double", te_node.te_make_base(4,"DOUBLE"));

    }


    /* Return semantic value of symbol in position (position) */
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos+position)).value);
    }
    
    public static HashMap <String, te_node> type_table;
    
    // Hash table in cui vengono memorizzati i nomi degli identificatori e dei relativi tipi
    public static HashMap<String, te_node> symbol_table;
    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= DeclList 
            {
              Object RESULT =null;
		 System.out.println("Program correctly recognized!"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // DeclList ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DeclList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DeclList ::= DeclList Decl S 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DeclList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DeclList ::= DeclList error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DeclList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Decl ::= Type Vlist 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Type ::= TYPE 
            {
              te_node RESULT =null;
		int typeNameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int typeNameright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String typeName = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=type_table.get(typeName); /* te_node */ 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Vlist ::= V 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                RESULT=(te_node)t;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Vlist",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Vlist ::= Vlist CM NT0 V 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 RESULT = t; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Vlist",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT0 ::= 
            {
              te_node RESULT =null;
		 RESULT=(te_node)stack(-1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT0",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // V ::= Ptr ID Array 
            {
              Object RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int typeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		te_node type = (te_node)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            if(symbol_table.get(name)!=null)
                System.out.println("ERROR: Variable <"+name+"> already initialized");
            else{
                symbol_table.put(name,(te_node)type);
                System.out.println("var "+name+" :"+type);
            }
            RESULT=(te_node)stack(-3);
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("V",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Ptr ::= 
            {
              te_node RESULT =null;
		 RESULT=(te_node)stack(0); /* te_node from Type */
    /* Marker used because V = Ptr Id Array -> Ptr = empty (stack[top]) had the type just before the pointer.
        In this case instead, stack[top] contains the COMMA! 
        char **a, *b[2][3] */

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ptr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Ptr ::= Ptr TIMES 
            {
              te_node RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		te_node p = (te_node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=te_node.te_make_pointer(p); /* te_node of Ptr(Type) */ 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ptr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Array ::= 
            {
              te_node RESULT =null;
		 RESULT=(te_node)stack(-1); /* te_node taken from Ptr */ 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Array",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Array ::= Array SO NUM SC 
            {
              te_node RESULT =null;
		int baseleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int baseright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		te_node base = (te_node)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sizeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sizeright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer size = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT=te_node.te_make_array(size,base); /* te_node of array of size b and type Ptr */ 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Array",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
