package com.squareup.picasso;

import U6.L;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.s;
import com.squareup.picasso.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class n extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f24530b = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: a, reason: collision with root package name */
        final int f24535a;

        /* renamed from: b, reason: collision with root package name */
        final int f24536b;

        /* renamed from: c, reason: collision with root package name */
        final int f24537c;

        a(int i8, int i9, int i10) {
            this.f24535a = i8;
            this.f24536b = i9;
            this.f24537c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:            r1.close();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.n.f24530b     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            if (r1 == 0) goto L22
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            if (r8 != 0) goto L16
            goto L22
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L20
            r1.close()
            return r8
        L1e:
            r8 = move-exception
            goto L28
        L20:
            goto L2e
        L22:
            if (r1 == 0) goto L27
            r1.close()
        L27:
            return r0
        L28:
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            throw r8
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.n.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static a l(int i8, int i9) {
        a aVar = a.MICRO;
        if (i8 <= aVar.f24536b && i9 <= aVar.f24537c) {
            return aVar;
        }
        a aVar2 = a.MINI;
        if (i8 <= aVar2.f24536b && i9 <= aVar2.f24537c) {
            return aVar2;
        }
        return a.FULL;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.x
    public boolean c(v vVar) {
        Uri uri = vVar.f24606d;
        if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        boolean z8;
        Bitmap thumbnail;
        int i9;
        ContentResolver contentResolver = this.f24492a.getContentResolver();
        int k8 = k(contentResolver, vVar.f24606d);
        String type = contentResolver.getType(vVar.f24606d);
        if (type != null && type.startsWith("video/")) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (vVar.c()) {
            a l8 = l(vVar.f24610h, vVar.f24611i);
            if (!z8 && l8 == a.FULL) {
                return new x.a(null, L.l(j(vVar)), s.e.DISK, k8);
            }
            long parseId = ContentUris.parseId(vVar.f24606d);
            BitmapFactory.Options d8 = x.d(vVar);
            d8.inJustDecodeBounds = true;
            x.a(vVar.f24610h, vVar.f24611i, l8.f24536b, l8.f24537c, d8, vVar);
            if (z8) {
                if (l8 == a.FULL) {
                    i9 = 1;
                } else {
                    i9 = l8.f24535a;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i9, d8);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l8.f24535a, d8);
            }
            if (thumbnail != null) {
                return new x.a(thumbnail, null, s.e.DISK, k8);
            }
        }
        return new x.a(null, L.l(j(vVar)), s.e.DISK, k8);
    }
}
