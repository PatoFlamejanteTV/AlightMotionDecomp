package androidx.collection;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ObjectListKt {
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i8) {
        int size = list.size();
        if (i8 >= 0 && i8 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i8, int i9) {
        int size = list.size();
        if (i8 <= i9) {
            if (i8 >= 0) {
                if (i9 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        AbstractC3292y.g(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        AbstractC3292y.g(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e8) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e8);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e8) {
        return mutableObjectListOf(e8);
    }

    public static final <E> ObjectList<E> objectListOf(E e8, E e9) {
        return mutableObjectListOf(e8, e9);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e8, E e9) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e8);
        mutableObjectList.add(e9);
        return mutableObjectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e8, E e9, E e10) {
        return mutableObjectListOf(e8, e9, e10);
    }

    public static final <E> ObjectList<E> objectListOf(E... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e8, E e9, E e10) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e8);
        mutableObjectList.add(e9);
        mutableObjectList.add(e10);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }
}
