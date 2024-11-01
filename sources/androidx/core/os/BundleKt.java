package androidx.core.os;

import Q5.r;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class BundleKt {
    public static final Bundle bundleOf(r... rVarArr) {
        Bundle bundle = new Bundle(rVarArr.length);
        for (r rVar : rVarArr) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 == null) {
                bundle.putString(str, null);
            } else if (b9 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b9).booleanValue());
            } else if (b9 instanceof Byte) {
                bundle.putByte(str, ((Number) b9).byteValue());
            } else if (b9 instanceof Character) {
                bundle.putChar(str, ((Character) b9).charValue());
            } else if (b9 instanceof Double) {
                bundle.putDouble(str, ((Number) b9).doubleValue());
            } else if (b9 instanceof Float) {
                bundle.putFloat(str, ((Number) b9).floatValue());
            } else if (b9 instanceof Integer) {
                bundle.putInt(str, ((Number) b9).intValue());
            } else if (b9 instanceof Long) {
                bundle.putLong(str, ((Number) b9).longValue());
            } else if (b9 instanceof Short) {
                bundle.putShort(str, ((Number) b9).shortValue());
            } else if (b9 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b9);
            } else if (b9 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b9);
            } else if (b9 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b9);
            } else if (b9 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b9);
            } else if (b9 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b9);
            } else if (b9 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b9);
            } else if (b9 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b9);
            } else if (b9 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b9);
            } else if (b9 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b9);
            } else if (b9 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b9);
            } else if (b9 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b9);
            } else if (b9 instanceof Object[]) {
                Class<?> componentType = b9.getClass().getComponentType();
                AbstractC3292y.f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC3292y.g(b9, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) b9);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC3292y.g(b9, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) b9);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC3292y.g(b9, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) b9);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b9);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (b9 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b9);
            } else if (b9 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b9);
            } else if (b9 instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, str, (Size) b9);
            } else if (b9 instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, str, (SizeF) b9);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b9.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
