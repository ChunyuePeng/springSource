/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop;

/**
 * Core Spring pointcut abstraction.
 *作用就是定义切面的匹配点（简单来说就是要去切哪些类和方法），主要可以分为下几个实现类：
 * {@link org.springframework.aop.support.NameMatchMethodPointcut}:通过刚发名进行精确匹配
 *
 * {@link org.springframework.aop.support.ControlFlowPointcut}:根据当前线程的堆栈信息中的
 * 方法名来确定是否切入某个方法（效率较低）
 *
 * {@link org.springframework.aop.support.ComposablePointcut}:组合模式的Pointcut，主要分为
 * 两种：组合中所有都匹配算成功、组合中都不匹配算成功
 *
 * {@link org.springframework.aop.support.JdkRegexpMethodPointcut}:通过正则表达式来匹配方法
 *
 * {@link org.springframework.aop.aspectj.AspectJExpressionPointcut}:用于简单方法名匹配的切
 * 入点bean，作为regexp模式的替代方案。
 *
 * {@link org.springframework.transaction.interceptor.TransactionAttributeSourcePointcut}:
 * 通过{@link org.springframework.transaction.interceptor.TransactionAttributeSource}在类
 * 或者类的方法上提取事务注解的熟悉@Transactional来判断是否匹配
 * <p>A pointcut is composed of a {@link ClassFilter} and a {@link MethodMatcher}.
 * Both these basic terms and a Pointcut itself can be combined to build up combinations
 * (e.g. through {@link org.springframework.aop.support.ComposablePointcut}).
 *
 * @author Rod Johnson
 * @see ClassFilter
 * @see MethodMatcher
 * @see org.springframework.aop.support.Pointcuts
 * @see org.springframework.aop.support.ClassFilters
 * @see org.springframework.aop.support.MethodMatchers
 */
public interface Pointcut {

	/**
	 * Return the ClassFilter for this pointcut.
	 * 类过滤器，可以知道哪些类需要拦截
	 * @return the ClassFilter (never {@code null})
	 */
	ClassFilter getClassFilter();

	/**
	 * Return the MethodMatcher for this pointcut.
	 * 返回匹配的方法
	 * @return the MethodMatcher (never {@code null})
	 */
	MethodMatcher getMethodMatcher();


	/**
	 * Canonical Pointcut instance that always matches.
	 * 匹配所有对象的Pointcut
	 */
	Pointcut TRUE = TruePointcut.INSTANCE;

}
