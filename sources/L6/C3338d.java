package l6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3338d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3338d f34754a = new C3338d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f34755b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f34756c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f34757d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f34758e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f34759f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f34760g;

    static {
        Charset forName = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        AbstractC3292y.h(forName, "forName(...)");
        f34755b = forName;
        Charset forName2 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF16_NAME);
        AbstractC3292y.h(forName2, "forName(...)");
        f34756c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        AbstractC3292y.h(forName3, "forName(...)");
        f34757d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        AbstractC3292y.h(forName4, "forName(...)");
        f34758e = forName4;
        Charset forName5 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
        AbstractC3292y.h(forName5, "forName(...)");
        f34759f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        AbstractC3292y.h(forName6, "forName(...)");
        f34760g = forName6;
    }

    private C3338d() {
    }
}
