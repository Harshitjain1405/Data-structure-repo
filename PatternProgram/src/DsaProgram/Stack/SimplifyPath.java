package DsaProgram.Stack;

import java.util.Stack;

/*
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

The rules of a Unix-style file system are as follows:

A single period '.' represents the current directory.
A double period '..' represents the previous/parent directory.
Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
The simplified canonical path should follow these rules:

The path must start with a single slash '/'.
Directories within the path must be separated by exactly one slash '/'.
The path must not end with a slash '/', unless it is the root directory.
The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 */
public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));                  // "/home"
        System.out.println(simplifyPath("/../"));                    // "/"
        System.out.println(simplifyPath("/home//foo/"));             // "/home/foo"
        System.out.println(simplifyPath("/a/./b/../../c/"));         // "/c"
        System.out.println(simplifyPath("/a//b////c/d//././/.."));   // "/a/b/c"
        System.out.println(simplifyPath("/..."));                    // "/..."
    }

    private static String simplifyPath(String s) {
        String[] strs = s.split("/");
        Stack<String> stack = new Stack<>();

        for(String str: strs) {
            if(str.isEmpty() || str.equals(".")) {
                continue;
            } else if(str.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        return  "/" + String.join("/",stack);
    }

}
