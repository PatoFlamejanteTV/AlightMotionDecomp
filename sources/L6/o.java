package l6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class o {
    public static void a(Appendable appendable, Object obj, Function1 function1) {
        boolean z8;
        AbstractC3292y.i(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof CharSequence;
        }
        if (z8) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
