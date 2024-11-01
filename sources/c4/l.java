package c4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f15523a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15524b;

    public l(String content, String str) {
        AbstractC3292y.i(content, "content");
        this.f15523a = content;
        boolean z8 = false;
        if (str != null && l6.n.B(str, "application/json", false, 2, null)) {
            z8 = true;
        }
        this.f15524b = z8;
    }

    public final String a() {
        return this.f15523a;
    }

    public final boolean b() {
        return this.f15524b;
    }
}
