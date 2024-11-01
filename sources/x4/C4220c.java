package x4;

import Q5.I;
import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4220c {

    /* renamed from: a, reason: collision with root package name */
    private final int f40982a;

    /* renamed from: b, reason: collision with root package name */
    private final a f40983b;

    /* renamed from: x4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, Bitmap bitmap) {
            AbstractC3292y.i(key, "key");
            AbstractC3292y.i(bitmap, "bitmap");
            return bitmap.getByteCount() / 1024;
        }
    }

    public C4220c(int i8) {
        this.f40982a = i8;
        this.f40983b = new a(i8);
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final Bitmap a(String key) {
        Bitmap bitmap;
        AbstractC3292y.i(key, "key");
        synchronized (this) {
            bitmap = (Bitmap) this.f40983b.get(c(key));
        }
        return bitmap;
    }

    public final void b(String key, Bitmap bitmap) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(bitmap, "bitmap");
        synchronized (this) {
            try {
                if (this.f40983b.get(c(key)) == null) {
                    this.f40983b.put(c(key), bitmap);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C4220c(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8 : i8);
    }
}
