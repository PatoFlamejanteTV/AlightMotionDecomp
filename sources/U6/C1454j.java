package U6;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1454j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10236a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10237b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f10238c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f10239d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f10240e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f10241f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f10242g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f10243h;

    public C1454j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map extras) {
        AbstractC3292y.i(extras, "extras");
        this.f10236a = z8;
        this.f10237b = z9;
        this.f10238c = q8;
        this.f10239d = l8;
        this.f10240e = l9;
        this.f10241f = l10;
        this.f10242g = l11;
        this.f10243h = R5.Q.w(extras);
    }

    public final Long a() {
        return this.f10241f;
    }

    public final Long b() {
        return this.f10239d;
    }

    public final boolean c() {
        return this.f10237b;
    }

    public final boolean d() {
        return this.f10236a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f10236a) {
            arrayList.add("isRegularFile");
        }
        if (this.f10237b) {
            arrayList.add("isDirectory");
        }
        if (this.f10239d != null) {
            arrayList.add("byteCount=" + this.f10239d);
        }
        if (this.f10240e != null) {
            arrayList.add("createdAt=" + this.f10240e);
        }
        if (this.f10241f != null) {
            arrayList.add("lastModifiedAt=" + this.f10241f);
        }
        if (this.f10242g != null) {
            arrayList.add("lastAccessedAt=" + this.f10242g);
        }
        if (!this.f10243h.isEmpty()) {
            arrayList.add("extras=" + this.f10243h);
        }
        return AbstractC1435t.w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C1454j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map map, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) == 0 ? z9 : false, (i8 & 4) != 0 ? null : q8, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : l10, (i8 & 64) == 0 ? l11 : null, (i8 & 128) != 0 ? R5.Q.h() : map);
    }
}
