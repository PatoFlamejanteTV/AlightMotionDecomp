package C2;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class d {
    public static final c a(int i8) {
        return new b(i8, AbstractC1435t.m(), AbstractC1435t.m());
    }

    public static final c b(String str) {
        AbstractC3292y.i(str, "<this>");
        return new e(str, AbstractC1435t.m());
    }

    public static final c c(c cVar) {
        if (cVar == null) {
            return b("");
        }
        return cVar;
    }

    public static final c d(c cVar, c other) {
        AbstractC3292y.i(cVar, "<this>");
        AbstractC3292y.i(other, "other");
        return new a(cVar, other);
    }

    public static final c e(int i8, Object[] formatArgs, List transformations) {
        AbstractC3292y.i(formatArgs, "formatArgs");
        AbstractC3292y.i(transformations, "transformations");
        return new b(i8, transformations, AbstractC1428l.V0(formatArgs));
    }

    public static final c f(String value, Object... formatArgs) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(formatArgs, "formatArgs");
        return new e(value, AbstractC1428l.V0(formatArgs));
    }

    public static /* synthetic */ c g(int i8, Object[] objArr, List list, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            list = AbstractC1435t.m();
        }
        return e(i8, objArr, list);
    }

    public static final Object[] h(Context context, List args) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(args, "args");
        List list = args;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        for (Object obj : list) {
            if (obj instanceof c) {
                obj = ((c) obj).R(context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }
}
