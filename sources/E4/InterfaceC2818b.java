package e4;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2818b {

    /* renamed from: e4.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2818b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31705a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f31706b;

        /* renamed from: c, reason: collision with root package name */
        private static final LruCache f31707c;

        /* renamed from: e4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0730a extends LruCache {
            C0730a(int i8) {
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

        static {
            int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), Data.MAX_DATA_BYTES);
            f31706b = min;
            f31707c = new C0730a(min);
        }

        private a() {
        }

        @Override // e4.InterfaceC2818b
        public void a(String key, Bitmap bitmap) {
            AbstractC3292y.i(key, "key");
            AbstractC3292y.i(bitmap, "bitmap");
            f31707c.put(key, bitmap);
        }

        @Override // e4.InterfaceC2818b
        public void clear() {
            f31707c.evictAll();
        }

        @Override // e4.InterfaceC2818b
        public Bitmap get(String key) {
            AbstractC3292y.i(key, "key");
            return (Bitmap) f31707c.get(key);
        }
    }

    void a(String str, Bitmap bitmap);

    void clear();

    Bitmap get(String str);
}
