package h6;

import g6.AbstractC2921a;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2958a extends AbstractC2921a {
    @Override // g6.AbstractC2921a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC3292y.h(current, "current(...)");
        return current;
    }
}
