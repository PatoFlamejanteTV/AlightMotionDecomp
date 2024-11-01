package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import m2.InterfaceC3361a;

/* loaded from: classes4.dex */
public final class l implements InterfaceC3361a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f24519a;

    /* loaded from: classes4.dex */
    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f24522b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f24521a;

        /* renamed from: b, reason: collision with root package name */
        final int f24522b;

        b(Bitmap bitmap, int i8) {
            this.f24521a = bitmap;
            this.f24522b = i8;
        }
    }

    public l(Context context) {
        this(C.b(context));
    }

    @Override // m2.InterfaceC3361a
    public void a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int j8 = C.j(bitmap);
            if (j8 > b()) {
                this.f24519a.remove(str);
                return;
            } else {
                this.f24519a.put(str, new b(bitmap, j8));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // m2.InterfaceC3361a
    public int b() {
        return this.f24519a.maxSize();
    }

    @Override // m2.InterfaceC3361a
    public Bitmap get(String str) {
        b bVar = (b) this.f24519a.get(str);
        if (bVar != null) {
            return bVar.f24521a;
        }
        return null;
    }

    @Override // m2.InterfaceC3361a
    public int size() {
        return this.f24519a.size();
    }

    public l(int i8) {
        this.f24519a = new a(i8);
    }
}
