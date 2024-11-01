package C6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1010c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final A6.f[] f1042a = new A6.f[0];

    public static final Set a(A6.f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (fVar instanceof InterfaceC1022l) {
            return ((InterfaceC1022l) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            hashSet.add(fVar.f(i8));
        }
        return hashSet;
    }

    public static final A6.f[] b(List list) {
        A6.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null || (fVarArr = (A6.f[]) list.toArray(new A6.f[0])) == null) {
            return f1042a;
        }
        return fVarArr;
    }
}
