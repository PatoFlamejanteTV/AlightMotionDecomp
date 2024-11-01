package c5;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private C2046k f15671a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f15672b;

    /* renamed from: c, reason: collision with root package name */
    private int f15673c;

    public P(C2046k category, ArrayList apps, int i8) {
        AbstractC3292y.i(category, "category");
        AbstractC3292y.i(apps, "apps");
        this.f15671a = category;
        this.f15672b = apps;
        this.f15673c = i8;
    }

    public final ArrayList a() {
        return this.f15672b;
    }

    public final C2046k b() {
        return this.f15671a;
    }

    public final int c() {
        return this.f15673c;
    }

    public final void d(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f15672b = arrayList;
    }

    public final void e(C2046k c2046k) {
        AbstractC3292y.i(c2046k, "<set-?>");
        this.f15671a = c2046k;
    }

    public final void f(int i8) {
        this.f15673c = i8;
    }

    public /* synthetic */ P(C2046k c2046k, ArrayList arrayList, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? new C2046k(0, null, null, 7, null) : c2046k, (i9 & 2) != 0 ? new ArrayList() : arrayList, (i9 & 4) != 0 ? 0 : i8);
    }
}
