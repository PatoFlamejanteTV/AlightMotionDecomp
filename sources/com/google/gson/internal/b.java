package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f18814a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f18815a;

        public a(Type type) {
            Objects.requireNonNull(type);
            this.f18815a = b.b(type);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f18815a;
        }

        public int hashCode() {
            return this.f18815a.hashCode();
        }

        public String toString() {
            return b.t(this.f18815a) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0383b implements ParameterizedType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f18816a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f18817b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f18818c;

        public C0383b(Type type, Type type2, Type... typeArr) {
            Type b9;
            boolean z8;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z9 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (type == null && !z8) {
                    z9 = false;
                }
                com.google.gson.internal.a.a(z9);
            }
            if (type == null) {
                b9 = null;
            } else {
                b9 = b.b(type);
            }
            this.f18816a = b9;
            this.f18817b = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f18818c = typeArr2;
            int length = typeArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                Objects.requireNonNull(this.f18818c[i8]);
                b.c(this.f18818c[i8]);
                Type[] typeArr3 = this.f18818c;
                typeArr3[i8] = b.b(typeArr3[i8]);
            }
        }

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f18818c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f18816a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f18817b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f18818c) ^ this.f18817b.hashCode()) ^ a(this.f18816a);
        }

        public String toString() {
            int length = this.f18818c.length;
            if (length == 0) {
                return b.t(this.f18817b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.t(this.f18817b));
            sb.append("<");
            sb.append(b.t(this.f18818c[0]));
            for (int i8 = 1; i8 < length; i8++) {
                sb.append(", ");
                sb.append(b.t(this.f18818c[i8]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f18819a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f18820b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z8;
            boolean z9;
            if (typeArr2.length <= 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            com.google.gson.internal.a.a(z8);
            if (typeArr.length == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            com.google.gson.internal.a.a(z9);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                b.c(typeArr2[0]);
                com.google.gson.internal.a.a(typeArr[0] == Object.class);
                this.f18820b = b.b(typeArr2[0]);
                this.f18819a = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            b.c(typeArr[0]);
            this.f18820b = null;
            this.f18819a = b.b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && b.f(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f18820b;
            if (type != null) {
                return new Type[]{type};
            }
            return b.f18814a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f18819a};
        }

        public int hashCode() {
            int i8;
            Type type = this.f18820b;
            if (type != null) {
                i8 = type.hashCode() + 31;
            } else {
                i8 = 1;
            }
            return i8 ^ (this.f18819a.hashCode() + 31);
        }

        public String toString() {
            if (this.f18820b != null) {
                return "? super " + b.t(this.f18820b);
            }
            if (this.f18819a == Object.class) {
                return "?";
            }
            return "? extends " + b.t(this.f18819a);
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new a(b(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0383b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    static void c(Type type) {
        boolean z8;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z8 = false;
        } else {
            z8 = true;
        }
        com.google.gson.internal.a.a(z8);
    }

    private static Class d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class cls) {
        Type l8 = l(type, cls, Collection.class);
        if (l8 instanceof ParameterizedType) {
            return ((ParameterizedType) l8).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    private static Type i(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i8 = 0; i8 < length; i8++) {
                Class<?> cls3 = interfaces[i8];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i8];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i8], interfaces[i8], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type l8 = l(type, cls, Map.class);
        if (l8 instanceof ParameterizedType) {
            return ((ParameterizedType) l8).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Class k(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    private static Type l(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.a.a(cls2.isAssignableFrom(cls));
        return o(type, cls, i(type, cls, cls2));
    }

    private static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (obj.equals(objArr[i8])) {
                return i8;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Type type2, Type... typeArr) {
        return new C0383b(type, type2, typeArr);
    }

    public static Type o(Type type, Class cls, Type type2) {
        return p(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00df, code lost:            if (r0 == null) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e1, code lost:            r12.put(r0, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:            return r11;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type p(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.Map r12) {
        /*
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L27
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L17
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L15
            goto L16
        L15:
            r11 = r2
        L16:
            return r11
        L17:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.reflect.Type r11 = q(r9, r10, r1)
            if (r11 != r1) goto L1
            goto Ldf
        L27:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L4c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = p(r9, r10, r11, r12)
            boolean r10 = e(r11, r9)
            if (r10 == 0) goto L45
            r11 = r1
            goto Ldf
        L45:
            java.lang.reflect.GenericArrayType r9 = a(r9)
        L49:
            r11 = r9
            goto Ldf
        L4c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L67
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = p(r9, r10, r1, r12)
            boolean r10 = e(r1, r9)
            if (r10 == 0) goto L62
            goto Ldf
        L62:
            java.lang.reflect.GenericArrayType r9 = a(r9)
            goto L49
        L67:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lab
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = p(r9, r10, r1, r12)
            boolean r1 = e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L81:
            if (r2 >= r6) goto La0
            r7 = r5[r2]
            java.lang.reflect.Type r7 = p(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = e(r7, r8)
            if (r8 != 0) goto L9d
            if (r1 != 0) goto L9b
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L9b:
            r5[r2] = r7
        L9d:
            int r2 = r2 + 1
            goto L81
        La0:
            if (r1 == 0) goto Ldf
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = n(r4, r9, r5)
            goto L49
        Lab:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ldf
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto Lcb
            r3 = r1[r2]
            java.lang.reflect.Type r9 = p(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto Ldf
            java.lang.reflect.WildcardType r11 = s(r9)
            goto Ldf
        Lcb:
            int r1 = r4.length
            if (r1 != r3) goto Ldf
            r1 = r4[r2]
            java.lang.reflect.Type r9 = p(r9, r10, r1, r12)     // Catch: java.lang.Throwable -> Ldd
            r10 = r4[r2]
            if (r9 == r10) goto Ldf
            java.lang.reflect.WildcardType r11 = r(r9)
            goto Ldf
        Ldd:
            r9 = move-exception
            throw r9
        Ldf:
            if (r0 == 0) goto Le4
            r12.put(r0, r11)
        Le4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.b.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    private static Type q(Type type, Class cls, TypeVariable typeVariable) {
        Class d8 = d(typeVariable);
        if (d8 == null) {
            return typeVariable;
        }
        Type i8 = i(type, cls, d8);
        if (i8 instanceof ParameterizedType) {
            return ((ParameterizedType) i8).getActualTypeArguments()[m(d8.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static WildcardType r(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f18814a);
    }

    public static WildcardType s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String t(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
