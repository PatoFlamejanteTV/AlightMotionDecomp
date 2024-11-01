package G6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class j extends f {

    /* renamed from: c, reason: collision with root package name */
    public final List f3127c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i8, String name, String description, List purposes, List specialFeatures) {
        super(i8, name);
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(description, "description");
        AbstractC3292y.i(purposes, "purposes");
        AbstractC3292y.i(specialFeatures, "specialFeatures");
        this.f3127c = purposes;
        this.f3128d = specialFeatures;
    }
}
