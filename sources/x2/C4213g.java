package x2;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4213g extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4213g(String type) {
        super("Serialization result " + type + " is not supported");
        AbstractC3292y.i(type, "type");
    }
}
