package com.yun.autumn.leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.Semaphore;

/**
 * Created by yunN on 2021/04/18.
 */
public class SemphoreStudy {

    /**
     * 定义的semaphore初始许可证为0，则必须要有一个线程先对其进行release()操作，执行aquire()的线程才能执行
     * 也就是说当permit = 0 时，可以通过设置释放release()的线程来控制线程间的执行顺序。
     */
    private static final Semaphore test = new Semaphore(0);


    public static void main(String[] args) throws InterruptedException {
        test.release(1);
        System.out.println("release * 1");
        test.acquire();
        System.out.println("get a semaphore");
        HashMap<String, String> map = new HashMap<>();
        map.put("momo","26");
        String age = map.get("momo");
        map.put(null, "null");
        map.put(null, "null");
        System.out.println(map.get(null));
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null, "null");
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     * <p>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     *
     * @return a hash code value for this object.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}