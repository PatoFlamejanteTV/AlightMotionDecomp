package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f14313a;

    /* renamed from: b, reason: collision with root package name */
    final long f14314b;

    /* renamed from: c, reason: collision with root package name */
    final long f14315c;

    /* renamed from: d, reason: collision with root package name */
    final float f14316d;

    /* renamed from: e, reason: collision with root package name */
    final long f14317e;

    /* renamed from: f, reason: collision with root package name */
    final int f14318f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f14319g;

    /* renamed from: h, reason: collision with root package name */
    final long f14320h;

    /* renamed from: i, reason: collision with root package name */
    List f14321i;

    /* renamed from: j, reason: collision with root package name */
    final long f14322j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f14323k;

    /* renamed from: l, reason: collision with root package name */
    private Object f14324l;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i8) {
            return new PlaybackStateCompat[i8];
        }
    }

    PlaybackStateCompat(int i8, long j8, long j9, float f8, long j10, int i9, CharSequence charSequence, long j11, List list, long j12, Bundle bundle) {
        this.f14313a = i8;
        this.f14314b = j8;
        this.f14315c = j9;
        this.f14316d = f8;
        this.f14317e = j10;
        this.f14318f = i9;
        this.f14319g = charSequence;
        this.f14320h = j11;
        this.f14321i = new ArrayList(list);
        this.f14322j = j12;
        this.f14323k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        List d8 = e.d(obj);
        if (d8 != null) {
            ArrayList arrayList2 = new ArrayList(d8.size());
            Iterator it = d8.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = g.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.i(obj), e.h(obj), e.c(obj), e.g(obj), e.a(obj), 0, e.e(obj), e.f(obj), arrayList, e.b(obj), bundle);
        playbackStateCompat.f14324l = obj;
        return playbackStateCompat;
    }

    public static int u(long j8) {
        if (j8 == 4) {
            return 126;
        }
        if (j8 == 2) {
            return ModuleDescriptor.MODULE_VERSION;
        }
        if (j8 == 32) {
            return 87;
        }
        if (j8 == 16) {
            return 88;
        }
        if (j8 == 1) {
            return 86;
        }
        if (j8 == 64) {
            return 90;
        }
        if (j8 == 8) {
            return 89;
        }
        return j8 == 512 ? 85 : 0;
    }

    public long b() {
        return this.f14317e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long f() {
        return this.f14315c;
    }

    public int h() {
        return this.f14318f;
    }

    public CharSequence i() {
        return this.f14319g;
    }

    public float l() {
        return this.f14316d;
    }

    public long p() {
        return this.f14314b;
    }

    public int s() {
        return this.f14313a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f14313a + ", position=" + this.f14314b + ", buffered position=" + this.f14315c + ", speed=" + this.f14316d + ", updated=" + this.f14320h + ", actions=" + this.f14317e + ", error code=" + this.f14318f + ", error message=" + this.f14319g + ", custom actions=" + this.f14321i + ", active item id=" + this.f14322j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f14313a);
        parcel.writeLong(this.f14314b);
        parcel.writeFloat(this.f14316d);
        parcel.writeLong(this.f14320h);
        parcel.writeLong(this.f14315c);
        parcel.writeLong(this.f14317e);
        TextUtils.writeToParcel(this.f14319g, parcel, i8);
        parcel.writeTypedList(this.f14321i);
        parcel.writeLong(this.f14322j);
        parcel.writeBundle(this.f14323k);
        parcel.writeInt(this.f14318f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14325a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f14326b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14327c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f14328d;

        /* renamed from: e, reason: collision with root package name */
        private Object f14329e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i8) {
                return new CustomAction[i8];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i8, Bundle bundle) {
            this.f14325a = str;
            this.f14326b = charSequence;
            this.f14327c = i8;
            this.f14328d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(e.a.a(obj), e.a.d(obj), e.a.c(obj), e.a.b(obj));
                customAction.f14329e = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f14326b) + ", mIcon=" + this.f14327c + ", mExtras=" + this.f14328d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f14325a);
            TextUtils.writeToParcel(this.f14326b, parcel, i8);
            parcel.writeInt(this.f14327c);
            parcel.writeBundle(this.f14328d);
        }

        CustomAction(Parcel parcel) {
            this.f14325a = parcel.readString();
            this.f14326b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14327c = parcel.readInt();
            this.f14328d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f14313a = parcel.readInt();
        this.f14314b = parcel.readLong();
        this.f14316d = parcel.readFloat();
        this.f14320h = parcel.readLong();
        this.f14315c = parcel.readLong();
        this.f14317e = parcel.readLong();
        this.f14319g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14321i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f14322j = parcel.readLong();
        this.f14323k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f14318f = parcel.readInt();
    }
}
