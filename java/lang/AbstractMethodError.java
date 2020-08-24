/*
 * Copyright (c) 1994, 2008, Oracle and/or its affiliates. All rights reserved.
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
 * Thrown when an application tries to call an abstract method.
 * Normally, this error is caught by the compiler; this error can
 * only occur at run time if the definition of some class has
 * incompatibly changed since the currently executing method was last
 * compiled.
 *
 * ### 译文:
 *  当应用程序试图调用一个抽象方法时，抛出此错误。
 *  通常由编译器捕获此错误；如果某个类的定义自当前执行方法最后一次编译以后作了不兼容的更改，
 *  则此错误只可能在运行时发生
 *
 * @author  unascribed
 * @since   JDK1.0
 */
public
class AbstractMethodError extends IncompatibleClassChangeError {
    private static final long serialVersionUID = -1654391082989018462L;

    /**
     * Constructs an <code>AbstractMethodError</code> with no detail  message.
     *
     * ### 译文:
     *  构造不带详细消息的 AbstractMethodError。
     *
     */
    public AbstractMethodError() {
        super();
    }

    /**
     * Constructs an <code>AbstractMethodError</code> with the specified
     * detail message.
     *
     * ### 译文:
     *  构造带指定详细消息的 AbstractMethodError。
     *
     * @param   s   the detail message.
     */
    public AbstractMethodError(String s) {
        super(s);
    }
}
