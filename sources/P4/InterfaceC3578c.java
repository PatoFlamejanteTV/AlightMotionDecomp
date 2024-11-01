package p4;

import R5.AbstractC1435t;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import r4.I;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3578c {

    /* renamed from: p4.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean a(InterfaceC3578c interfaceC3578c, String str, I isPlacesAvailable) {
            boolean z8;
            boolean z9;
            String b9;
            String str2;
            AbstractC3292y.i(isPlacesAvailable, "isPlacesAvailable");
            Set h8 = interfaceC3578c.h();
            if (h8 != null) {
                Set set = h8;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringKt.toLowerCase((String) it.next(), Locale.Companion.getCurrent()));
                }
                if (str != null) {
                    str2 = StringKt.toLowerCase(str, Locale.Companion.getCurrent());
                } else {
                    str2 = null;
                }
                if (AbstractC1435t.d0(arrayList, str2)) {
                    z8 = true;
                    if (!isPlacesAvailable.invoke() && (b9 = interfaceC3578c.b()) != null && !n.T(b9)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z8 && z9) {
                        return true;
                    }
                }
            }
            z8 = false;
            if (!isPlacesAvailable.invoke()) {
            }
            z9 = false;
            return !z8 ? false : false;
        }
    }

    boolean a(String str, I i8);

    String b();

    Function0 f();

    Set h();
}
