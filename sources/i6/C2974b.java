package i6;

import R5.AbstractC1434s;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2974b extends AbstractC1434s {

    /* renamed from: a, reason: collision with root package name */
    private final int f32761a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32762b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32763c;

    /* renamed from: d, reason: collision with root package name */
    private int f32764d;

    public C2974b(char c8, char c9, int i8) {
        this.f32761a = i8;
        this.f32762b = c9;
        boolean z8 = false;
        if (i8 <= 0 ? AbstractC3292y.k(c8, c9) >= 0 : AbstractC3292y.k(c8, c9) <= 0) {
            z8 = true;
        }
        this.f32763c = z8;
        this.f32764d = z8 ? c8 : c9;
    }

    @Override // R5.AbstractC1434s
    public char a() {
        int i8 = this.f32764d;
        if (i8 == this.f32762b) {
            if (this.f32763c) {
                this.f32763c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32764d = this.f32761a + i8;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32763c;
    }
}
