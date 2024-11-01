package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.support.v4.media.f;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14255a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f14256b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f14257c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f14258d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f14259e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f14260f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f14261g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f14262h;

    /* renamed from: i, reason: collision with root package name */
    private Object f14263i;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(c.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i8) {
            return new MediaDescriptionCompat[i8];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f14264a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f14265b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f14266c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f14267d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f14268e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f14269f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f14270g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f14271h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f14264a, this.f14265b, this.f14266c, this.f14267d, this.f14268e, this.f14269f, this.f14270g, this.f14271h);
        }

        public b b(CharSequence charSequence) {
            this.f14267d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f14270g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f14268e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f14269f = uri;
            return this;
        }

        public b f(String str) {
            this.f14264a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f14271h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f14266c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f14265b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f14255a = str;
        this.f14256b = charSequence;
        this.f14257c = charSequence2;
        this.f14258d = charSequence3;
        this.f14259e = bitmap;
        this.f14260f = uri;
        this.f14261g = bundle;
        this.f14262h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.c.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.c.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.c.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.c.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.c.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.c(r0)
            if (r5 == 0) goto L69
            r2.g(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.v4.media.f.a(r9)
            r2.g(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f14263i = r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Bitmap b() {
        return this.f14259e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object f() {
        Object obj = this.f14263i;
        if (obj == null) {
            int i8 = Build.VERSION.SDK_INT;
            Object b9 = c.a.b();
            c.a.g(b9, this.f14255a);
            c.a.i(b9, this.f14256b);
            c.a.h(b9, this.f14257c);
            c.a.c(b9, this.f14258d);
            c.a.e(b9, this.f14259e);
            c.a.f(b9, this.f14260f);
            Bundle bundle = this.f14261g;
            if (i8 < 23 && this.f14262h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f14262h);
            }
            c.a.d(b9, bundle);
            if (i8 >= 23) {
                f.a.a(b9, this.f14262h);
            }
            Object a9 = c.a.a(b9);
            this.f14263i = a9;
            return a9;
        }
        return obj;
    }

    public CharSequence h() {
        return this.f14257c;
    }

    public CharSequence i() {
        return this.f14256b;
    }

    public String toString() {
        return ((Object) this.f14256b) + ", " + ((Object) this.f14257c) + ", " + ((Object) this.f14258d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        c.i(f(), parcel, i8);
    }
}
