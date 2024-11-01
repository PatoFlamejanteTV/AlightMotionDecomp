package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http.HttpDate;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class Headers {
    private final String[] namesAndValues;

    Headers(Builder builder) {
        List<String> list = builder.namesAndValues;
        this.namesAndValues = (String[]) list.toArray(new String[list.size()]);
    }

    static void checkName(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = str.charAt(i8);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    static void checkValue(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = str.charAt(i8);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    public static Headers of(String... strArr) {
        if (strArr != null) {
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                for (int i8 = 0; i8 < strArr2.length; i8++) {
                    String str = strArr2[i8];
                    if (str != null) {
                        strArr2[i8] = str.trim();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                for (int i9 = 0; i9 < strArr2.length; i9 += 2) {
                    String str2 = strArr2[i9];
                    String str3 = strArr2[i9 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                }
                return new Headers(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        throw new NullPointerException("namesAndValues == null");
    }

    public long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            length += this.namesAndValues[i8].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(((Headers) obj).namesAndValues, this.namesAndValues)) {
            return true;
        }
        return false;
    }

    public String get(String str) {
        return get(this.namesAndValues, str);
    }

    public Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return HttpDate.parse(str2);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public String name(int i8) {
        return this.namesAndValues[i8 * 2];
    }

    public Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            treeSet.add(name(i8));
        }
        return DesugarCollections.unmodifiableSet(treeSet);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, this.namesAndValues);
        return builder;
    }

    public int size() {
        return this.namesAndValues.length / 2;
    }

    public Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            String lowerCase = name(i8).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i8));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(name(i8));
            sb.append(": ");
            sb.append(value(i8));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String value(int i8) {
        return this.namesAndValues[(i8 * 2) + 1];
    }

    public List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equalsIgnoreCase(name(i8))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i8));
            }
        }
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        final List<String> namesAndValues = new ArrayList(20);

        public Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i8 = 0; i8 < size; i8++) {
                addLenient(headers.name(i8), headers.value(i8));
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addLenient(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return addLenient(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return addLenient("", str.substring(1));
            }
            return addLenient("", str);
        }

        public Builder addUnsafeNonAscii(String str, String str2) {
            Headers.checkName(str);
            return addLenient(str, str2);
        }

        public Headers build() {
            return new Headers(this);
        }

        public String get(String str) {
            for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
            }
            return null;
        }

        public Builder removeAll(String str) {
            int i8 = 0;
            while (i8 < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i8))) {
                    this.namesAndValues.remove(i8);
                    this.namesAndValues.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public Builder set(String str, Date date) {
            if (date != null) {
                set(str, HttpDate.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public Builder set(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            removeAll(str);
            addLenient(str, str2);
            return this;
        }

        public Builder add(String str, String str2) {
            Headers.checkName(str);
            Headers.checkValue(str2, str);
            return addLenient(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder addLenient(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(str2.trim());
            return this;
        }

        public Builder add(String str, Date date) {
            if (date != null) {
                add(str, HttpDate.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }
    }

    private static String get(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static Headers of(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[map.size() * 2];
            int i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    String trim = entry.getKey().trim();
                    String trim2 = entry.getValue().trim();
                    checkName(trim);
                    checkValue(trim2, trim);
                    strArr[i8] = trim;
                    strArr[i8 + 1] = trim2;
                    i8 += 2;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            return new Headers(strArr);
        }
        throw new NullPointerException("headers == null");
    }
}
