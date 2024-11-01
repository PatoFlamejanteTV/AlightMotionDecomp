package C6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1012d0 {
    public static final void a(int i8, int i9, A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i8) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.f(i11));
            }
            i10 >>>= 1;
        }
        throw new y6.c(arrayList, descriptor.a());
    }
}
