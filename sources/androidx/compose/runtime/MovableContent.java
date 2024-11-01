package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2073o;

@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final InterfaceC2073o content;

    public MovableContent(InterfaceC2073o interfaceC2073o) {
        this.content = interfaceC2073o;
    }

    public final InterfaceC2073o getContent() {
        return this.content;
    }
}
