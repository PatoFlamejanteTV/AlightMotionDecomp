package R;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(Parcel parcel, int i8) {
        w(parcel, i8);
    }

    public static void c(Parcel parcel, int i8, boolean z8) {
        x(parcel, i8, 4);
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i8, Boolean bool, boolean z8) {
        if (bool == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            x(parcel, i8, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void e(Parcel parcel, int i8, Bundle bundle, boolean z8) {
        if (bundle == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeBundle(bundle);
            w(parcel, v8);
        }
    }

    public static void f(Parcel parcel, int i8, byte[] bArr, boolean z8) {
        if (bArr == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeByteArray(bArr);
            w(parcel, v8);
        }
    }

    public static void g(Parcel parcel, int i8, double d8) {
        x(parcel, i8, 8);
        parcel.writeDouble(d8);
    }

    public static void h(Parcel parcel, int i8, Double d8, boolean z8) {
        if (d8 == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            x(parcel, i8, 8);
            parcel.writeDouble(d8.doubleValue());
        }
    }

    public static void i(Parcel parcel, int i8, Float f8, boolean z8) {
        if (f8 == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            x(parcel, i8, 4);
            parcel.writeFloat(f8.floatValue());
        }
    }

    public static void j(Parcel parcel, int i8, IBinder iBinder, boolean z8) {
        if (iBinder == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            w(parcel, v8);
        }
    }

    public static void k(Parcel parcel, int i8, int i9) {
        x(parcel, i8, 4);
        parcel.writeInt(i9);
    }

    public static void l(Parcel parcel, int i8, int[] iArr, boolean z8) {
        if (iArr == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeIntArray(iArr);
            w(parcel, v8);
        }
    }

    public static void m(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int v8 = v(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeInt(((Integer) list.get(i9)).intValue());
        }
        w(parcel, v8);
    }

    public static void n(Parcel parcel, int i8, long j8) {
        x(parcel, i8, 8);
        parcel.writeLong(j8);
    }

    public static void o(Parcel parcel, int i8, Long l8, boolean z8) {
        if (l8 == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            x(parcel, i8, 8);
            parcel.writeLong(l8.longValue());
        }
    }

    public static void p(Parcel parcel, int i8, Parcelable parcelable, int i9, boolean z8) {
        if (parcelable == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            w(parcel, v8);
        }
    }

    public static void q(Parcel parcel, int i8, String str, boolean z8) {
        if (str == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeString(str);
            w(parcel, v8);
        }
    }

    public static void r(Parcel parcel, int i8, String[] strArr, boolean z8) {
        if (strArr == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeStringArray(strArr);
            w(parcel, v8);
        }
    }

    public static void s(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                x(parcel, i8, 0);
            }
        } else {
            int v8 = v(parcel, i8);
            parcel.writeStringList(list);
            w(parcel, v8);
        }
    }

    public static void t(Parcel parcel, int i8, Parcelable[] parcelableArr, int i9, boolean z8) {
        if (parcelableArr == null) {
            if (z8) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int v8 = v(parcel, i8);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, i9);
            }
        }
        w(parcel, v8);
    }

    public static void u(Parcel parcel, int i8, List list, boolean z8) {
        if (list == null) {
            if (z8) {
                x(parcel, i8, 0);
                return;
            }
            return;
        }
        int v8 = v(parcel, i8);
        int size = list.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            Parcelable parcelable = (Parcelable) list.get(i9);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, parcelable, 0);
            }
        }
        w(parcel, v8);
    }

    private static int v(Parcel parcel, int i8) {
        parcel.writeInt(i8 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void w(Parcel parcel, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(dataPosition - i8);
        parcel.setDataPosition(dataPosition);
    }

    private static void x(Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | (i9 << 16));
    }

    private static void y(Parcel parcel, Parcelable parcelable, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
