package V;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class e {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return DesugarCollections.unmodifiableList(Arrays.asList(objArr));
            }
            return Collections.singletonList(objArr[0]);
        }
        return Collections.emptyList();
    }
}
