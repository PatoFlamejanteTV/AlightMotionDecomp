package R;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class b {

    /* loaded from: classes3.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(Parcel parcel, int i8, int i9) {
        int w8 = w(parcel, i8);
        if (w8 == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + w8 + " (0x" + Integer.toHexString(w8) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w8);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w8);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w8);
        return createIntArray;
    }

    public static ArrayList d(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w8);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i8, Parcelable.Creator creator) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w8);
        return parcelable;
    }

    public static String f(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w8);
        return readString;
    }

    public static String[] g(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w8);
        return createStringArray;
    }

    public static ArrayList h(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w8);
        return createStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i8, Parcelable.Creator creator) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w8);
        return createTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i8, Parcelable.Creator creator) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w8);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i8) {
        if (parcel.dataPosition() == i8) {
            return;
        }
        throw new a("Overread allowed size end=" + i8, parcel);
    }

    public static int l(int i8) {
        return (char) i8;
    }

    public static boolean m(Parcel parcel, int i8) {
        A(parcel, i8, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean n(Parcel parcel, int i8) {
        boolean z8;
        int w8 = w(parcel, i8);
        if (w8 == 0) {
            return null;
        }
        z(parcel, i8, w8, 4);
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    public static double o(Parcel parcel, int i8) {
        A(parcel, i8, 8);
        return parcel.readDouble();
    }

    public static Double p(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        if (w8 == 0) {
            return null;
        }
        z(parcel, i8, w8, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float q(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        if (w8 == 0) {
            return null;
        }
        z(parcel, i8, w8, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (w8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w8);
        return readStrongBinder;
    }

    public static int t(Parcel parcel, int i8) {
        A(parcel, i8, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i8) {
        A(parcel, i8, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i8) {
        int w8 = w(parcel, i8);
        if (w8 == 0) {
            return null;
        }
        z(parcel, i8, w8, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i8) {
        if ((i8 & SupportMenu.CATEGORY_MASK) != -65536) {
            return (char) (i8 >> 16);
        }
        return parcel.readInt();
    }

    public static void x(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i8));
    }

    public static int y(Parcel parcel) {
        int r8 = r(parcel);
        int w8 = w(parcel, r8);
        int l8 = l(r8);
        int dataPosition = parcel.dataPosition();
        if (l8 == 20293) {
            int i8 = w8 + dataPosition;
            if (i8 >= dataPosition && i8 <= parcel.dataSize()) {
                return i8;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i8, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r8))), parcel);
    }

    private static void z(Parcel parcel, int i8, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        throw new a("Expected size " + i10 + " got " + i9 + " (0x" + Integer.toHexString(i9) + ")", parcel);
    }
}
