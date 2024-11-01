package androidx.navigation;

import R5.AbstractC1428l;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;
import l6.n;

/* loaded from: classes3.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final Companion Companion = new Companion(null);
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int parseInt;
            AbstractC3292y.i(value, "value");
            if (n.B(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, AbstractC3335a.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(Bundle bundle, String key, int i8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putInt(key, i8);
        }
    };
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "reference";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            int parseInt;
            AbstractC3292y.i(value, "value");
            if (n.B(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, AbstractC3335a.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(Bundle bundle, String key, @AnyRes int i8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putInt(key, i8);
        }
    };
    public static final NavType<int[]> IntArrayType = new NavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        public int[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, int[] iArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return new int[]{NavType.IntType.parseValue(value).intValue()};
        }

        @Override // androidx.navigation.NavType
        public int[] parseValue(String value, int[] iArr) {
            int[] B8;
            AbstractC3292y.i(value, "value");
            return (iArr == null || (B8 = AbstractC1428l.B(iArr, parseValue(value))) == null) ? parseValue(value) : B8;
        }
    };
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l8) {
            put(bundle, str, l8.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            String str;
            long parseLong;
            AbstractC3292y.i(value, "value");
            if (n.r(value, "L", false, 2, null)) {
                str = value.substring(0, value.length() - 1);
                AbstractC3292y.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            if (n.B(value, "0x", false, 2, null)) {
                String substring = str.substring(2);
                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                parseLong = Long.parseLong(substring, AbstractC3335a.a(16));
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void put(Bundle bundle, String key, long j8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putLong(key, j8);
        }
    };
    public static final NavType<long[]> LongArrayType = new NavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        public long[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, long[] jArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return new long[]{NavType.LongType.parseValue(value).longValue()};
        }

        @Override // androidx.navigation.NavType
        public long[] parseValue(String value, long[] jArr) {
            long[] C8;
            AbstractC3292y.i(value, "value");
            return (jArr == null || (C8 = AbstractC1428l.C(jArr, parseValue(value))) == null) ? parseValue(value) : C8;
        }
    };
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_FLOAT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f8) {
            put(bundle, str, f8.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            Object obj = bundle.get(key);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void put(Bundle bundle, String key, float f8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putFloat(key, f8);
        }
    };
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        public float[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, float[] fArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return new float[]{NavType.FloatType.parseValue(value).floatValue()};
        }

        @Override // androidx.navigation.NavType
        public float[] parseValue(String value, float[] fArr) {
            float[] z8;
            AbstractC3292y.i(value, "value");
            return (fArr == null || (z8 = AbstractC1428l.z(fArr, parseValue(value))) == null) ? parseValue(value) : z8;
        }
    };
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_BOOLEAN;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (Boolean) bundle.get(key);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            boolean z8;
            AbstractC3292y.i(value, "value");
            if (AbstractC3292y.d(value, "true")) {
                z8 = true;
            } else {
                if (!AbstractC3292y.d(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }

        public void put(Bundle bundle, String key, boolean z8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putBoolean(key, z8);
        }
    };
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        public boolean[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, boolean[] zArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return new boolean[]{NavType.BoolType.parseValue(value).booleanValue()};
        }

        @Override // androidx.navigation.NavType
        public boolean[] parseValue(String value, boolean[] zArr) {
            boolean[] F8;
            AbstractC3292y.i(value, "value");
            return (zArr == null || (F8 = AbstractC1428l.F(zArr, parseValue(value))) == null) ? parseValue(value) : F8;
        }
    };
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            AbstractC3292y.i(value, "value");
            if (AbstractC3292y.d(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String str) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String str) {
            String encode = str != null ? Uri.encode(str) : null;
            return encode == null ? "null" : encode;
        }
    };
    public static final NavType<String[]> StringArrayType = new NavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] strArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value, String[] strArr) {
            String[] strArr2;
            AbstractC3292y.i(value, "value");
            return (strArr == null || (strArr2 = (String[]) AbstractC1428l.E(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
        }
    };

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public NavType<?> fromArgType(String str, String str2) {
            String str3;
            NavType<Integer> navType = NavType.IntType;
            if (AbstractC3292y.d(navType.getName(), str)) {
                return navType;
            }
            NavType navType2 = NavType.IntArrayType;
            if (AbstractC3292y.d(navType2.getName(), str)) {
                return navType2;
            }
            NavType<Long> navType3 = NavType.LongType;
            if (AbstractC3292y.d(navType3.getName(), str)) {
                return navType3;
            }
            NavType navType4 = NavType.LongArrayType;
            if (AbstractC3292y.d(navType4.getName(), str)) {
                return navType4;
            }
            NavType<Boolean> navType5 = NavType.BoolType;
            if (AbstractC3292y.d(navType5.getName(), str)) {
                return navType5;
            }
            NavType navType6 = NavType.BoolArrayType;
            if (AbstractC3292y.d(navType6.getName(), str)) {
                return navType6;
            }
            NavType<String> navType7 = NavType.StringType;
            if (AbstractC3292y.d(navType7.getName(), str)) {
                return navType7;
            }
            NavType navType8 = NavType.StringArrayType;
            if (AbstractC3292y.d(navType8.getName(), str)) {
                return navType8;
            }
            NavType<Float> navType9 = NavType.FloatType;
            if (AbstractC3292y.d(navType9.getName(), str)) {
                return navType9;
            }
            NavType navType10 = NavType.FloatArrayType;
            if (AbstractC3292y.d(navType10.getName(), str)) {
                return navType10;
            }
            NavType<Integer> navType11 = NavType.ReferenceType;
            if (AbstractC3292y.d(navType11.getName(), str)) {
                return navType11;
            }
            if (str != null && str.length() != 0) {
                try {
                    if (n.B(str, ".", false, 2, null) && str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    if (n.r(str, "[]", false, 2, null)) {
                        str3 = str3.substring(0, str3.length() - 2);
                        AbstractC3292y.h(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            AbstractC3292y.g(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            return new ParcelableArrayType(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            AbstractC3292y.g(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new SerializableArrayType(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            AbstractC3292y.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                            return new ParcelableType(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            AbstractC3292y.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                            return new EnumType(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            AbstractC3292y.g(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new SerializableType(cls2);
                        }
                    }
                    throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e8) {
                    throw new RuntimeException(e8);
                }
            }
            return navType7;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValue(String value) {
            AbstractC3292y.i(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType<Integer> navType = NavType.IntType;
                            navType.parseValue(value);
                            AbstractC3292y.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType<Float> navType2 = NavType.FloatType;
                            navType2.parseValue(value);
                            AbstractC3292y.g(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        NavType<String> navType3 = NavType.StringType;
                        AbstractC3292y.g(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType3;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType<Long> navType4 = NavType.LongType;
                    navType4.parseValue(value);
                    AbstractC3292y.g(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType4;
                }
            } catch (IllegalArgumentException unused4) {
                NavType<Boolean> navType5 = NavType.BoolType;
                navType5.parseValue(value);
                AbstractC3292y.g(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValueType(Object obj) {
            NavType<Object> serializableType;
            if (obj instanceof Integer) {
                NavType<Integer> navType = NavType.IntType;
                AbstractC3292y.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            if (obj instanceof int[]) {
                NavType<int[]> navType2 = NavType.IntArrayType;
                AbstractC3292y.g(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            }
            if (obj instanceof Long) {
                NavType<Long> navType3 = NavType.LongType;
                AbstractC3292y.g(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            }
            if (obj instanceof long[]) {
                NavType<long[]> navType4 = NavType.LongArrayType;
                AbstractC3292y.g(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
            if (obj instanceof Float) {
                NavType<Float> navType5 = NavType.FloatType;
                AbstractC3292y.g(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
            if (obj instanceof float[]) {
                NavType<float[]> navType6 = NavType.FloatArrayType;
                AbstractC3292y.g(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            }
            if (obj instanceof Boolean) {
                NavType<Boolean> navType7 = NavType.BoolType;
                AbstractC3292y.g(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            }
            if (obj instanceof boolean[]) {
                NavType<boolean[]> navType8 = NavType.BoolArrayType;
                AbstractC3292y.g(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            }
            if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    NavType<String[]> navType9 = NavType.StringArrayType;
                    AbstractC3292y.g(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType9;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    AbstractC3292y.f(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        AbstractC3292y.g(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        serializableType = new ParcelableArrayType<>(componentType2);
                        return serializableType;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    AbstractC3292y.f(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        AbstractC3292y.g(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        serializableType = new SerializableArrayType<>(componentType4);
                        return serializableType;
                    }
                }
                if (obj instanceof Parcelable) {
                    serializableType = new ParcelableType<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    serializableType = new EnumType<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    serializableType = new SerializableType<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return serializableType;
            }
            NavType<String> navType10 = NavType.StringType;
            AbstractC3292y.g(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType10;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> type) {
            super(true);
            AbstractC3292y.i(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    AbstractC3292y.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.arrayType = cls;
                    return;
                } catch (ClassNotFoundException e8) {
                    throw new RuntimeException(e8);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AbstractC3292y.d(ParcelableArrayType.class, obj.getClass())) {
                return AbstractC3292y.d(this.arrayType, ((ParcelableArrayType) obj).arrayType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            AbstractC3292y.h(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> type) {
            super(true);
            AbstractC3292y.i(type, "type");
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
            }
            this.type = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AbstractC3292y.d(ParcelableType.class, obj.getClass())) {
                return AbstractC3292y.d(this.type, ((ParcelableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC3292y.h(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC3292y.i(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D d8) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            this.type.cast(d8);
            if (d8 != null && !(d8 instanceof Parcelable)) {
                if (d8 instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d8);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> type) {
            super(true);
            AbstractC3292y.i(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    AbstractC3292y.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.arrayType = cls;
                    return;
                } catch (ClassNotFoundException e8) {
                    throw new RuntimeException(e8);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AbstractC3292y.d(SerializableArrayType.class, obj.getClass())) {
                return AbstractC3292y.d(this.arrayType, ((SerializableArrayType) obj).arrayType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            AbstractC3292y.h(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            AbstractC3292y.i(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(key, dArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> type) {
            super(true);
            AbstractC3292y.i(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                if (true ^ type.isEnum()) {
                    this.type = type;
                    return;
                }
                throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return AbstractC3292y.d(this.type, ((SerializableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC3292y.h(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC3292y.i(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D value) {
            AbstractC3292y.i(bundle, "bundle");
            AbstractC3292y.i(key, "key");
            AbstractC3292y.i(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z8, Class<D> type) {
            super(z8);
            AbstractC3292y.i(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z8) {
        this.isNullableAllowed = z8;
    }

    public static NavType<?> fromArgType(String str, String str2) {
        return b.a(Companion, str, str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValue(String str) {
        return Companion.inferFromValue(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValueType(Object obj) {
        return Companion.inferFromValueType(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String value) {
        AbstractC3292y.i(bundle, "bundle");
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(value, "value");
        T parseValue = parseValue(value);
        put(bundle, key, parseValue);
        return parseValue;
    }

    public abstract T parseValue(String str);

    public T parseValue(String value, T t8) {
        AbstractC3292y.i(value, "value");
        return parseValue(value);
    }

    public abstract void put(Bundle bundle, String str, T t8);

    public String serializeAsValue(T t8) {
        return String.valueOf(t8);
    }

    public String toString() {
        return getName();
    }

    /* loaded from: classes3.dex */
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> type) {
            super(false, type);
            AbstractC3292y.i(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC3292y.h(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public D parseValue(String value) {
            D d8;
            AbstractC3292y.i(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC3292y.h(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    d8 = null;
                    break;
                }
                d8 = enumConstants[i8];
                if (n.s(d8.name(), value, true)) {
                    break;
                }
                i8++;
            }
            D d9 = d8;
            if (d9 != null) {
                return d9;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String str, T t8) {
        AbstractC3292y.i(bundle, "bundle");
        AbstractC3292y.i(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t8;
        }
        T parseValue = parseValue(str, t8);
        put(bundle, key, parseValue);
        return parseValue;
    }
}
