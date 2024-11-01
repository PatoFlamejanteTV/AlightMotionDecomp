package W6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* renamed from: W6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1499z extends AbstractC1492s implements InterfaceC1476d, y0 {

    /* renamed from: a, reason: collision with root package name */
    final int f10891a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f10892b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1476d f10893c;

    public AbstractC1499z(boolean z8, int i8, InterfaceC1476d interfaceC1476d) {
        if (interfaceC1476d != null) {
            this.f10891a = i8;
            this.f10892b = z8;
            this.f10893c = interfaceC1476d;
            return;
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    public static AbstractC1499z u(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1499z)) {
            if (obj instanceof byte[]) {
                try {
                    return u(AbstractC1492s.q((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e8.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1499z) obj;
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return d();
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        int i8;
        int i9 = this.f10891a;
        if (this.f10892b) {
            i8 = 15;
        } else {
            i8 = PsExtractor.VIDEO_STREAM_MASK;
        }
        return (i9 ^ i8) ^ this.f10893c.d().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1499z)) {
            return false;
        }
        AbstractC1499z abstractC1499z = (AbstractC1499z) abstractC1492s;
        if (this.f10891a != abstractC1499z.f10891a || this.f10892b != abstractC1499z.f10892b) {
            return false;
        }
        AbstractC1492s d8 = this.f10893c.d();
        AbstractC1492s d9 = abstractC1499z.f10893c.d();
        if (d8 != d9 && !d8.l(d9)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new h0(this.f10892b, this.f10891a, this.f10893c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return new w0(this.f10892b, this.f10891a, this.f10893c);
    }

    public String toString() {
        return "[" + this.f10891a + "]" + this.f10893c;
    }

    public AbstractC1492s v() {
        return this.f10893c.d();
    }

    public int y() {
        return this.f10891a;
    }

    public boolean z() {
        return this.f10892b;
    }
}
