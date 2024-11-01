package s6;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n6.N0;

/* renamed from: s6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3977C extends AbstractC3985e implements N0 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39162d = AtomicIntegerFieldUpdater.newUpdater(AbstractC3977C.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f39163c;
    private volatile int cleanedAndPointers;

    public AbstractC3977C(long j8, AbstractC3977C abstractC3977C, int i8) {
        super(abstractC3977C);
        this.f39163c = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    @Override // s6.AbstractC3985e
    public boolean h() {
        if (f39162d.get(this) == n() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (f39162d.addAndGet(this, SupportMenu.CATEGORY_MASK) == n() && !i()) {
            return true;
        }
        return false;
    }

    public abstract int n();

    public abstract void o(int i8, Throwable th, U5.g gVar);

    public final void p() {
        if (f39162d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39162d;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
