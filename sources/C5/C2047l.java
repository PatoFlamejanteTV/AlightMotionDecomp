package c5;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3794s;

/* renamed from: c5.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2047l {

    /* renamed from: a, reason: collision with root package name */
    public String f15890a;

    /* renamed from: b, reason: collision with root package name */
    public String f15891b;

    /* renamed from: c, reason: collision with root package name */
    private int f15892c = -1;

    public final String a() {
        String str = this.f15891b;
        if (str != null) {
            return str;
        }
        AbstractC3292y.y("date");
        return null;
    }

    public final int b() {
        return this.f15892c;
    }

    public final String c() {
        String substring = e().substring(l6.n.X(e(), "/", 0, false, 6, null) + 1);
        AbstractC3292y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return new C3794s().i(c());
    }

    public final String e() {
        String str = this.f15890a;
        if (str != null) {
            return str;
        }
        AbstractC3292y.y(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        return null;
    }

    public final void f(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.f15891b = str;
    }

    public final void g(int i8) {
        this.f15892c = i8;
    }

    public final void h(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.f15890a = str;
    }
}
