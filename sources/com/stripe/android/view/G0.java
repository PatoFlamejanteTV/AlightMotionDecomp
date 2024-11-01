package com.stripe.android.view;

import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f28637a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Map f28638b = R5.Q.e(Q5.x.a(Locale.US.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(List list, List list2) {
            ShippingInfoWidget.a aVar = ShippingInfoWidget.a.f28854d;
            if (!list.contains(aVar) && !list2.contains(aVar)) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final boolean a(String postalCode, String str, List optionalShippingInfoFields, List hiddenShippingInfoFields) {
        Matcher matcher;
        AbstractC3292y.i(postalCode, "postalCode");
        AbstractC3292y.i(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC3292y.i(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (str == null) {
            return false;
        }
        if (!l6.n.T(postalCode) || !f28637a.b(optionalShippingInfoFields, hiddenShippingInfoFields)) {
            Pattern pattern = (Pattern) f28638b.get(str);
            if (pattern != null && (matcher = pattern.matcher(postalCode)) != null) {
                return matcher.matches();
            }
            if (z2.d.f41472a.a(str) && !(!l6.n.T(postalCode))) {
                return false;
            }
        }
        return true;
    }
}
