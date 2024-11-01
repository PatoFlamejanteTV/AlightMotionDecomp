package V6;

import U6.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Q f10684a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10685b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10686c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10687d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10688e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10689f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10690g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f10691h;

    /* renamed from: i, reason: collision with root package name */
    private final long f10692i;

    /* renamed from: j, reason: collision with root package name */
    private final List f10693j;

    public i(Q canonicalPath, boolean z8, String comment, long j8, long j9, long j10, int i8, Long l8, long j11) {
        AbstractC3292y.i(canonicalPath, "canonicalPath");
        AbstractC3292y.i(comment, "comment");
        this.f10684a = canonicalPath;
        this.f10685b = z8;
        this.f10686c = comment;
        this.f10687d = j8;
        this.f10688e = j9;
        this.f10689f = j10;
        this.f10690g = i8;
        this.f10691h = l8;
        this.f10692i = j11;
        this.f10693j = new ArrayList();
    }

    public final Q a() {
        return this.f10684a;
    }

    public final List b() {
        return this.f10693j;
    }

    public final long c() {
        return this.f10688e;
    }

    public final int d() {
        return this.f10690g;
    }

    public final Long e() {
        return this.f10691h;
    }

    public final long f() {
        return this.f10692i;
    }

    public final long g() {
        return this.f10689f;
    }

    public final boolean h() {
        return this.f10685b;
    }

    public /* synthetic */ i(Q q8, boolean z8, String str, long j8, long j9, long j10, int i8, Long l8, long j11, int i9, AbstractC3284p abstractC3284p) {
        this(q8, (i9 & 2) != 0 ? false : z8, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j8, (i9 & 16) != 0 ? -1L : j9, (i9 & 32) != 0 ? -1L : j10, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? null : l8, (i9 & 256) == 0 ? j11 : -1L);
    }
}
