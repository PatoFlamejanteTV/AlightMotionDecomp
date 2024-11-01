package G6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i extends f implements g {

    /* renamed from: c, reason: collision with root package name */
    public String f3125c;

    /* renamed from: d, reason: collision with root package name */
    public String f3126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i8, String name, String description, String illustrations) {
        super(i8, name);
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(description, "description");
        AbstractC3292y.i(illustrations, "illustrations");
        this.f3125c = description;
        this.f3126d = illustrations;
    }

    @Override // G6.g
    public String a() {
        return this.f3125c;
    }

    @Override // G6.g
    public String b() {
        return this.f3126d;
    }
}
