package g6;

import java.util.Random;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2922b extends AbstractC2921a {

    /* renamed from: c, reason: collision with root package name */
    private final a f32466c = new a();

    /* renamed from: g6.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // g6.AbstractC2921a
    public Random d() {
        Object obj = this.f32466c.get();
        AbstractC3292y.h(obj, "get(...)");
        return (Random) obj;
    }
}
