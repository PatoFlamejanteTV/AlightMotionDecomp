package w6;

import s6.C3980F;
import s6.I;

/* renamed from: w6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4162e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f40774a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3980F f40775b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3980F f40776c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3980F f40777d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3980F f40778e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f40779f;

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f40774a = e8;
        f40775b = new C3980F("PERMIT");
        f40776c = new C3980F("TAKEN");
        f40777d = new C3980F("BROKEN");
        f40778e = new C3980F("CANCELLED");
        e9 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f40779f = e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4163f h(long j8, C4163f c4163f) {
        return new C4163f(j8, c4163f, 0);
    }
}
