package x0;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class r extends AbstractC4191n implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC4192o f40922b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i8) {
        int max = Math.max(i8, 2);
        boolean z8 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z8 = false;
        }
        w0.h.e(z8, "collection too large");
        return 1073741824;
    }

    private static r n(int i8, Object... objArr) {
        if (i8 != 0) {
            if (i8 != 1) {
                int m8 = m(i8);
                Object[] objArr2 = new Object[m8];
                int i9 = m8 - 1;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < i8; i12++) {
                    Object a9 = AbstractC4177F.a(objArr[i12], i12);
                    int hashCode = a9.hashCode();
                    int b9 = AbstractC4190m.b(hashCode);
                    while (true) {
                        int i13 = b9 & i9;
                        Object obj = objArr2[i13];
                        if (obj == null) {
                            objArr[i11] = a9;
                            objArr2[i13] = a9;
                            i10 += hashCode;
                            i11++;
                            break;
                        }
                        if (obj.equals(a9)) {
                            break;
                        }
                        b9++;
                    }
                }
                Arrays.fill(objArr, i11, i8, (Object) null);
                if (i11 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new N(obj2);
                }
                if (m(i11) < m8 / 2) {
                    return n(i11, objArr);
                }
                if (z(i11, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                return new K(objArr, i10, objArr2, i9, i11);
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        return t();
    }

    public static r o(Collection collection) {
        if ((collection instanceof r) && !(collection instanceof SortedSet)) {
            r rVar = (r) collection;
            if (!rVar.j()) {
                return rVar;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static r t() {
        return K.f40844i;
    }

    public static r u(Object obj) {
        return new N(obj);
    }

    public static r v(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    public static r y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z8;
        if (objArr.length <= 2147483641) {
            z8 = true;
        } else {
            z8 = false;
        }
        w0.h.e(z8, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return n(length, objArr2);
    }

    private static boolean z(int i8, int i9) {
        if (i8 < (i9 >> 1) + (i9 >> 2)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && r() && ((r) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return M.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return M.b(this);
    }

    public AbstractC4192o k() {
        AbstractC4192o abstractC4192o = this.f40922b;
        if (abstractC4192o == null) {
            AbstractC4192o q8 = q();
            this.f40922b = q8;
            return q8;
        }
        return abstractC4192o;
    }

    AbstractC4192o q() {
        return AbstractC4192o.k(toArray());
    }

    boolean r() {
        return false;
    }
}
