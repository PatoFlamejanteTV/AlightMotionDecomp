package C6;

import R5.AbstractC1428l;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1034y {
    public static final y6.b a(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(values, "values");
        AbstractC3292y.i(names, "names");
        AbstractC3292y.i(entryAnnotations, "entryAnnotations");
        C1032w c1032w = new C1032w(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c1032w.r(annotation);
            }
        }
        int length = values.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            Enum r42 = values[i8];
            int i10 = i9 + 1;
            String str = (String) AbstractC1428l.k0(names, i9);
            if (str == null) {
                str = r42.name();
            }
            C1014e0.l(c1032w, str, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC1428l.k0(entryAnnotations, i9);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c1032w.q(annotation2);
                }
            }
            i8++;
            i9 = i10;
        }
        return new C1033x(serialName, values, c1032w);
    }

    public static final y6.b b(String serialName, Enum[] values) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(values, "values");
        return new C1033x(serialName, values);
    }
}
