package R5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1441z extends AbstractC1440y {
    public static final void A(List list) {
        AbstractC3292y.i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void B(List list, Comparator comparator) {
        AbstractC3292y.i(list, "<this>");
        AbstractC3292y.i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
