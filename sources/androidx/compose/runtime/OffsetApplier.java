package androidx.compose.runtime;

import Q5.C1413h;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i8) {
        this.applier = applier;
        this.offset = i8;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n8) {
        this.nesting++;
        this.applier.down(n8);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i8, N n8) {
        int i9;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i9 = this.offset;
        } else {
            i9 = 0;
        }
        applier.insertBottomUp(i8 + i9, n8);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i8, N n8) {
        int i9;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i9 = this.offset;
        } else {
            i9 = 0;
        }
        applier.insertTopDown(i8 + i9, n8);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i8, int i9, int i10) {
        int i11;
        if (this.nesting == 0) {
            i11 = this.offset;
        } else {
            i11 = 0;
        }
        this.applier.move(i8 + i11, i9 + i11, i10);
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
        a.a(this);
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
        a.b(this);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i8, int i9) {
        int i10;
        Applier<N> applier = this.applier;
        if (this.nesting == 0) {
            i10 = this.offset;
        } else {
            i10 = 0;
        }
        applier.remove(i8 + i10, i9);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        boolean z8;
        int i8 = this.nesting;
        if (i8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.nesting = i8 - 1;
            this.applier.up();
        } else {
            ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
            throw new C1413h();
        }
    }
}
