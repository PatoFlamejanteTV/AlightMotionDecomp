package R5;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class b0 {
    public static Set a(Set builder) {
        AbstractC3292y.i(builder, "builder");
        return ((S5.h) builder).c();
    }

    public static Set b() {
        return new S5.h();
    }

    public static Set c(int i8) {
        return new S5.h(i8);
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC3292y.h(singleton, "singleton(...)");
        return singleton;
    }

    public static TreeSet e(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return (TreeSet) AbstractC1432p.T0(elements, new TreeSet());
    }
}
