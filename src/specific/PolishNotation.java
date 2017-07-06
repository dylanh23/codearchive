package specific;

import java.util.Stack;

/**
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

 put numbers on stack and pop 2 when operand appears,
 then add the result of that with first popped on right
 */
public class PolishNotation {
  public class Solution {
    public int evalRPN(String[] tokens) {

      int returnValue = 0;

      String operators = "+-*/";

      Stack<String> stack = new Stack<String>();

      for(String t : tokens){
        if(!operators.contains(t)){
          stack.push(t);
        }else{
          int a = Integer.valueOf(stack.pop());
          int b = Integer.valueOf(stack.pop());
          int index = operators.indexOf(t);
          switch(index){
            case 0:
              stack.push(String.valueOf(a+b));
              break;
            case 1:
              stack.push(String.valueOf(b-a));
              break;
            case 2:
              stack.push(String.valueOf(a*b));
              break;
            case 3:
              stack.push(String.valueOf(b/a));
              break;
          }
        }
      }

      returnValue = Integer.valueOf(stack.pop());

      return returnValue;

    }
  }
}
