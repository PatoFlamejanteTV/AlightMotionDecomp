package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class C3 implements X4 {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(Iterable iterable, List list) {
        AbstractC2256t4.e(iterable);
        if (iterable instanceof F4) {
            List w8 = ((F4) iterable).w();
            F4 f42 = (F4) list;
            int size = list.size();
            for (Object obj : w8) {
                if (obj == null) {
                    String str = "Element at index " + (f42.size() - size) + " is null.";
                    for (int size2 = f42.size() - 1; size2 >= size; size2--) {
                        f42.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof J3) {
                    f42.p((J3) obj);
                } else if (obj instanceof byte[]) {
                    f42.p(J3.m((byte[]) obj));
                } else {
                    f42.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC2165i5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof C2174j5) {
                ((C2174j5) list).d(list.size() + size3);
            }
        }
        int size4 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i8 = 0; i8 < size5; i8++) {
                Object obj2 = list2.get(i8);
                if (obj2 == null) {
                    h(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        for (Object obj3 : iterable) {
            if (obj3 == null) {
                h(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void h(List list, int i8) {
        String str = "Element at index " + (list.size() - i8) + " is null.";
        for (int size = list.size() - 1; size >= i8; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public abstract /* synthetic */ Object clone();

    public abstract C3 e(byte[] bArr, int i8, int i9);

    public abstract C3 f(byte[] bArr, int i8, int i9, C2128e4 c2128e4);

    @Override // com.google.android.gms.internal.measurement.X4
    public final /* synthetic */ X4 v(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.X4
    public final /* synthetic */ X4 z(byte[] bArr, C2128e4 c2128e4) {
        return f(bArr, 0, bArr.length, c2128e4);
    }
}
