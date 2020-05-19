//public class StackImpl {
//    //В классе StackImpl создать метод main, в котором продемонстрировать работу:
//    //1) всех методов интерфейса secondPractice.Stack (включая унаследованные от secondPractice.Container и Iterable);
//    //2) всех методов интерфейса Iterator (hasNext/next/remove).
//
//    Object[] stack = new Object[];
//    //below is realization of methods secondPractice.Stack
//    @Override
//    public void push() {
//        for (int i = 0; i < stack.length; i++) {
//            if (stack[i] == element) {
//                int j = i;
//                i = stack.length - 1;
//                j++;
//            }
//        }
//    }
//
//    @Override
//    public Object pop() {
//        return stack[stack.length - 1];
//        stack[stack.length - 1];
//    }
//
//    @Override
//    public Object top() {
//        return stack[stack.length - 1];
//    }
//}
