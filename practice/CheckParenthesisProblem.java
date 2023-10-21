package practice;

import java.util.Stack;


public class CheckParenthesisProblem {

	
	public static void main(String[] args) {
		
		String str="{[(())]";
		if(isParenthesis(str)){
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		/*
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(' || c=='[' || c=='{')
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty())
				{
					System.out.println("false");
				}
				else if(!((stack.peek()=='(' && c==')') || (stack.peek()=='[' && c==']') || (stack.peek()=='{' && c=='}')))
				{
					System.out.println("false");
				}
				else
				{
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("true");
		}
		*/
	}
	
	private static boolean isParenthesis(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='(' || c=='[' || c=='{')
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else if (!((stack.peek()=='(' && c==')') || (stack.peek()=='[' && c==']') || (stack.peek()=='{' && c=='}'))) {
					return false;
				}
				else
				{
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty();
	}

}
