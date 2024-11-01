package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m4745boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m4746constructorimpl(String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4747equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && AbstractC3292y.d(str, ((DeviceFontFamilyName) obj).m4751unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4748equalsimpl0(String str, String str2) {
        return AbstractC3292y.d(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4749hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4750toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m4747equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m4749hashCodeimpl(this.name);
    }

    public String toString() {
        return m4750toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4751unboximpl() {
        return this.name;
    }
}
