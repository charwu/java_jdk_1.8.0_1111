/*
 * Copyright (c) 1994, 2012, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

/**
 * Class {@code Object} is the root of the class hierarchy.
 * Every class has {@code Object} as a superclass. All objects,
 * including arrays, implement the methods of this class.
 *
 * @author unascribed
 * @see java.lang.Class
 * @since JDK1.0
 */

/**
 * @link https://tool.oschina.net/uploads/apidocs/jdk-zh/java/lang/Object.html
 * @Auther: wxb
 * @Date: 2020/8/24 16:09
 **/

public class Object {

    private static native void registerNatives();

    static {
        registerNatives();
    }

    /**
     * Returns the runtime class of this {@code Object}. The returned
     * {@code Class} object is the object that is locked by {@code
     * static synchronized} methods of the represented class.
     * <p>
     *
     * ### 译文:
     *  返回此 Object 的运行时类。返回的 Class 对象是由所表示类的 static synchronized 方法锁定的对象。
     *
     *
     * <p><b>The actual result type is {@code Class<? extends |X|>}
     * where {@code |X|} is the erasure of the static type of the
     * expression on which {@code getClass} is called.</b> For
     * example, no cast is required in this code fragment:
     * </p>
     * <p>
     *
     * ### 译文:
     *  实际结果类型是 Class<? extends |X|>，其中 |X| 表示清除表达式中的静态类型，该表达式调用 getClass.例如，
     *  没有投在这个代码片段的要求：
     *
     * <p>
     * {@code Number n = 0;                             }<br>
     * {@code Class<? extends Number> c = n.getClass(); }
     * </p>
     *
     * @return The {@code Class} object that represents the runtime
     * class of this object.
     * @jls 15.8.2 Class Literals
     */
    public final native Class<?> getClass();

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link java.util.HashMap}.
     * <p>
     *
     * ### 译文:
     * 返回该对象的哈希码值。支持此方法是为了提高哈希表
     * （例如 java.util.Hashtable 提供的哈希表）的性能。
     *
     *
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <p>
     *
     * ### 译文:
     *  在 Java 应用程序执行期间，在对同一对象多次调用 hashCode 方法时，
     *  必须一致地返回相同的整数，前提是将对象进行 equals 比较时所用的信息没有被修改。
     *  从某一应用程序的一次执行到同一应用程序的另一次执行，该整数无需保持一致。
     *
     *
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <p>
     *
     * ### 译文:
     *  如果根据 equals(Object) 方法，两个对象是相等的，
     *  那么对这两个对象中的每个对象调用 hashCode 方法都必须生成相同的整数结果。
     *
     *
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link java.lang.Object#equals(java.lang.Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * <p>
     *
     * ### 译文:
     *  如果根据 equals(java.lang.Object) 方法，两个对象不相等，
     *  那么对这两个对象中的任一对象上调用 hashCode 方法不 要求一定生成不同的整数结果。
     *  但是，程序员应该意识到，为不相等的对象生成不同整数结果可以提高哈希表的性能。
     *
     * </ul>
     * <p>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     * <p>
     *
     * ### 译文:
     *  实际上，由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。
     * （这一般是通过将该对象的内部地址转换成一个整数来实现的，
     *  但是 JavaTM 编程语言不需要这种实现技巧。）
     *
     * @return a hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode
     */
    public native int hashCode();

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     *
     * ### 译文:
     *  指示其他某个对象是否与此对象“相等”。
     *
     *
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <p>
     *
     * ### 译文:
     *  equals 方法在非空对象引用上实现相等关系：
     *
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     *     {@code x}, {@code x.equals(x)} should return
     *     {@code true}.
     * <p>
     * ### 译文:
     *  自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
     *
     * <li>It is <i>symmetric</i>: for any non-null reference values
     *     {@code x} and {@code y}, {@code x.equals(y)}
     *     should return {@code true} if and only if
     *     {@code y.equals(x)} returns {@code true}.
     * <p>
     * ### 译文:
     *  对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
     *
     * <li>It is <i>transitive</i>: for any non-null reference values
     *     {@code x}, {@code y}, and {@code z}, if
     *     {@code x.equals(y)} returns {@code true} and
     *     {@code y.equals(z)} returns {@code true}, then
     *     {@code x.equals(z)} should return {@code true}.
     * <p>
     * ### 译文:
     *  传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，
     *  那么 x.equals(z) 应返回 true。
     *
     * <li>It is <i>consistent</i>: for any non-null reference values
     *     {@code x} and {@code y}, multiple invocations of
     *     {@code x.equals(y)} consistently return {@code true}
     *     or consistently return {@code false}, provided no
     *     information used in {@code equals} comparisons on the
     *     objects is modified.
     * <p>
     * ### 译文:
     *  一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，
     *  前提是对象上 equals 比较中所用的信息没有被修改。
     *
     * <li>For any non-null reference value {@code x},
     *     {@code x.equals(null)} should return {@code false}.
     * <p>
     * ### 译文:
     *  对于任何非空引用值 x，x.equals(null) 都应返回 false。
     *
     * </ul>
     * <p>
     * The {@code equals} method for class {@code Object} implements
     * the most discriminating possible equivalence relation on objects;
     * that is, for any non-null reference values {@code x} and
     * {@code y}, this method returns {@code true} if and only
     * if {@code x} and {@code y} refer to the same object
     * ({@code x == y} has the value {@code true}).
     * <p>
     *
     * ### 译文:
     *  Object 类的 equals 方法实现对象上差别可能性最大的相等关系；
     *  即，对于任何非空引用值 x 和 y，当且仅当 x 和 y 引用同一个对象时，
     *  此方法才返回 true（x == y 具有值 true）。
     *
     * <p>
     * Note that it is generally necessary to override the {@code hashCode}
     * method whenever this method is overridden, so as to maintain the
     * general contract for the {@code hashCode} method, which states
     * that equal objects must have equal hash codes.
     *
     * ### 译文:
     *  注意：当此方法被重写时，通常有必要重写 hashCode 方法，以维护 hashCode 方法的常规协定，
     *  该协定声明相等对象必须具有相等的哈希码。
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * @see #hashCode()
     * @see java.util.HashMap
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }

    /**
     * Creates and returns a copy of this object.  The precise meaning
     * of "copy" may depend on the class of the object. The general
     * intent is that, for any object {@code x}, the expression:
     * <blockquote>
     * <pre>
     * x.clone() != x</pre></blockquote>
     * will be true, and that the expression:
     * <blockquote>
     * <pre>
     * x.clone().getClass() == x.getClass()</pre></blockquote>
     * will be {@code true}, but these are not absolute requirements.
     * While it is typically the case that:
     * <blockquote>
     * <pre>
     * x.clone().equals(x)</pre></blockquote>
     * will be {@code true}, this is not an absolute requirement.
     *
     * ### 译文:
     *  创建并返回此对象的一个副本。“副本”的准确含义可能依赖于对象的类。这样做的目的是，对于任何对象 x，表达式：
     *      x.clone() != x
     *  为 true，表达式：
     *      x.clone().getClass() == x.getClass()
     *  也为 true，但这些并非必须要满足的要求。一般情况下：
     *      x.clone().equals(x)
     *  为 true，但这并非必须要满足的要求。
     *
     * <p>
     * By convention, the returned object should be obtained by calling
     * {@code super.clone}.  If a class and all of its superclasses (except
     * {@code Object}) obey this convention, it will be the case that
     * {@code x.clone().getClass() == x.getClass()}.
     *
     * ### 译文:
     *  按照惯例，返回的对象应该通过调用 super.clone 获得。
     *  如果一个类及其所有的超类（Object 除外）都遵守此约定，则 x.clone().getClass() == x.getClass()。
     *
     * <p>
     * By convention, the object returned by this method should be independent
     * of this object (which is being cloned).  To achieve this independence,
     * it may be necessary to modify one or more fields of the object returned
     * by {@code super.clone} before returning it.  Typically, this means
     * copying any mutable objects that comprise the internal "deep structure"
     * of the object being cloned and replacing the references to these
     * objects with references to the copies.  If a class contains only
     * primitive fields or references to immutable objects, then it is usually
     * the case that no fields in the object returned by {@code super.clone}
     * need to be modified.
     *
     * ### 译文:
     *  按照惯例，此方法返回的对象应该独立于该对象（正被复制的对象）。
     *  要获得此独立性，在 super.clone 返回对象之前，有必要对该对象的一个或多个字段进行修改。
     *  这通常意味着要复制包含正在被复制对象的内部“深层结构”的所有可变对象，并使用对副本的引用替换对这些对象的引用。
     *  如果一个类只包含基本字段或对不变对象的引用，那么通常不需要修改 super.clone 返回的对象中的字段。
     *
     * <p>
     * The method {@code clone} for class {@code Object} performs a
     * specific cloning operation. First, if the class of this object does
     * not implement the interface {@code Cloneable}, then a
     * {@code CloneNotSupportedException} is thrown. Note that all arrays
     * are considered to implement the interface {@code Cloneable} and that
     * the return type of the {@code clone} method of an array type {@code T[]}
     * is {@code T[]} where T is any reference or primitive type.
     * Otherwise, this method creates a new instance of the class of this
     * object and initializes all its fields with exactly the contents of
     * the corresponding fields of this object, as if by assignment; the
     * contents of the fields are not themselves cloned. Thus, this method
     * performs a "shallow copy" of this object, not a "deep copy" operation.
     *
     * ### 译文:
     *  Object 类的 clone 方法执行特定的复制操作。
     *  首先，如果此对象的类不能实现接口 Cloneable，则会抛出 CloneNotSupportedException。
     *  注意，所有的数组都被视为实现接口 Cloneable。否则，此方法会创建此对象的类的一个新实例，
     *  并像通过分配那样，严格使用此对象相应字段的内容初始化该对象的所有字段；这些字段的内容没有被自我复制。
     *  所以，此方法执行的是该对象的“浅表复制”，而不“深层复制”操作。
     *
     *
     * <p>
     * The class {@code Object} does not itself implement the interface
     * {@code Cloneable}, so calling the {@code clone} method on an object
     * whose class is {@code Object} will result in throwing an
     * exception at run time.
     *
     * ### 译文:
     *  Object 类本身不实现接口 Cloneable，所以在类为 Object 的对象上调用 clone 方法将会导致在运行时抛出异常。
     *
     * @return a clone of this instance.
     * @throws CloneNotSupportedException if the object's class does not
     *                                    support the {@code Cloneable} interface. Subclasses
     *                                    that override the {@code clone} method can also
     *                                    throw this exception to indicate that an instance cannot
     *                                    be cloned.
     * @see java.lang.Cloneable
     */
    protected native Object clone() throws CloneNotSupportedException;

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     *
     * ### 译文:
     *  返回该对象的字符串表示。通常， toString 方法会返回一个“以文本方式表示”此对象的字符串。
     *  结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。
     *
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * ### 译文:
     *  Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、
     *  at 标记符“@”和此对象哈希码的无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于：
     *      getClass().getName() + '@' + Integer.toHexString(hashCode())
     *
     * @return a string representation of the object.
     */
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /**
     * Wakes up a single thread that is waiting on this object's
     * monitor. If any threads are waiting on this object, one of them
     * is chosen to be awakened. The choice is arbitrary and occurs at
     * the discretion of the implementation. A thread waits on an object's
     * monitor by calling one of the {@code wait} methods.
     *
     * ### 译文:
     *  唤醒在此对象监视器上等待的单个线程。如果所有线程都在此对象上等待，则会选择唤醒其中一个线程。
     *  选择是任意性的，并在对实现做出决定时发生。线程通过调用其中一个 wait 方法，在对象的监视器上等待。
     *
     * <p>
     * The awakened thread will not be able to proceed until the current
     * thread relinquishes the lock on this object. The awakened thread will
     * compete in the usual manner with any other threads that might be
     * actively competing to synchronize on this object; for example, the
     * awakened thread enjoys no reliable privilege or disadvantage in being
     * the next thread to lock this object.
     *
     * ### 译文:
     *  直到当前线程放弃此对象上的锁定，才能继续执行被唤醒的线程。被唤醒的线程将以常规方式与在该对象上主动同步的其他所有线程进行竞争；
     *  例如，唤醒的线程在作为锁定此对象的下一个线程方面没有可靠的特权或劣势。
     *
     * <p>
     * This method should only be called by a thread that is the owner
     * of this object's monitor. A thread becomes the owner of the
     * object's monitor in one of three ways:
     *
     * ### 译文:
     *  此方法只应由作为此对象监视器的所有者的线程来调用。通过以下三种方法之一，线程可以成为此对象监视器的所有者：
     *
     * <ul>
     * <li>By executing a synchronized instance method of that object.
     *
     *  ### 译文:
     *    通过执行此对象的同步实例方法。
     *
     * <li>By executing the body of a {@code synchronized} statement
     *     that synchronizes on the object.
     *
     *  ### 译文:
     *    通过执行在此对象上进行同步的 synchronized 语句的正文。
     *
     * <li>For objects of type {@code Class,} by executing a
     *     synchronized static method of that class.
     *
     *  ### 译文:
     *    对于 Class 类型的对象，可以通过执行该类的同步静态方法。
     *
     * </ul>
     * <p>
     * Only one thread at a time can own an object's monitor.
     *
     * ### 译文:
     *  一次只能有一个线程拥有对象的监视器。
     *
     * @throws IllegalMonitorStateException if the current thread is not
     *                                      the owner of this object's monitor.
     * @see java.lang.Object#notifyAll()
     * @see java.lang.Object#wait()
     */
    public final native void notify();

    /**
     * Wakes up all threads that are waiting on this object's monitor. A
     * thread waits on an object's monitor by calling one of the
     * {@code wait} methods.
     *
     * ### 译文:
     *  唤醒在此对象监视器上等待的所有线程。线程通过调用其中一个 wait 方法，在对象的监视器上等待。
     *
     * <p>
     * The awakened threads will not be able to proceed until the current
     * thread relinquishes the lock on this object. The awakened threads
     * will compete in the usual manner with any other threads that might
     * be actively competing to synchronize on this object; for example,
     * the awakened threads enjoy no reliable privilege or disadvantage in
     * being the next thread to lock this object.
     *
     * ### 译文:
     *  直到当前线程放弃此对象上的锁定，才能继续执行被唤醒的线程。
     *  被唤醒的线程将以常规方式与在该对象上主动同步的其他所有线程进行竞争；
     *  例如，唤醒的线程在作为锁定此对象的下一个线程方面没有可靠的特权或劣势。
     *
     * <p>
     * This method should only be called by a thread that is the owner
     * of this object's monitor. See the {@code notify} method for a
     * description of the ways in which a thread can become the owner of
     * a monitor.
     *
     * ### 译文:
     *  此方法只应由作为此对象监视器的所有者的线程来调用。
     *  有关线程能够成为监视器所有者的方法的描述，请参阅 notify 方法。
     *
     * @throws IllegalMonitorStateException if the current thread is not
     *                                      the owner of this object's monitor.
     * @see java.lang.Object#notify()
     * @see java.lang.Object#wait()
     */
    public final native void notifyAll();

    /**
     * Causes the current thread to wait until either another thread invokes the
     * {@link java.lang.Object#notify()} method or the
     * {@link java.lang.Object#notifyAll()} method for this object, or a
     * specified amount of time has elapsed.
     *
     * ### 译文:
     *  在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。
     *
     * <p>
     * The current thread must own this object's monitor.
     *
     * ### 译文:
     *  当前线程必须拥有此对象监视器。
     *
     * <p>
     * This method causes the current thread (call it <var>T</var>) to
     * place itself in the wait set for this object and then to relinquish
     * any and all synchronization claims on this object. Thread <var>T</var>
     * becomes disabled for thread scheduling purposes and lies dormant
     * until one of four things happens:
     *
     * ### 译文:
     *  此方法导致当前线程（称之为 T）将其自身放置在对象的等待集中，然后放弃此对象上的所有同步要求。
     *  出于线程调度目的，在发生以下四种情况之一前，线程 T 被禁用，且处于休眠状态：
     *
     * <ul>
     * <li>Some other thread invokes the {@code notify} method for this
     * object and thread <var>T</var> happens to be arbitrarily chosen as
     * the thread to be awakened.
     *
     *  ### 译文:
     *    其他某个线程调用此对象的 notify 方法，并且线程 T 碰巧被任选为被唤醒的线程。
     *
     * <li>Some other thread invokes the {@code notifyAll} method for this
     * object.
     *
     *  ### 译文:
     *    其他某个线程调用此对象的 notifyAll 方法。
     *
     * <li>Some other thread {@linkplain Thread#interrupt() interrupts}
     * thread <var>T</var>.
     *
     *  ### 译文:
     *    其他某个线程中断线程 T。
     *
     * <li>The specified amount of real time has elapsed, more or less.  If
     * {@code timeout} is zero, however, then real time is not taken into
     * consideration and the thread simply waits until notified.
     *
     *  ### 译文:
     *    大约已经到达指定的实际时间。但是，如果 timeout 为零，则不考虑实际时间，在获得通知前该线程将一直等待。
     *
     * </ul>
     * The thread <var>T</var> is then removed from the wait set for this
     * object and re-enabled for thread scheduling. It then competes in the
     * usual manner with other threads for the right to synchronize on the
     * object; once it has gained control of the object, all its
     * synchronization claims on the object are restored to the status quo
     * ante - that is, to the situation as of the time that the {@code wait}
     * method was invoked. Thread <var>T</var> then returns from the
     * invocation of the {@code wait} method. Thus, on return from the
     * {@code wait} method, the synchronization state of the object and of
     * thread {@code T} is exactly as it was when the {@code wait} method
     * was invoked.
     *
     * ### 译文:
     *  然后，从对象的等待集中删除线程 T，并重新进行线程调度。
     *  然后，该线程以常规方式与其他线程竞争，以获得在该对象上同步的权利；
     *  一旦获得对该对象的控制权，该对象上的所有其同步声明都将被恢复到以前的状态，这就是调用 wait 方法时的情况。
     *  然后，线程 T 从 wait 方法的调用中返回。
     *  所以，从 wait 方法返回时，该对象和线程 T 的同步状态与调用 wait 方法时的情况完全相同。
     *
     * <p>
     * A thread can also wake up without being notified, interrupted, or
     * timing out, a so-called <i>spurious wakeup</i>.  While this will rarely
     * occur in practice, applications must guard against it by testing for
     * the condition that should have caused the thread to be awakened, and
     * continuing to wait if the condition is not satisfied.  In other words,
     * waits should always occur in loops, like this one:
     * <pre>
     *     synchronized (obj) {
     *         while (&lt;condition does not hold&gt;)
     *             obj.wait(timeout);
     *         ... // Perform action appropriate to condition
     *     }
     * </pre>
     * (For more information on this topic, see Section 3.2.3 in Doug Lea's
     * "Concurrent Programming in Java (Second Edition)" (Addison-Wesley,
     * 2000), or Item 50 in Joshua Bloch's "Effective Java Programming
     * Language Guide" (Addison-Wesley, 2001).
     *
     * ### 译文:
     *  在没有被通知、中断或超时的情况下，线程还可以唤醒一个所谓的虚假唤醒 (spurious wakeup)。
     *  虽然这种情况在实践中很少发生，但是应用程序必须通过以下方式防止其发生，即对应该导致该线程被提醒的条件进行测试，
     *  如果不满足该条件，则继续等待。换句话说，等待应总是发生在循环中，如下面的示例：
     *
     *    synchronized (obj) {
     *      while (<condition does not hold>)
     *      obj.wait(timeout);
     *      ... // Perform action appropriate to condition
     *    }
     *
     *
     * <p>If the current thread is {@linkplain java.lang.Thread#interrupt()
     * interrupted} by any thread before or while it is waiting, then an
     * {@code InterruptedException} is thrown.  This exception is not
     * thrown until the lock status of this object has been restored as
     * described above.
     *
     * ### 译文:
     *  如果当前线程在等待之前或在等待时被任何线程中断，则会抛出 InterruptedException。
     *  在按上述形式恢复此对象的锁定状态时才会抛出此异常。
     *
     * <p>
     * Note that the {@code wait} method, as it places the current thread
     * into the wait set for this object, unlocks only this object; any
     * other objects on which the current thread may be synchronized remain
     * locked while the thread waits.
     *
     * ### 译文:
     *  注意，由于 wait 方法将当前线程放入了对象的等待集中，所以它只能解除此对象的锁定；
     *  可以同步当前线程的任何其他对象在线程等待时仍处于锁定状态。
     *
     * <p>
     * This method should only be called by a thread that is the owner
     * of this object's monitor. See the {@code notify} method for a
     * description of the ways in which a thread can become the owner of
     * a monitor.
     *
     * ### 译文:
     *  此方法只应由作为此对象监视器的所有者的线程来调用。
     *  有关线程能够成为监视器所有者的方法的描述，请参阅 notify 方法。
     *
     *
     * @param timeout the maximum time to wait in milliseconds.
     * @throws IllegalArgumentException     if the value of timeout is
     *                                      negative.
     * @throws IllegalMonitorStateException if the current thread is not
     *                                      the owner of the object's monitor.
     * @throws InterruptedException         if any thread interrupted the
     *                                      current thread before or while the current thread
     *                                      was waiting for a notification.  The <i>interrupted
     *                                      status</i> of the current thread is cleared when
     *                                      this exception is thrown.
     * @see java.lang.Object#notify()
     * @see java.lang.Object#notifyAll()
     */
    public final native void wait(long timeout) throws InterruptedException;

    /**
     * Causes the current thread to wait until another thread invokes the
     * {@link java.lang.Object#notify()} method or the
     * {@link java.lang.Object#notifyAll()} method for this object, or
     * some other thread interrupts the current thread, or a certain
     * amount of real time has elapsed.
     *
     * ### 译文:
     *  在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者其他某个线程中断当前线程，
     *  或者已超过某个实际时间量前，导致当前线程等待。
     *
     * <p>
     * This method is similar to the {@code wait} method of one
     * argument, but it allows finer control over the amount of time to
     * wait for a notification before giving up. The amount of real time,
     * measured in nanoseconds, is given by:
     * <blockquote>
     * <pre>
     * 1000000*timeout+nanos</pre></blockquote>
     *
     * ### 译文:
     *  此方法类似于一个参数的 wait 方法，但它允许更好地控制在放弃之前等待通知的时间量。
     *  用毫微秒度量的实际时间量可以通过以下公式计算出来：
     *      1000000*timeout+nanos
     *
     * <p>
     * In all other respects, this method does the same thing as the
     * method {@link #wait(long)} of one argument. In particular,
     * {@code wait(0, 0)} means the same thing as {@code wait(0)}.
     *
     * ### 译文:
     *  在其他所有方面，此方法执行的操作与带有一个参数的 wait(long) 方法相同。
     *  需要特别指出的是，wait(0, 0) 与 wait(0) 相同。
     *
     * <p>
     * The current thread must own this object's monitor. The thread
     * releases ownership of this monitor and waits until either of the
     * following two conditions has occurred:
     *
     * ### 译文:
     *  当前线程必须拥有此对象监视器。该线程发布对此监视器的所有权，并等待下面两个条件之一发生：
     *
     * <ul>
     * <li>Another thread notifies threads waiting on this object's monitor
     *     to wake up either through a call to the {@code notify} method
     *     or the {@code notifyAll} method.
     *
     *   ### 译文:
     *    其他线程通过调用 notify 方法，或 notifyAll 方法通知在此对象的监视器上等待的线程醒来。
     *
     * <li>The timeout period, specified by {@code timeout}
     *     milliseconds plus {@code nanos} nanoseconds arguments, has
     *     elapsed.
     *
     *   ### 译文:
     *    timeout 毫秒值与 nanos 毫微秒参数值之和指定的超时时间已用完。
     *
     * </ul>
     * <p>
     * The thread then waits until it can re-obtain ownership of the
     * monitor and resumes execution.
     *
     * ### 译文:
     *  然后，该线程等到重新获得对监视器的所有权后才能继续执行。
     *
     * <p>
     * As in the one argument version, interrupts and spurious wakeups are
     * possible, and this method should always be used in a loop:
     * <pre>
     *     synchronized (obj) {
     *         while (&lt;condition does not hold&gt;)
     *             obj.wait(timeout, nanos);
     *         ... // Perform action appropriate to condition
     *     }
     * </pre>
     *
     * ### 译文:
     *  对于某一个参数的版本，实现中断和虚假唤醒是有可能的，并且此方法应始终在循环中使用：
     *
     *    synchronized (obj) {
     *      while (<condition does not hold>)
     *      obj.wait(timeout, nanos);
     *      ... // Perform action appropriate to condition
     *    }
     *
     *
     * This method should only be called by a thread that is the owner
     * of this object's monitor. See the {@code notify} method for a
     * description of the ways in which a thread can become the owner of
     * a monitor.
     *
     * ### 译文:
     *  此方法只应由作为此对象监视器的所有者的线程来调用。
     *  有关线程能够成为监视器所有者的方法的描述，请参阅 notify 方法。
     *
     * @param timeout the maximum time to wait in milliseconds.
     * @param nanos   additional time, in nanoseconds range
     *                0-999999.
     * @throws IllegalArgumentException     if the value of timeout is
     *                                      negative or the value of nanos is
     *                                      not in the range 0-999999.
     * @throws IllegalMonitorStateException if the current thread is not
     *                                      the owner of this object's monitor.
     * @throws InterruptedException         if any thread interrupted the
     *                                      current thread before or while the current thread
     *                                      was waiting for a notification.  The <i>interrupted
     *                                      status</i> of the current thread is cleared when
     *                                      this exception is thrown.
     */
    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                    "nanosecond timeout value out of range");
        }

        if (nanos > 0) {
            timeout++;
        }

        wait(timeout);
    }

    /**
     * Causes the current thread to wait until another thread invokes the
     * {@link java.lang.Object#notify()} method or the
     * {@link java.lang.Object#notifyAll()} method for this object.
     * In other words, this method behaves exactly as if it simply
     * performs the call {@code wait(0)}.
     *
     * ### 译文:
     *  在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
     *  换句话说，此方法的行为就好像它仅执行 wait(0) 调用一样。
     *
     * <p>
     * The current thread must own this object's monitor. The thread
     * releases ownership of this monitor and waits until another thread
     * notifies threads waiting on this object's monitor to wake up
     * either through a call to the {@code notify} method or the
     * {@code notifyAll} method. The thread then waits until it can
     * re-obtain ownership of the monitor and resumes execution.
     *
     * ### 译文:
     *  当前线程必须拥有此对象监视器。
     *  该线程发布对此监视器的所有权并等待，直到其他线程通过调用 notify 方法，
     *  或 notifyAll 方法通知在此对象的监视器上等待的线程醒来。
     *  然后该线程将等到重新获得对监视器的所有权后才能继续执行。
     *
     * <p>
     * As in the one argument version, interrupts and spurious wakeups are
     * possible, and this method should always be used in a loop:
     * <pre>
     *     synchronized (obj) {
     *         while (&lt;condition does not hold&gt;)
     *             obj.wait();
     *         ... // Perform action appropriate to condition
     *     }
     * </pre>
     *
     * ### 译文:
     *  对于某一个参数的版本，实现中断和虚假唤醒是可能的，而且此方法应始终在循环中使用：
     *
     *    synchronized (obj) {
     *      while (<condition does not hold>)
     *      obj.wait();
     *      ... // Perform action appropriate to condition
     *    }
     *
     *
     * This method should only be called by a thread that is the owner
     * of this object's monitor. See the {@code notify} method for a
     * description of the ways in which a thread can become the owner of
     * a monitor.
     *
     * ### 译文:
     *  此方法只应由作为此对象监视器的所有者的线程来调用。
     *  有关线程能够成为监视器所有者的方法的描述，请参阅 notify 方法。
     *
     * @throws IllegalMonitorStateException if the current thread is not
     *                                      the owner of the object's monitor.
     * @throws InterruptedException         if any thread interrupted the
     *                                      current thread before or while the current thread
     *                                      was waiting for a notification.  The <i>interrupted
     *                                      status</i> of the current thread is cleared when
     *                                      this exception is thrown.
     * @see java.lang.Object#notify()
     * @see java.lang.Object#notifyAll()
     */
    public final void wait() throws InterruptedException {
        wait(0);
    }

    /**
     * Called by the garbage collector on an object when garbage collection
     * determines that there are no more references to the object.
     * A subclass overrides the {@code finalize} method to dispose of
     * system resources or to perform other cleanup.
     *
     * ### 译文:
     *  当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
     *  子类重写 finalize 方法，以配置系统资源或执行其他清除。
     *
     * <p>
     * The general contract of {@code finalize} is that it is invoked
     * if and when the Java&trade; virtual
     * machine has determined that there is no longer any
     * means by which this object can be accessed by any thread that has
     * not yet died, except as a result of an action taken by the
     * finalization of some other object or class which is ready to be
     * finalized. The {@code finalize} method may take any action, including
     * making this object available again to other threads; the usual purpose
     * of {@code finalize}, however, is to perform cleanup actions before
     * the object is irrevocably discarded. For example, the finalize method
     * for an object that represents an input/output connection might perform
     * explicit I/O transactions to break the connection before the object is
     * permanently discarded.
     *
     * ### 译文:
     *  finalize 的常规协定是：当 JavaTM 虚拟机已确定尚未终止的任何线程无法再通过任何方法访问此对象时，
     *  将调用此方法，除非由于准备终止的其他某个对象或类的终结操作执行了某个操作。
     *  finalize 方法可以采取任何操作，其中包括再次使此对象对其他线程可用；
     *  不过，finalize 的主要目的是在不可撤消地丢弃对象之前执行清除操作。
     *  例如，表示输入/输出连接的对象的 finalize 方法可执行显式 I/O 事务，以便在永久丢弃对象之前中断连接。
     *
     * <p>
     * The {@code finalize} method of class {@code Object} performs no
     * special action; it simply returns normally. Subclasses of
     * {@code Object} may override this definition.
     *
     * ### 译文:
     *  Object 类的 finalize 方法执行非特殊性操作；它仅执行一些常规返回。Object 的子类可以重写此定义。
     *
     * <p>
     * The Java programming language does not guarantee which thread will
     * invoke the {@code finalize} method for any given object. It is
     * guaranteed, however, that the thread that invokes finalize will not
     * be holding any user-visible synchronization locks when finalize is
     * invoked. If an uncaught exception is thrown by the finalize method,
     * the exception is ignored and finalization of that object terminates.
     *
     * ### 译文:
     *  Java 编程语言不保证哪个线程将调用某个给定对象的 finalize 方法。
     *  但可以保证在调用 finalize 时，调用 finalize 的线程将不会持有任何用户可见的同步锁定。
     *  如果 finalize 方法抛出未捕获的异常，那么该异常将被忽略，并且该对象的终结操作将终止。
     *
     * <p>
     * After the {@code finalize} method has been invoked for an object, no
     * further action is taken until the Java virtual machine has again
     * determined that there is no longer any means by which this object can
     * be accessed by any thread that has not yet died, including possible
     * actions by other objects or classes which are ready to be finalized,
     * at which point the object may be discarded.
     *
     * ### 译文:
     *  在启用某个对象的 finalize 方法后，将不会执行进一步操作，
     *  直到 Java 虚拟机再次确定尚未终止的任何线程无法再通过任何方法访问此对象，
     *  其中包括由准备终止的其他对象或类执行的可能操作，在执行该操作时，对象可能被丢弃。
     *
     * <p>
     * The {@code finalize} method is never invoked more than once by a Java
     * virtual machine for any given object.
     *
     * ### 译文:
     *  对于任何给定对象，Java 虚拟机最多只调用一次 finalize 方法。
     *
     * <p>
     * Any exception thrown by the {@code finalize} method causes
     * the finalization of this object to be halted, but is otherwise
     * ignored.
     *
     * ### 译文:
     *  finalize 方法抛出的任何异常都会导致此对象的终结操作停止，但可以通过其他方法忽略它。
     *
     * @throws Throwable the {@code Exception} raised by this method
     * @jls 12.6 Finalization of Class Instances
     * @see java.lang.ref.WeakReference
     * @see java.lang.ref.PhantomReference
     */
    protected void finalize() throws Throwable {
    }
}
