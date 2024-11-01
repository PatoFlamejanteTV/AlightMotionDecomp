package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.Challenge;
import com.mbridge.msdk.thrid.okhttp.Cookie;
import com.mbridge.msdk.thrid.okhttp.CookieJar;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.HttpUrl;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS = ByteString.encodeUtf8("\"\\");
    private static final ByteString TOKEN_DELIMITERS = ByteString.encodeUtf8("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007d, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseChallengeHeader(java.util.List<com.mbridge.msdk.thrid.okhttp.Challenge> r8, com.mbridge.msdk.thrid.okio.Buffer r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipWhitespaceAndCommas(r9)
            java.lang.String r1 = readToken(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipWhitespaceAndCommas(r9)
            java.lang.String r3 = readToken(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.exhausted()
            if (r9 != 0) goto L1f
            return
        L1f:
            com.mbridge.msdk.thrid.okhttp.Challenge r9 = new com.mbridge.msdk.thrid.okhttp.Challenge
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = skipAll(r9, r4)
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r2 != 0) goto L60
            if (r6 != 0) goto L40
            boolean r2 = r9.exhausted()
            if (r2 == 0) goto L60
        L40:
            com.mbridge.msdk.thrid.okhttp.Challenge r2 = new com.mbridge.msdk.thrid.okhttp.Challenge
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = repeat(r4, r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L60:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = skipAll(r9, r4)
            int r5 = r5 + r6
        L6a:
            if (r3 != 0) goto L7b
            java.lang.String r3 = readToken(r9)
            boolean r5 = skipWhitespaceAndCommas(r9)
            if (r5 == 0) goto L77
            goto L7d
        L77:
            int r5 = skipAll(r9, r4)
        L7b:
            if (r5 != 0) goto L88
        L7d:
            com.mbridge.msdk.thrid.okhttp.Challenge r4 = new com.mbridge.msdk.thrid.okhttp.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L88:
            r6 = 1
            if (r5 <= r6) goto L8c
            return
        L8c:
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r6 == 0) goto L93
            return
        L93:
            boolean r6 = r9.exhausted()
            if (r6 != 0) goto La8
            r6 = 0
            byte r6 = r9.getByte(r6)
            r7 = 34
            if (r6 != r7) goto La8
            java.lang.String r6 = readQuotedString(r9)
            goto Lac
        La8:
            java.lang.String r6 = readToken(r9)
        Lac:
            if (r6 != 0) goto Laf
            return
        Laf:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = skipWhitespaceAndCommas(r9)
            if (r3 != 0) goto Lc5
            boolean r3 = r9.exhausted()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, com.mbridge.msdk.thrid.okio.Buffer):void");
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < headers.size(); i8++) {
            if (str.equalsIgnoreCase(headers.name(i8))) {
                parseChallengeHeader(arrayList, new Buffer().writeUtf8(headers.value(i8)));
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i8) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    private static String readQuotedString(Buffer buffer) {
        if (buffer.readByte() == 34) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long indexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
                if (indexOfElement == -1) {
                    return null;
                }
                if (buffer.getByte(indexOfElement) == 34) {
                    buffer2.write(buffer, indexOfElement);
                    buffer.readByte();
                    return buffer2.readUtf8();
                }
                if (buffer.size() == indexOfElement + 1) {
                    return null;
                }
                buffer2.write(buffer, indexOfElement);
                buffer.readByte();
                buffer2.write(buffer, 1L);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String readToken(Buffer buffer) {
        try {
            long indexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
            if (indexOfElement == -1) {
                indexOfElement = buffer.size();
            }
            if (indexOfElement != 0) {
                return buffer.readUtf8(indexOfElement);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static String repeat(char c8, int i8) {
        char[] cArr = new char[i8];
        Arrays.fill(cArr, c8);
        return new String(cArr);
    }

    private static int skipAll(Buffer buffer, byte b9) {
        int i8 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b9) {
            i8++;
            buffer.readByte();
        }
        return i8;
    }

    public static int skipUntil(String str, int i8, String str2) {
        while (i8 < str.length() && str2.indexOf(str.charAt(i8)) == -1) {
            i8++;
        }
        return i8;
    }

    public static int skipWhitespace(String str, int i8) {
        char charAt;
        while (i8 < str.length() && ((charAt = str.charAt(i8)) == ' ' || charAt == '\t')) {
            i8++;
        }
        return i8;
    }

    private static boolean skipWhitespaceAndCommas(Buffer buffer) {
        boolean z8 = false;
        while (!buffer.exhausted()) {
            byte b9 = buffer.getByte(0L);
            if (b9 == 44) {
                buffer.readByte();
                z8 = true;
            } else {
                if (b9 != 32 && b9 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z8;
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i8 = 0; i8 < size; i8++) {
            if ("Vary".equalsIgnoreCase(headers.name(i8))) {
                String value = headers.value(i8);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i8 = 0; i8 < size; i8++) {
            String name = headers.name(i8);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i8));
            }
        }
        return builder.build();
    }
}
