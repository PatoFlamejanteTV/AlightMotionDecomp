package H6;

import Q5.I;
import c6.InterfaceC2072n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3307a = new j();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f3308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(2);
            this.f3308a = map;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            this.f3308a.put(String.valueOf(intValue), bool);
            return I.f8786a;
        }
    }

    public final PrivacyEncodingMode a(String str) {
        PrivacyEncodingMode privacyEncodingMode;
        if (str == null) {
            privacyEncodingMode = null;
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (AbstractC3292y.d(upperCase, "TCF")) {
                privacyEncodingMode = PrivacyEncodingMode.TCF;
            } else if (AbstractC3292y.d(upperCase, "GPP")) {
                privacyEncodingMode = PrivacyEncodingMode.GPP;
            } else {
                privacyEncodingMode = PrivacyEncodingMode.TCF_AND_GPP;
            }
        }
        if (privacyEncodingMode == null) {
            return PrivacyEncodingMode.TCF_AND_GPP;
        }
        return privacyEncodingMode;
    }

    public final Map b(Vector vector) {
        AbstractC3292y.i(vector, "vector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vector.forEach(new a(linkedHashMap));
        return linkedHashMap;
    }

    public final Map c(Vector vector, Set set) {
        LinkedHashMap linkedHashMap;
        AbstractC3292y.i(vector, "vector");
        if (set == null) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                linkedHashMap2.put(String.valueOf(intValue), Boolean.valueOf(vector.contains(intValue)));
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap == null) {
            return b(vector);
        }
        return linkedHashMap;
    }
}
