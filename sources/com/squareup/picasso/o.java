package com.squareup.picasso;

/* loaded from: classes4.dex */
public enum o {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: a, reason: collision with root package name */
    final int f24541a;

    o(int i8) {
        this.f24541a = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i8) {
        if ((i8 & NO_CACHE.f24541a) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i8) {
        if ((i8 & NO_STORE.f24541a) == 0) {
            return true;
        }
        return false;
    }
}
