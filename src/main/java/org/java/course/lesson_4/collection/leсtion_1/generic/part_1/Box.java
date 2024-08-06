
package org.java.course.lesson_4.collection.leсtion_1.generic.lesson;

/**
 * Класс Box
 */

/*
 * В таком случае возникает лишняя рбота в проверке с условиями и
 * лишним написанием кода
 * */

//public class Box implements Comparable {
//
//    private int size;
//
//    public Box(int size) {
//        this.size = size;
//    }

//	@Override
//	public int compareTo(Object o)
//	{
//		if (this==0) {
//			return 0;
//		}
//		if (o instanceof Box){
//
//		}
//		Box another = (Box)o;
//		return this.size - another.size;
//	}
//}

/*
 * Для избежания написания лишнего кода, необходимо выполнить следующее
 * применив Дженерики
 * В классе Коробка, коробка хочет быть сравнима с коробками...
 * Таким образом сразу укорачивается написание кода.
 *
 * !!! НЕ МОЖЕТ БЫТЬ  ОБОБЩЕННЫХ ИСКЛЮЧЕНИЙ !!!!
 *
 * */
public class Box implements Comparable<Box> {

    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return this.size = o.size;
    }
}
