///////////////////////////////////////////////////////////////////////////////
// TestClass.java
///////////////////////////////////////////////////////////////////////////////
//
// POP QUIZ #1
// 
///////////////////////////////////////////////////////////////////////////////
//
// $Id: TestClass.java 277 2007-09-14 03:35:17Z ziggythehamster $
//

/******************************************************************************

1) What is the difference between a reference type and a native type?

Reference types are built from native types and are included in the
default Java installation. Native types, like int, double, etc.
are the basic building blocks of creating types.

///////////////////////////////////////////////////////////////////////////////

2) Give the code for a class described by the following UML diagram.

-----------------------------------
|           TestClass             |
-----------------------------------
| - var1 : int                    |
| - var2 : String                 |
-----------------------------------
| - calculate(arg1 : int) : void  |
| + toString() : String           |
-----------------------------------

******************************************************************************/

public class TestClass {
	private int var1;
	private int var2;
	
	private void calculate(int arg1) {
		// 2+2=4
	}
	public String toString() {
		return "4";
	}
}