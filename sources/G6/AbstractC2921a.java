package g6;

import java.util.Random;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2921a extends AbstractC2923c {
    @Override // g6.AbstractC2923c
    public int b() {
        return d().nextInt();
    }

    @Override // g6.AbstractC2923c
    public int c(int i8) {
        return d().nextInt(i8);
    }

    public abstract Random d();
}
