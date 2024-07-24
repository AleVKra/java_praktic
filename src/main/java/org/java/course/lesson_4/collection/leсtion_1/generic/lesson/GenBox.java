/*
 * Copyright (c) 2022 Tander, All Rights Reserved.
 */

package org.java.course.lesson_4.collection.leсtion_1.generic.lesson;
/* Т - может быть строкой или числом, котом или собакой....
Обобщеине - это переменный тип.
примитивы нельзя использовать, только ссылочный тип данных

ОГРАНИЧЕНИЯ:
1. внутри класса нельзя создать объект переменного типа.
2. нельзя создать массив
3. НЕЛЬЗЯ СОЗДАВАТЬ СТАТИЧЕСКИЕ ПОЛЯ С ТИПОМ Т

*/

public class GenBox<T> {
    // поле типа Т
//	тип данных определяется в момент создания объекта
    private T obj;
/* 3 ОГРАНИЧЕНИЕ */
//    static T staticFild =

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenBox(T obj) {
        this.obj = obj;
    }

    public void doSomething() {
        /* 1-ое ограничение */
// 		T object = new T();
        /* 2-ое ограничение*/
//        T object = new T();
    }

    /* НО! метод может ожидать на вход массив */
    public void doSomething2(T[] arr) {

    }
}
/*
 * Типов может быть несколько, смотреть ниже
 */
/*
public class GenBox2<T, M> {

	private T obj;
	private M obj2;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public GenBox(T obj, M obj2) {
		this.obj = obj;
		this.obj2=obj2;
	}
}*/